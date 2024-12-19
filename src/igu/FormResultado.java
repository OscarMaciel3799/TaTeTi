
package igu;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import logica.TipoImagen;

public class FormResultado extends javax.swing.JFrame {

    private Tablero tablero;
    private TipoImagen jugadorGanador;
    public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        init();
        this.tablero=tablero;
        this.jugadorGanador=jugadorGanador;
        if(jugadorGanador==TipoImagen.EQUIS){
            iconIzquierda.setRuta(Ruta.PLAYER1);
            iconDerecha.setRuta(Ruta.EQUIS);
            txtNombre.setText(FormTaTeTi.nombrePlayerEquis.getText());
        }else if(jugadorGanador==TipoImagen.CIRCULO){
            iconIzquierda.setRuta(Ruta.PLAYER2);
            iconDerecha.setRuta(Ruta.CIRCULO);
            txtNombre.setText(FormTaTeTi.nombrePlayerCirculo.getText());
        }else if(jugadorGanador==TipoImagen.EMPATE){
            iconIzquierda.setRuta(Ruta.PLAYER1);
            iconDerecha.setRuta(Ruta.PLAYER2);
            txtNombre.setText("EMPATE");
        }
    }
    //Configuracion inicial del formulario
    public void init(){
        initComponents();
        //Evita que se cambie el tamaño de la interfaz
        setResizable(false); 
        //Centra la interfaz a la pantalla
        setLocationRelativeTo(null);
        //Quita el Foco del cursor de los campos texto
        panelFondo.requestFocus();  
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Aquí defines lo que ocurre al cerrar esta ventana
                onWindowClosing();
            }
        });
    }
    
    // Método para manejar el evento de cierre de la ventana
    private void onWindowClosing() {
        dispose(); // Cerrar solo esta ventana
        tablero.reiniciarTablero(jugadorGanador);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconIzquierda = new igu.Imagen();
        iconDerecha = new igu.Imagen();
        txtNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(102, 165, 173));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(7, 87, 91));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 87, 91));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIA");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 28, 400, 30);

        iconIzquierda.setText("imagen1");
        iconIzquierda.setRuta("/recursos/jugadorEquis.png");
        panelFondo.add(iconIzquierda);
        iconIzquierda.setBounds(80, 100, 40, 40);

        iconDerecha.setText("imagen1");
        iconDerecha.setRuta("/recursos/icono-X.png");
        panelFondo.add(iconDerecha);
        iconDerecha.setBounds(280, 100, 40, 40);

        txtNombre.setBackground(new java.awt.Color(183, 183, 164));
        txtNombre.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(7, 87, 91));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("NOMBRE");
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(txtNombre);
        txtNombre.setBounds(0, 100, 400, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.Imagen iconDerecha;
    private igu.Imagen iconIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
