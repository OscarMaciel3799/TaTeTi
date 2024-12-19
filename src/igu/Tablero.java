
package igu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import logica.Jugador;
import logica.TipoImagen;


public class Tablero extends JPanel{
    private int ancho;
    private int alto;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    private TipoImagen jugadorActual;
    private TipoImagen turnoPartida;
    
    private Jugador jugador1;
    private Jugador jugador2;
    
    private ArrayList<Cuadrado> cuadrados;
    private Cuadrado cuadradoFrontal;
    
    //Creamos un Constructor Tablero
    public Tablero(){
        init();
    }
    
    private void init(){
        //Se inicia con valores por defectos que luego seran reemplazados
        ancho=80;
        alto=80;
        colorTablero=Color.white;
        colorCI=Color.white;
        margen=6;
        jugador1=new Jugador();
        jugador2=new Jugador();
        
        //Instanciamos la lista que vamos a usar para referenciar los cuadrados
        cuadrados=new ArrayList();
        jugadorActual=TipoImagen.EQUIS;
        turnoPartida=TipoImagen.EQUIS;
        
    }
    
    //Creamos un metodo en cargado de crear el tablero
    public void crearTablero(){
        setLayout(null);
        setSize(ancho*3+margen*4,alto*3+margen*4);
        setBackground(colorTablero);
        cuadradoFrontal=new Cuadrado(this.getWidth(),this.getHeight(),Color.RED);
        cuadradoFrontal.setLocation(0,0);
        cuadradoFrontal.setOpaque(false);
        cuadradoFrontal.setEnabled(false);
        add(cuadradoFrontal);
        
        //llamamos al metodo para crear los cuadrados internos
        crearCuadradosInternos();
    }
    
    //Los cuadrados internos van a ser 9 paneles iguales
    // por lo que los podemos generar con 2 for anidados
    private void crearCuadradosInternos(){
        int x=margen;
        int y=margen;
        
        for(int i=0;i<3;i++){
            x=margen;
            for(int j=0;j<3;j++){
                Cuadrado cuadrado=new Cuadrado(ancho,alto,colorCI);
                
                //usamos este metodo para que nuestro mouse se combierta en manito
                //al pasar por encima de cada cuadro
                cuadrado.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadrado.setLocation(x,y);
                cuadrado.setI(i);
                cuadrado.setJ(j);
                add(cuadrado);
                cuadrados.add(cuadrado);
                
                //creamos los eventos de los cuadrados
                crearEventosCuadrados(cuadrado);
                x+=(ancho+margen);
            }
            y+=(alto+margen);
        }
    }
    
