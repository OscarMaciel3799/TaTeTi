
package igu;

import java.awt.Color;
import javax.swing.JLabel;
import logica.Jugador;
import logica.TipoImagen;


public class FormTaTeTi extends javax.swing.JFrame {
    
    public static Imagen imgPlayerEquis;
    public static Imagen imgPlayerCirculo;
    public static JLabel nombrePlayerEquis;
    public static JLabel nombrePlayerCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;
    
    //creamos los atributos para poder usarlos como parametros
    private Jugador jugador1;
    private Jugador jugador2;
    
    private Tablero tablero;
    
    
    
    public FormTaTeTi(Jugador jugador1,Jugador jugador2) {
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        init();
        imgPlayerEquis=imgJugadorEquis;
        imgPlayerCirculo=imgJugadorCirculo;
        nombrePlayerEquis=lblNameP1;
        nombrePlayerCirculo=lblNameP2;
        puntajeEquis=lblPuntajeP1;
        puntajeCirculo=lblPuntajeP2;
        
        tablero.cambiarEstilos(TipoImagen.EQUIS);
    }
    
    //Metodo para iniciar el form
    public void init(){
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        //Asignamos los nombres escritos en la primer pantalla
        //a la segunda pantalla
        lblNameP1.setText(jugador1.getNombre());
        lblNameP2.setText(jugador2.getNombre());
        
        //Instanciamos el tablero para definirlo y crearlo
        tablero=new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAlto(100);
        tablero.setAncho(100);
        tablero.setMargen(5);
        tablero.setColorCI((new Color(102,165,173)));
        tablero.setColorTablero(new Color(0, 59, 70));
        tablero.setLocation(40,150);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        imgJugadorEquis = new igu.Imagen();
        imgJugadorCirculo = new igu.Imagen();
        lblNameP1 = new javax.swing.JLabel();
        lblNameP2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuntajeP1 = new javax.swing.JLabel();
        lblPuntajeP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(102, 165, 173));
        panelFondo.setForeground(new java.awt.Color(196, 223, 230));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        imgJugadorEquis.setText("imagen1");
        imgJugadorEquis.setRuta("/recursos/jugadorEquis.png");
        panelFondo.add(imgJugadorEquis);
        imgJugadorEquis.setBounds(75, 50, 50, 50);

        imgJugadorCirculo.setText("imagen1");
        imgJugadorCirculo.setRuta("/recursos/jugadorCirculo.png");
        panelFondo.add(imgJugadorCirculo);
        imgJugadorCirculo.setBounds(275, 50, 50, 50);

        lblNameP1.setBackground(new java.awt.Color(0, 0, 0));
        lblNameP1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblNameP1.setForeground(new java.awt.Color(0, 0, 0));
        lblNameP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP1.setText("PLAYER1");
        panelFondo.add(lblNameP1);
        lblNameP1.setBounds(55, 100, 90, 30);

        lblNameP2.setBackground(new java.awt.Color(42, 37, 42));
        lblNameP2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblNameP2.setForeground(new java.awt.Color(0, 0, 0));
        lblNameP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP2.setText("PLAYER2");
        panelFondo.add(lblNameP2);
        lblNameP2.setBounds(255, 100, 90, 30);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 87, 91));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(190, 50, 20, 60);

        lblPuntajeP1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        lblPuntajeP1.setForeground(new java.awt.Color(7, 87, 91));
        lblPuntajeP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeP1.setText("0");
        panelFondo.add(lblPuntajeP1);
        lblPuntajeP1.setBounds(130, 50, 60, 60);

        lblPuntajeP2.setBackground(new java.awt.Color(7, 87, 91));
        lblPuntajeP2.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        lblPuntajeP2.setForeground(new java.awt.Color(7, 87, 91));
        lblPuntajeP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeP2.setText("0");
        panelFondo.add(lblPuntajeP2);
        lblPuntajeP2.setBounds(210, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.Imagen imgJugadorCirculo;
    private igu.Imagen imgJugadorEquis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNameP1;
    private javax.swing.JLabel lblNameP2;
    private javax.swing.JLabel lblPuntajeP1;
    private javax.swing.JLabel lblPuntajeP2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
