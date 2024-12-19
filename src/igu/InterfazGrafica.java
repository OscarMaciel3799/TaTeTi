
package igu;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import logica.Jugador;
import logica.TipoImagen;

public class InterfazGrafica extends javax.swing.JFrame {

   
    public InterfazGrafica() {
        init();
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
        
        //Agregamos un borde al boton de inicio
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        txtIniciar = new javax.swing.JLabel();
        iconPlayer1 = new igu.Imagen();
        iconPlayer2 = new igu.Imagen();
        iconPlayer3 = new igu.Imagen();
        iconPlayer4 = new igu.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(102, 165, 173));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(7, 87, 91));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 87, 91));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TaTeTi");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 28, 400, 30);

        txtPlayer1.setBackground(new java.awt.Color(7, 87, 91));
        txtPlayer1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(196, 223, 230));
        txtPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer1.setText("PLAYER1");
        txtPlayer1.setBorder(null);
        txtPlayer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusLost(evt);
            }
        });
        txtPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseExited(evt);
            }
        });
        txtPlayer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer1KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer1);
        txtPlayer1.setBounds(100, 100, 210, 40);

        txtPlayer2.setBackground(new java.awt.Color(7, 87, 91));
        txtPlayer2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(196, 223, 230));
        txtPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer2.setText("PLAYER2");
        txtPlayer2.setBorder(null);
        txtPlayer2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusLost(evt);
            }
        });
        txtPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseExited(evt);
            }
        });
        txtPlayer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer2KeyTyped(evt);
            }
        });
        panelFondo.add(txtPlayer2);
        txtPlayer2.setBounds(100, 160, 210, 40);

        panelBoton.setBackground(new java.awt.Color(7, 87, 91));
        panelBoton.setForeground(new java.awt.Color(7, 87, 91));

        txtIniciar.setBackground(new java.awt.Color(42, 49, 50));
        txtIniciar.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        txtIniciar.setForeground(new java.awt.Color(196, 223, 230));
        txtIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIniciar.setText("INICIAR");
        txtIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(130, 230, 160, 50);

        iconPlayer1.setText("imagen1");
        iconPlayer1.setRuta("/recursos/jugadorEquis.png");
        panelFondo.add(iconPlayer1);
        iconPlayer1.setBounds(40, 100, 40, 40);

        iconPlayer2.setText("imagen1");
        iconPlayer2.setRuta("/recursos/jugadorCirculo.png");
        panelFondo.add(iconPlayer2);
        iconPlayer2.setBounds(40, 160, 40, 40);

        iconPlayer3.setText("imagen1");
        iconPlayer3.setRuta("/recursos/icono-X.png");
        panelFondo.add(iconPlayer3);
        iconPlayer3.setBounds(330, 100, 40, 40);

        iconPlayer4.setText("imagen1");
        iconPlayer4.setRuta("/recursos/icono-O.png");
        panelFondo.add(iconPlayer4);
        iconPlayer4.setBounds(330, 160, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Se ejecuta cuando el mouse entra en el componente
    private void txtPlayer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseEntered
        //Agregamos un borde cuando el mouse pasa por encima del componente
        Border borde= BorderFactory.createLineBorder(new Color(196, 223, 230),3);
        txtPlayer1.setBorder(borde);
    }//GEN-LAST:event_txtPlayer1MouseEntered
    //Se ejecuta cuando el mouse sale de el componente
    private void txtPlayer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseExited
        //dejamos el borde como estaba
        txtPlayer1.setBorder(null);
    }//GEN-LAST:event_txtPlayer1MouseExited

    private void txtPlayer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseEntered
        //Agregamos un borde cuando el mouse pasa por encima del componente
        Border borde= BorderFactory.createLineBorder(new Color(196, 223, 230),3);
        txtPlayer2.setBorder(borde);
    }//GEN-LAST:event_txtPlayer2MouseEntered

    private void txtPlayer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseExited
        //dejamos el borde como estaba
        txtPlayer2.setBorder(null);
    }//GEN-LAST:event_txtPlayer2MouseExited
    //Se activa cuando un componente adquiere el Foco
    private void txtPlayer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusGained
        //Si cuando el componente adquiere el foco el texto es "PLAYER1"
        //Se limpia para que el usuario no deba borrarlo
        if(txtPlayer1.getText().equals("PLAYER1")){
            txtPlayer1.setText("");
        }
    }//GEN-LAST:event_txtPlayer1FocusGained

    private void txtPlayer2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusGained
        // TODO add your handling code here:
        if(txtPlayer2.getText().equals("PLAYER2")){
            txtPlayer2.setText("");
        }
    }//GEN-LAST:event_txtPlayer2FocusGained
    //se activa cuando el componente sale del foco
    private void txtPlayer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusLost
        // En caseo el campo este vacio cuando pierde el foco:
        //se resetea el campo al valor inicial "PLAYER1"
        if(txtPlayer1.getText().equals("")){
            txtPlayer1.setText("PLAYER1");
        }
    }//GEN-LAST:event_txtPlayer1FocusLost

    private void txtPlayer2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusLost
        if(txtPlayer2.getText().equals("")){
            txtPlayer2.setText("PLAYER2");
        }
    }//GEN-LAST:event_txtPlayer2FocusLost
    //se activa cuando el más selecciona el panel del fondo
    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        //llamamos el foco al panel para que se actualicen ambos 
        //campos de jugadores en caso que esten vacios
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed
    //Vamos a limitar la cantidad de caracteres y los trasformamos a mayusculas
    //este metodo escucha cuando se selecciona una tecla que sea un caracter
    private void txtPlayer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer1KeyTyped
        //creamos una variable que guarde cada caracter y lo trasforme a mayuscula
        char caracter=Character.toUpperCase(evt.getKeyChar());
        //con este metodo usamos la variable creada para ingresar en el nombre
        evt.setKeyChar(caracter);
        //Evaluamos que el nombre no tenga mas de 8 caracteres
        if(txtPlayer1.getText().length()>=8){
            //este metodo ignora el evento del teclado evitando ingresar mas caracteres
            evt.consume();
        }
    }//GEN-LAST:event_txtPlayer1KeyTyped

    private void txtPlayer2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer2KeyTyped
        char caracter=Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtPlayer2.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtPlayer2KeyTyped
    //Se activa cuando el mouse entra en el componente
    private void txtIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMouseEntered
        //Vamos a cambiar el color al fondo cuando entra el mouse
        panelBoton.setBackground(new Color(0, 59, 70));
        Border borde= BorderFactory.createLineBorder(new Color(196, 223, 230),3);
        panelBoton.setBorder(borde);
    }//GEN-LAST:event_txtIniciarMouseEntered

    private void txtIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMouseExited
        //Vamos a cambiar el color al fondo cuando sale el mouse
        panelBoton.setBackground(new Color(7, 87, 91));
        panelBoton.setBorder(null);
        
    }//GEN-LAST:event_txtIniciarMouseExited
    //Este metodo se activa cuando hacemos click en el boton de inicio
    private void txtIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMousePressed
        //Cerramos nuestro formulario actual
        this.dispose();
        
        //Creamos a los dos jugadores instanciando la clase Jugador
        Jugador jugador1=new Jugador(TipoImagen.EQUIS);
        Jugador jugador2=new Jugador(TipoImagen.CIRCULO);
        
        //Seteamos los nombres de los jugadores y verificamos que no esten vacios
        if(txtPlayer1.getText().equals("")){
            jugador1.setNombre("PLAYER1");
        }else{
            jugador1.setNombre(txtPlayer1.getText());
        }
        if(txtPlayer2.getText().equals("")){
            jugador2.setNombre("PLAYER2");
        }else{
            jugador2.setNombre(txtPlayer2.getText());
        }
        
        //Instanciamos el panel del juego y lo hacemos visible
        FormTaTeTi taTeTi=new FormTaTeTi(jugador1,jugador2);
        taTeTi.setVisible(true);
    }//GEN-LAST:event_txtIniciarMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.Imagen iconPlayer1;
    private igu.Imagen iconPlayer2;
    private igu.Imagen iconPlayer3;
    private igu.Imagen iconPlayer4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txtIniciar;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    // End of variables declaration//GEN-END:variables
}
