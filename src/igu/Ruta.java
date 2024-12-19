
package igu;

import logica.TipoImagen;

public class Ruta { 
    public static final String EQUIS="/recursos/icono-X.png";
    public static final String CIRCULO="/recursos/icono-O.png";
    public static final String PLAYER1="/recursos/jugadorEquis.png";
    public static final String PLAYER2="/recursos/jugadorCirculo.png";
    public static final String PLAYERAUXILIAR="/recursos/jugadorAuxiliar.png";

    
    
    //Creacmos unas variables que van a ser las lines de ganar
    public static String LINEA1="/recursos/icono-X.png";
    public static String LINEA2="/recursos/icono-X.png";
    public static String LINEA3="/recursos/icono-X.png";
    public static String LINEA4="/recursos/icono-X.png";
    public static String LINEA5="/recursos/icono-X.png";
    public static String LINEA6="/recursos/icono-X.png";
    public static String LINEA7="/recursos/icono-X.png";
    public static String LINEA8="/recursos/icono-X.png";
   
    
        public static void cambiarRutas(TipoImagen tipoImagen){
            if(tipoImagen==TipoImagen.CIRCULO){
                LINEA1="/recursos/icono-O.png";
                LINEA2="/recursos/icono-O.png";
                LINEA3="/recursos/icono-O.png";
                LINEA4="/recursos/icono-O.png";
                LINEA5="/recursos/icono-O.png";
                LINEA6="/recursos/icono-O.png";
                LINEA7="/recursos/icono-O.png";
                LINEA8="/recursos/icono-O.png";
            }else if(tipoImagen==TipoImagen.EQUIS){
                LINEA1="/recursos/icono-X.png";
                LINEA2="/recursos/icono-X.png";
                LINEA3="/recursos/icono-X.png";
                LINEA4="/recursos/icono-X.png";
                LINEA5="/recursos/icono-X.png";
                LINEA6="/recursos/icono-X.png";
                LINEA7="/recursos/icono-X.png";
                LINEA8="/recursos/icono-X.png";
            }
        }

    
}
