
package logica;


//Creamos una clase para los jugadores
public class Jugador {
    private String nombre;
    private TipoImagen tipoImagen;
    private int tablero[][];
    
    
    //Creamos los Constructores
    public Jugador(){
    tablero=new int[3][3];
    limpiar();
    }
    public Jugador(TipoImagen tipoImagen){
    this.tipoImagen=tipoImagen;
    tablero=new int[3][3];
    limpiar();
    }
    public Jugador(String nombre,TipoImagen tipoImagen){
    this.tipoImagen=tipoImagen;
    this.nombre=nombre;
    tablero=new int[3][3];
    limpiar();
    }
    
    public void limpiar(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j]=0;
            }
        }
    }
    
    //Ingresamos las convinaciones en las que se puede ganar
    public TipoImagen tresEnRaya(Jugador jugadorRival){
        if(tablero[0][0]==1&&tablero[0][1]==1&&tablero[0][2]==1){
            return TipoImagen.LINEA1;
        }
        if(tablero[1][0]==1&&tablero[1][1]==1&&tablero[1][2]==1){
            return TipoImagen.LINEA2;
        }
        if(tablero[2][0]==1&&tablero[2][1]==1&&tablero[2][2]==1){
            return TipoImagen.LINEA3;
        }
        if(tablero[0][0]==1&&tablero[1][0]==1&&tablero[2][0]==1){
            return TipoImagen.LINEA4;
        }
        if(tablero[0][1]==1&&tablero[1][1]==1&&tablero[2][1]==1){
            return TipoImagen.LINEA5;
        }
        if(tablero[0][2]==1&&tablero[1][2]==1&&tablero[2][2]==1){
            return TipoImagen.LINEA6;
        }
        if(tablero[0][0]==1&&tablero[1][1]==1&&tablero[2][2]==1){
            return TipoImagen.LINEA7;
        }
        if(tablero[0][2]==1&&tablero[1][1]==1&&tablero[2][0]==1){
            return TipoImagen.LINEA8;
        }
        
        //Creamos un contador para evaluar si todas las casillas estan llenas
        int contador=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(tablero[i][j]==1){
                    contador++;
                }else if(jugadorRival.getTablero()[i][j]==1){
                    contador++;
                }
            }
            if(contador==9){
                return TipoImagen.EMPATE;
            }
        }
        return null;
    }
    
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
}
