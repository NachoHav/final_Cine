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
        jLAlerta = new javax.swing.JLabel();
        jTTituloPelicula = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Importante: El titulo de la pelicula podrá contener espacios y números");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBVaciar)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jLAlerta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        /*char ingreso = evt.getKeyChar();
        String campo = ((JTextField)evt.getSource()).getText()+ingreso;
        if(!Character.isAlphabetic(ingreso) || campo.length() > 25){
            evt.consume();
        }*/
        
        //ESTO NO HACIA FALTA
    }//GEN-LAST:event_jTTituloPeliculajTValidacionTextosKeyTyped

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String titulo = jTTituloPelicula.getText();
        Color colorExito = new Color(7, 110, 46);
        Color colorError = new Color(255, 0, 0);
        
        if(!titulo.equals("")){
            Pelicula pelicula = new Pelicula(titulo);
            peliculaData.altaPelicula(pelicula);
            jLAlerta.setText("Creada la película "+pelicula.getTitulo()+" correctamente");
            jLAlerta.setForeground(colorExito);
        }else{
            jLAlerta.setText("Error al crear la película, hay campos vacios.");
            jLAlerta.setForeground(colorError);
        }
        
        
        vaciarTodo();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void vaciarTodo(){
        jTTituloPelicula.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBVaciar;
    private javax.swing.JLabel jLAlerta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
