/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.Conexion;
import cine.controlador.PeliculaData;
import cine.controlador.ProyeccionData;
import cine.controlador.SalaData;
import cine.modelo.Pelicula;
import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import java.awt.Color;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Arezlon
 */
public class ProyeccionesView extends javax.swing.JInternalFrame {
    private ArrayList<Pelicula> listaPeliculas;
    private ArrayList<Proyeccion> listaProyecciones;
    private ArrayList<Sala> listaSalas;
    private PeliculaData peliculaData;
    private SalaData salaData;
    private ProyeccionData proyeccionData;
    private Conexion con;
    /**
     * Creates new form ProyeccionesView
     */
    public ProyeccionesView() {
        initComponents();
        con = new Conexion();
        proyeccionData = new ProyeccionData(con);
        salaData = new SalaData(con);
        peliculaData = new PeliculaData(con);
        cargarDesplegablesHorario();
        recargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBSalas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBDesdeHora = new javax.swing.JComboBox<>();
        jCBDesdeMinutos = new javax.swing.JComboBox<>();
        jCBHastaMinutos = new javax.swing.JComboBox<>();
        jCBHastaHora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCBProyecciones = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLAlerta = new javax.swing.JLabel();
        jCBPelicula = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administracion de proyecciones");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Pelicula");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Sala");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora Inicio");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Hora Final");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Proyeccion");

        jCBProyecciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBProyeccionesItemStateChanged(evt);
            }
        });
        jCBProyecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProyeccionesActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jLAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAlerta.setText(" ");
        jLAlerta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Importante: El botón guardar ignorará el contenido del primer desplegable");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBProyecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrar)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBHastaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBHastaMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBSalas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBDesdeHora, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBDesdeMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jLAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBProyecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBDesdeHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDesdeMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBHastaMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBHastaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAlerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBModificar)
                        .addComponent(jBBorrar))
                    .addComponent(jBGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Pelicula peliculaAlta = (Pelicula)jCBPelicula.getSelectedItem();
        Sala salaAlta = (Sala)jCBSalas.getSelectedItem();
        LocalTime horaDesde = LocalTime.of(Integer.parseInt((String)jCBDesdeHora.getSelectedItem()), Integer.parseInt((String)jCBDesdeMinutos.getSelectedItem()));
        LocalTime horaHasta = LocalTime.of(Integer.parseInt((String)jCBHastaHora.getSelectedItem().toString()), Integer.parseInt((String)jCBHastaMinutos.getSelectedItem()));
        
        Color colorExito = new Color(7, 110, 46);
        jLAlerta.setText("Proyección creada correctamente");
        jLAlerta.setForeground(colorExito);
        
        Proyeccion proyeccionAlta = new Proyeccion(peliculaAlta,salaAlta, horaDesde, horaHasta);
        proyeccionData.altaProyeccion(proyeccionAlta);
        recargar();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int id = ((Proyeccion)jCBProyecciones.getSelectedItem()).getIdProyeccion();
        Color colorExito = new Color(7, 110, 46);
        jLAlerta.setText("Proyección eliminada correctamente");
        jLAlerta.setForeground(colorExito);
        proyeccionData.bajaProyeccion(id);
        recargar();
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jCBProyeccionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBProyeccionesItemStateChanged
        Proyeccion seleccionada = (Proyeccion)jCBProyecciones.getSelectedItem();
        
        if(seleccionada == null)
            return;
        
        for(int i = 0; i < jCBPelicula.getItemCount(); i++){
            //System.out.println(((Pelicula)jCBPelicula.getItemAt(i)).toString()+" >>COMPARACION<< "+seleccionada.getPelicula().toString());
            if(((Pelicula)jCBPelicula.getItemAt(i)).getIdPelicula() == (seleccionada.getPelicula().getIdPelicula())){
                jCBPelicula.setSelectedIndex(i);
            }
        }
        
        for(int i = 0; i < jCBSalas.getItemCount(); i++){
            if(((Sala)jCBSalas.getItemAt(i)).getIdSala() == (seleccionada.getSala().getIdSala())){
                jCBSalas.setSelectedIndex(i);
            }
        }
        
        int horaInicio, minutoInicio, horaFinal, minutoFinal;
        
        horaInicio = seleccionada.getHoraDesde().getHour();
        jCBDesdeHora.setSelectedIndex(horaInicio);
        minutoInicio = seleccionada.getHoraDesde().getMinute();
        jCBDesdeMinutos.setSelectedIndex(minutoInicio/5);
        
        horaFinal = seleccionada.getHoraDesde().getHour();
        jCBHastaHora.setSelectedIndex(horaFinal);
        minutoFinal = seleccionada.getHoraHasta().getMinute();
        jCBHastaMinutos.setSelectedIndex(minutoFinal/5);
        
    }//GEN-LAST:event_jCBProyeccionesItemStateChanged

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int idProyeccion = ((Proyeccion)jCBProyecciones.getSelectedItem()).getIdProyeccion();
        if(idProyeccion > 0){
            int id = idProyeccion;
            Pelicula pelicula = (Pelicula)jCBPelicula.getSelectedItem();
            Sala sala = (Sala)jCBSalas.getSelectedItem();
            LocalTime horaDesde = LocalTime.of(Integer.parseInt((String)jCBDesdeHora.getSelectedItem()), Integer.parseInt((String)jCBDesdeMinutos.getSelectedItem()));
            LocalTime horaHasta = LocalTime.of(Integer.parseInt((String)jCBHastaHora.getSelectedItem().toString()), Integer.parseInt((String)jCBHastaMinutos.getSelectedItem()));
            
            Proyeccion proyeccionEditada = new Proyeccion(pelicula,sala,horaDesde,horaHasta);
            proyeccionEditada.setIdProyeccion(id);
            proyeccionData.modificarProyeccion(proyeccionEditada);
            
            Color colorExito = new Color(7, 110, 46);
            jLAlerta.setText("Proyeccion "+id+" modificada correctamente");
            jLAlerta.setForeground(colorExito);
            recargar();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jCBProyeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProyeccionesActionPerformed
        //jBModificar.setEnabled(true);
    }//GEN-LAST:event_jCBProyeccionesActionPerformed

    private void recargar(){
        jCBProyecciones.removeAllItems();
        cargarProyecciones();
        jCBPelicula.removeAllItems();
        cargarPeliculas();
        jCBSalas.removeAllItems();
        cargarSalas();
    }
    
    private void cargarPeliculas() 
    {
        listaPeliculas = (ArrayList)peliculaData.obtenerPeliculas();
        for(Pelicula pelicula : listaPeliculas)
            jCBPelicula.addItem(pelicula);
    }
    
    private void cargarSalas(){
        listaSalas = (ArrayList)salaData.obtenerSalas();
        for(Sala sala : listaSalas)
           jCBSalas.addItem(sala);
    }
    
    private void cargarProyecciones(){
        listaProyecciones = (ArrayList)proyeccionData.obtenerProyecciones();
        for(Proyeccion pro : listaProyecciones)
           jCBProyecciones.addItem(pro);
    }
    
    private void cargarDesplegablesHorario(){
        for(int h=0 ; h < 24; h++){
            if(h==0){
                jCBDesdeHora.addItem(h+"0");
                jCBHastaHora.addItem(h+"0");
            }else if(h==1 || h==2 ||h==3 || h==4 || h==5 || h==6 || h==7 || h==8 || h==9 ){
                jCBDesdeHora.addItem("0"+h);
                jCBHastaHora.addItem("0"+h);
            }else{
                jCBDesdeHora.addItem(+h+"");
                jCBHastaHora.addItem(h+"");
            }
        }
        for(int m=0 ; m < 60 ; m+=5){
            jCBDesdeMinutos.addItem(m+"");
            jCBHastaMinutos.addItem(m+"");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCBDesdeHora;
    private javax.swing.JComboBox<String> jCBDesdeMinutos;
    private javax.swing.JComboBox<String> jCBHastaHora;
    private javax.swing.JComboBox<String> jCBHastaMinutos;
    private javax.swing.JComboBox<Pelicula> jCBPelicula;
    private javax.swing.JComboBox<Proyeccion> jCBProyecciones;
    private javax.swing.JComboBox<Sala> jCBSalas;
    private javax.swing.JLabel jLAlerta;
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
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}