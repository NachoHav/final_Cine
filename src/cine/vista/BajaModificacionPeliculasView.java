/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import java.util.ArrayList;
import cine.controlador.PeliculaData;
import cine.controlador.Conexion;
import cine.modelo.Pelicula;
import java.awt.Color;
import javax.swing.JTextField;
/**
 *
 * @author Arezlon
 */
public class BajaModificacionPeliculasView extends javax.swing.JInternalFrame {

    private PeliculaData peliculaData;
    private Conexion con;
    private ArrayList<Pelicula> listaPeliculas;
    /**
     * Creates new form BajaModificacionPeliculasView
     */
    public BajaModificacionPeliculasView() {
        initComponents();
        con = new Conexion();
        peliculaData = new PeliculaData(con);
        
        cargarDesplegablePeliculas();
    }
        
    private void cargarDesplegablePeliculas(){
        jCBPeliculas.removeAllItems();
        listaPeliculas=(ArrayList)peliculaData.obtenerPeliculas();
        for (Pelicula p:listaPeliculas) {
            jCBPeliculas.addItem(p);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAlerta = new javax.swing.JLabel();
        jCBPeliculas = new javax.swing.JComboBox<>();
        jTIDPelicula = new javax.swing.JTextField();
        jTTituloPelicula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jBBuscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBVaciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Baja y modificacion de Peliculas");

        jLAlerta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAlerta.setText(" ");
        jLAlerta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jCBPeliculas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBPeliculasItemStateChanged(evt);
            }
        });

        jTIDPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDPeliculaKeyTyped(evt);
            }
        });

        jTTituloPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTituloPeliculaActionPerformed(evt);
            }
        });
        jTTituloPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTituloPeliculajTValidacionNombresKeyTyped(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Películas");

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        jBVaciar.setText("Vaciar");
        jBVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVaciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Título");

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVaciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminar)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBPeliculas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTTituloPelicula)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTIDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jLAlerta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBVaciar)
                    .addComponent(jBEliminar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBPeliculasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBPeliculasItemStateChanged
        Pelicula p = (Pelicula)jCBPeliculas.getSelectedItem();

        if(p != null){
            jTTituloPelicula.setText(p.getTitulo());
            jTIDPelicula.setText(p.getIdPelicula()+"");
            jBEliminar.setEnabled(true);         }
    }//GEN-LAST:event_jCBPeliculasItemStateChanged

    private void jTIDPeliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPeliculaKeyTyped
        char ingreso = evt.getKeyChar();
        String campo = ((JTextField)evt.getSource()).getText()+ingreso;
        if(!Character.isDigit(ingreso) || campo.length() > 8){
            evt.consume();
        }
    }//GEN-LAST:event_jTIDPeliculaKeyTyped

    private void jTTituloPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTituloPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTituloPeliculaActionPerformed

    private void jTTituloPeliculajTValidacionNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTituloPeliculajTValidacionNombresKeyTyped
        /*char ingreso = evt.getKeyChar();
        String campo = ((JTextField)evt.getSource()).getText()+ingreso;
        if(!Character.isAlphabetic(ingreso) || campo.length() > 25){
            evt.consume();
        }*/
    }//GEN-LAST:event_jTTituloPeliculajTValidacionNombresKeyTyped

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int id = Integer.parseInt(jTIDPelicula.getText()) ;
        Pelicula busquedaPeli = peliculaData.buscarPelicula(id); 

        if(busquedaPeli.getIdPelicula() > 0){
            jTTituloPelicula.setText(busquedaPeli.getTitulo()+"");
        }else{
            Color colorError = new Color(255, 0, 0);
            jLAlerta.setText("No se encontró una película con el ID ingresado.");
            jLAlerta.setForeground(colorError);
            limpiar();
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int idPelicula = ((Pelicula)jCBPeliculas.getSelectedItem()).getIdPelicula();
        if(idPelicula > 0){
            int id = idPelicula;
            String titulo = jTTituloPelicula.getText();
            
            Pelicula pelicula = new Pelicula(titulo);
            pelicula.setIdPelicula(id);
            peliculaData.modificarPelicula(pelicula);
            
            Color colorExito = new Color(7, 110, 46);
            jLAlerta.setText("Película "+jTTituloPelicula.getText()+ " modificada correctamente");
            jLAlerta.setForeground(colorExito);
            cargarDesplegablePeliculas();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVaciarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBVaciarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int id = ((Pelicula)jCBPeliculas.getSelectedItem()).getIdPelicula();
        Color colorExito = new Color(7, 110, 46);
        jLAlerta.setText("Pelicula "+jTTituloPelicula.getText()+" eliminada correctamente");
        jLAlerta.setForeground(colorExito);
        peliculaData.bajaPelicula(id);
        limpiar();
        cargarDesplegablePeliculas();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void limpiar(){
        jTTituloPelicula.setText("");
        jTIDPelicula.setText("");
        jBEliminar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBVaciar;
    private javax.swing.JComboBox<Pelicula> jCBPeliculas;
    private javax.swing.JLabel jLAlerta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTIDPelicula;
    private javax.swing.JTextField jTTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