    public void crearEventosCuadrados(Cuadrado cuadrado){
        MouseListener evento=new MouseListener() {
            
            //al ser una interfaz tenemos que instanciar todos sus metodos abstractos
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                if(cuadrado.isDibujado()){
                    return;
                }
                TipoImagen tipoImagenResultado=null;
                if(jugadorActual==TipoImagen.EQUIS){
                    cuadrado.setTipoImagen(TipoImagen.EQUIS);
                    jugador1.getTablero()[cuadrado.getI()][cuadrado.getJ()]=1;
                    tipoImagenResultado=jugador1.tresEnRaya(jugador2);
                    resultado(tipoImagenResultado,TipoImagen.EQUIS);
                    jugadorActual=TipoImagen.CIRCULO;
                    cambiarEstilos(TipoImagen.CIRCULO);
                    
                }else if(jugadorActual==TipoImagen.CIRCULO){
                    cuadrado.setTipoImagen(TipoImagen.CIRCULO);
                    jugador2.getTablero()[cuadrado.getI()][cuadrado.getJ()]=1;
                    tipoImagenResultado=jugador2.tresEnRaya(jugador1);
                    resultado(tipoImagenResultado,TipoImagen.CIRCULO);
                    jugadorActual=TipoImagen.EQUIS;
                    cambiarEstilos(TipoImagen.EQUIS);
                    
                }
                cuadrado.setDibujado(true);
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        cuadrado.addMouseListener(evento);
    }
    //Evaluamos a quien corresponde el turno para "desactivar" al otro jugador
    public void cambiarEstilos(TipoImagen jugadorActual){
        if(jugadorActual==TipoImagen.CIRCULO){
            FormTaTeTi.imgPlayerEquis.setRuta(Ruta.PLAYERAUXILIAR);
            FormTaTeTi.imgPlayerEquis.repaint();
            FormTaTeTi.nombrePlayerEquis.setForeground(new Color(84, 28, 28,100));
            
            FormTaTeTi.imgPlayerCirculo.setRuta(Ruta.PLAYER2);
            FormTaTeTi.imgPlayerCirculo.repaint();
            FormTaTeTi.nombrePlayerCirculo.setForeground(new Color(42,37,42));
        }else if(jugadorActual==TipoImagen.EQUIS){
            FormTaTeTi.imgPlayerCirculo.setRuta(Ruta.PLAYERAUXILIAR);
            FormTaTeTi.imgPlayerCirculo.repaint();
            FormTaTeTi.nombrePlayerCirculo.setForeground(new Color(42,37,42,100));
            
            FormTaTeTi.imgPlayerEquis.setRuta(Ruta.PLAYER1);
            FormTaTeTi.imgPlayerEquis.repaint();
            FormTaTeTi.nombrePlayerEquis.setForeground(new Color(84, 28, 28));
        }
    }
    //este metodo se usara para cargar la imagen de "Tres en raya"
    public void resultado(TipoImagen tipoImagenResultado,TipoImagen jugadorGanador){
        if(tipoImagenResultado==TipoImagen.EMPATE){
            System.out.println("Hay un empate");
            //Instanciamos el formulario final y lo mostramos en pantalla
            FormResultado formResultado=new FormResultado(TipoImagen.EMPATE,this);
            formResultado.setVisible(true);
        }else if(tipoImagenResultado!=null){// hay un ganador
            Ruta.cambiarRutas(jugadorGanador);
            cuadradoFrontal.setTipoImagen(tipoImagenResultado);
            desactivarCuadrados(true);
            //Instanciamos el formulario final y lo mostramos en pantalla
            FormResultado formResultado=new FormResultado(jugadorGanador,this);
            formResultado.setVisible(true);
            
        }
        
    }
    public void reiniciarTablero(TipoImagen ganador){
        desactivarCuadrados(false);
        borrarImagenes();
        cuadradoFrontal.setTipoImagen(null);
        if(ganador==TipoImagen.EQUIS){
            int puntajeNuevo=Integer.parseInt(FormTaTeTi.puntajeEquis.getText())+1;
            FormTaTeTi.puntajeEquis.setText(String.valueOf(puntajeNuevo));
        }else if(ganador==TipoImagen.CIRCULO){
            int puntajeNuevo=Integer.parseInt(FormTaTeTi.puntajeCirculo.getText())+1;
            FormTaTeTi.puntajeCirculo.setText(String.valueOf(puntajeNuevo));
        }
        if(turnoPartida==TipoImagen.EQUIS){
            jugadorActual=TipoImagen.CIRCULO;
            turnoPartida=TipoImagen.CIRCULO;
        }else if(turnoPartida==TipoImagen.CIRCULO){
            jugadorActual=TipoImagen.EQUIS;
            turnoPartida=TipoImagen.EQUIS;
        }
        cambiarEstilos(jugadorActual);
        jugador1.limpiar();
        jugador2.limpiar();
        repaint();
        
        
    }
    public void desactivarCuadrados(boolean valor){
        for(Cuadrado cuadrado: cuadrados){
            cuadrado.setDibujado(valor);
        }
    }
    
    public void borrarImagenes(){
        for(Cuadrado cuadrado:cuadrados){
            cuadrado.setTipoImagen(null);
        }
    }
    public TipoImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    
    
    public ArrayList<Cuadrado> getCuadrados() {
        return cuadrados;
    }

    public void setCuadrados(ArrayList<Cuadrado> cuadrados) {
        this.cuadrados = cuadrados;
    }
    
    
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    
}
