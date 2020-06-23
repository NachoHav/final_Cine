
package cine.vista;

import cine.controlador.Conexion;
import cine.controlador.SalaData;
import cine.modelo.Sala;
import java.awt.Color;


public class AltaSalasView extends javax.swing.JInternalFrame {
    private SalaData salaData;
    private Conexion con;

    public AltaSalasView() {
        initComponents();
        con = new Conexion();
        salaData = new SalaData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNroButacas = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btVaciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTAlerta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alta de Salas");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ubicacion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Numero de butacas");

        jtNroButacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNroButacasActionPerformed(evt);
            }
        });
        jtNroButacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNroButacasKeyTyped(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btVaciar.setText("Vaciar");
        btVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVaciarActionPerformed(evt);
            }
        });

        jTAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTAlerta.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtNroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVaciar)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTAlerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btVaciar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNroButacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNroButacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNroButacasActionPerformed

    
    public void vaciarTodo(){
        jtUbicacion.setText("");
        jtNroButacas.setText("");
    }
    
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String ubicacion = jtUbicacion.getText();
        int nroButacas = (jtNroButacas.getText().isEmpty()) ? 0 : Integer.parseInt(jtNroButacas.getText());
        
        Color colorExito = new Color(7, 110, 46);
        Color colorError = new Color(255, 0, 0);
         
        if(!jtUbicacion.getText().equals("") && nroButacas != 0){
            Sala salaIngresada = new Sala(ubicacion ,nroButacas);
            salaData.altaSala(salaIngresada);
            jTAlerta.setText("Sala creada correctamente.");
            jTAlerta.setForeground(colorExito);
        }else{
            jTAlerta.setText("No se puede crear la sala, hay campos vacios.");
            jTAlerta.setForeground(colorError);
        }
        
        
        vaciarTodo();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVaciarActionPerformed
        vaciarTodo();
    }//GEN-LAST:event_btVaciarActionPerformed

    private void jtNroButacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNroButacasKeyTyped
        char ingreso = evt.getKeyChar();
        String campo = jtNroButacas.getText()+ingreso;
        if(!Character.isDigit(ingreso) || campo.length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_jtNroButacasKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTAlerta;
    private javax.swing.JTextField jtNroButacas;
    private javax.swing.JTextField jtUbicacion;
    // End of variables declaration//GEN-END:variables
}
