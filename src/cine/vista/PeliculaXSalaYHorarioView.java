
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


public class PeliculaXSalaYHorarioView extends javax.swing.JInternalFrame {
    private Conexion con;
    private ArrayList<Sala> listaSalas;
    private ArrayList<Proyeccion> listaProyecciones;
    private SalaData salaData;
    private ProyeccionData proyeccionData;
    private PeliculaData peliculaData;

    public PeliculaXSalaYHorarioView() {
        initComponents();
        
        con = new Conexion();
        salaData = new SalaData(con);
        listaSalas = (ArrayList)salaData.obtenerSalas();
        proyeccionData = new ProyeccionData(con);
        listaProyecciones = (ArrayList)proyeccionData.obtenerProyecciones();
        
        cargarDesplegableSalas();
        cargarDesplegableHorarios();
    }

    private void cargarDesplegableSalas(){
        for(Sala sal: listaSalas){
            jcbSalas.addItem(sal);
        }
    }
   
    
    private void cargarDesplegableHorarios(){
        ArrayList<LocalTime> horariosDesde = proyeccionData.obtenerHorariosDesde();
        //ArrayList<LocalTime> horariosHasta = proyeccionData.obtenerHorariosHasta();
        
        for(LocalTime desde : horariosDesde){
            jcbHorarios.addItem(desde);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jcbSalas = new javax.swing.JComboBox<>();
        jcbHorarios = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTAlerta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Peliculas por Sala y Horario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Sala");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Horario");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorariosActionPerformed(evt);
            }
        });

        jTAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTAlerta.setLabelFor(jbBuscar);
        jTAlerta.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbSalas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTAlerta)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorariosActionPerformed
        
    }//GEN-LAST:event_jcbHorariosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       Sala idSala = (Sala)jcbSalas.getSelectedItem();
       LocalTime hora = (LocalTime)jcbHorarios.getSelectedItem();
       
       Proyeccion proyeccion = proyeccionData.buscarProyeccionXSalaYHorario(idSala.getIdSala(), hora);
       
       Color colorExito = new Color(7, 110, 46);
       Color colorError = new Color(255, 0, 0);
       
       if(proyeccion.getIdProyeccion() != -1){
           jTAlerta.setText("En la sala/horario seleccionado se proyectará la pelicula: "+proyeccion.getPelicula().getTitulo());
           jTAlerta.setForeground(colorExito);
       }else{
           jTAlerta.setText("No se encontró ninguna pelicula para la sala y horario seleccionados.");
           jTAlerta.setForeground(colorError);
       }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTAlerta;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<LocalTime> jcbHorarios;
    private javax.swing.JComboBox<Sala> jcbSalas;
    // End of variables declaration//GEN-END:variables
}
