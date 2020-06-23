/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.Conexion;
import cine.controlador.SalaData;
import cine.modelo.Sala;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Arezlon
 */
public class BajaModificacionSalasView extends javax.swing.JInternalFrame {
    
    private Sala sala;
    private SalaData salaData;
    private Conexion con;
    private ArrayList<Sala> listaSalas;
    
    public BajaModificacionSalasView() {
        initComponents();
        
            con = new Conexion();
            salaData = new SalaData(con);
            CargarDesplegableSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCSalas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtUbicacion = new javax.swing.JTextField();
        jtNroButacas = new javax.swing.JTextField();
        btModificar = new javax.swing.JButton();
        btVaciar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Baja y modificacion de Salas");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Salas");

        jCSalas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCSalasItemStateChanged(evt);
            }
        });
        jCSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSalasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Ubicacion");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Nro Butacas");

        jtNroButacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNroButacasKeyTyped(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btVaciar.setText("Vaciar");
        btVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVaciarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel1)
                                                .addGap(50, 50, 50))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtNroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btVaciar)
                                .addGap(18, 18, 18)
                                .addComponent(btEliminar)
                                .addGap(84, 84, 84)))
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btModificar)
                            .addComponent(btVaciar)
                            .addComponent(btEliminar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int idSala = ((Sala)jCSalas.getSelectedItem()).getIdSala();
        if(idSala > 0)
        {
            int id = idSala;
            String ubicacion = jtUbicacion.getText();
            int nroButacas = Integer.parseInt(jtNroButacas.getText());
            
            Sala salaIngeresada = new Sala(ubicacion, nroButacas);
            salaIngeresada.setIdSala(id);
            salaData.modificarSala(salaIngeresada);
            
            CargarDesplegableSalas();
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVaciarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btVaciarActionPerformed
  
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int idSala = ((Sala)jCSalas.getSelectedItem()).getIdSala();

        salaData.bajaSala(idSala);
        Limpiar();
        CargarDesplegableSalas();   
    }//GEN-LAST:event_btEliminarActionPerformed

    private void jCSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSalasActionPerformed
        
    }//GEN-LAST:event_jCSalasActionPerformed

    private void jtNroButacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNroButacasKeyTyped
        char ingreso = evt.getKeyChar();
        String campo = jtNroButacas.getText()+ingreso;
        if(!Character.isDigit(ingreso) || campo.length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_jtNroButacasKeyTyped

    private void jCSalasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCSalasItemStateChanged
       Sala sala = (Sala)jCSalas.getSelectedItem();
       if(sala != null){
           jtNroButacas.setText(sala.getCantButacas() + "");
           jtUbicacion.setText(sala.getUbicacion());
       }
       
    }//GEN-LAST:event_jCSalasItemStateChanged

    
    private void Limpiar()
    {
        jtUbicacion.setText("");
        jtNroButacas.setText("");
    }
    
    private void CargarDesplegableSalas()
    {
        listaSalas = (ArrayList)salaData.obtenerSalas();
        jCSalas.removeAllItems();
        for (Sala s:listaSalas) {
            jCSalas.addItem(s);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btVaciar;
    private javax.swing.JComboBox<Sala> jCSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtNroButacas;
    private javax.swing.JTextField jtUbicacion;
    // End of variables declaration//GEN-END:variables
}
