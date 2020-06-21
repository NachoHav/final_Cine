/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.PeliculaData;
import cine.controlador.Conexion;
import cine.modelo.Pelicula;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Arezlon
 */
public class AltaPeliculasView extends javax.swing.JInternalFrame {
    private PeliculaData peliculaData;
    private Conexion con;

    /**
     * Creates new form AltaPeliculasView
     */
    public AltaPeliculasView() {
        initComponents();
        con = new Conexion();
        peliculaData = new PeliculaData(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jBVaciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLAlerta = new javax.swing.JLabel();
        jTTituloPelicula = new javax.swing.JTextField();
        jTIDPelicula = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alta de Peliculas");

        jBVaciar.setText("Vaciar");
        jBVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVaciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Título*");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID*");

        jLAlerta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAlerta.setText(" ");

        jTTituloPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTituloPeliculaActionPerformed(evt);
            }
        });
        jTTituloPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTituloPeliculajTValidacionTextosKeyTyped(evt);
            }
        });

        jTIDPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDPeliculaActionPerformed(evt);
            }
        });
        jTIDPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDPeliculajTValidacionTextosKeyTyped(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTTituloPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTIDPelicula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVaciar)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTIDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLAlerta)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBVaciar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVaciarActionPerformed
        vaciarTodo();
    }//GEN-LAST:event_jBVaciarActionPerformed

    private void jTTituloPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTituloPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTituloPeliculaActionPerformed

    private void jTTituloPeliculajTValidacionTextosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTituloPeliculajTValidacionTextosKeyTyped
        char ingreso = evt.getKeyChar();
        String campo = ((JTextField)evt.getSource()).getText()+ingreso;
        if(!Character.isAlphabetic(ingreso) || campo.length() > 25){
            evt.consume();
        }
    }//GEN-LAST:event_jTTituloPeliculajTValidacionTextosKeyTyped

    private void jTIDPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDPeliculaActionPerformed

    private void jTIDPeliculajTValidacionTextosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPeliculajTValidacionTextosKeyTyped
        char ingreso = evt.getKeyChar();
        String campo = ((JTextField)evt.getSource()).getText()+ingreso;
        if(!Character.isAlphabetic(ingreso) || campo.length() > 25){
            evt.consume();
        }
    }//GEN-LAST:event_jTIDPeliculajTValidacionTextosKeyTyped

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String titulo = jTTituloPelicula.getText();
        long idPelicula =  Long.parseLong(jTIDPelicula.getText());
        Color colorExito = new Color(7, 110, 46);
        Color colorError = new Color(255, 0, 0);
        Pelicula pelicula = new Pelicula(titulo);
        peliculaData.altaPelicula(pelicula);
        jLAlerta.setText("Creada la película "+pelicula.getTitulo()+" correctamente");
        jLAlerta.setForeground(colorExito);
        
        vaciarTodo();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void vaciarTodo(){
        jTTituloPelicula.setText("");
        jTIDPelicula.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBVaciar;
    private javax.swing.JLabel jLAlerta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTIDPelicula;
    private javax.swing.JTextField jTTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
