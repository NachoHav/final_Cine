
package cine.vista;

import cine.controlador.Conexion;
import cine.controlador.PeliculaData;
import cine.controlador.ProyeccionData;
import cine.controlador.SalaData;
import cine.modelo.Pelicula;
import cine.modelo.Proyeccion;
import cine.modelo.Sala;
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
//        for(Proyeccion proy: listaProyecciones){    
//            for(Proyeccion p2: listaProyecciones){
//                int a = p2.getHoraDesde().getHour();
//                int a2 = p2.getHoraDesde().getMinute();
//                int b = proy.getHoraDesde().getHour();
//                int b2 = proy.getHoraDesde().getMinute();
//                
//                if(a == b){
//                    if(a2 == b2){
//                        if(proy.getSala().getIdSala() != p2.getSala().getIdSala()){
//                            jcbHorarios.addItem((proy.getHoraDesde().getHour())+":"+proy.getHoraDesde().getMinute());
//                        }
//                    }
//                }
//            }
//           
//        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtTituloPelicula = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jcbSalas = new javax.swing.JComboBox<Sala>();
        jcbHorarios = new javax.swing.JComboBox<String>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Peliculas por Sala y Horario");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Peliculas por Sala y Horario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Sala");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Horario");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Pelicula");

        jtTituloPelicula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbSalas, 0, 107, Short.MAX_VALUE)
                                    .addComponent(jcbHorarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscar)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jtTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorariosActionPerformed
        
    }//GEN-LAST:event_jcbHorariosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       Sala idSala = (Sala) jcbSalas.getSelectedItem();
       Proyeccion hora = (Proyeccion) jcbHorarios.getSelectedItem();
       
       Proyeccion pelicula = proyeccionData.buscarProyeccionXSalaYHorario(idSala.getIdSala(), hora.getHoraDesde());
       
       jtTituloPelicula.setText(pelicula.getPelicula().getTitulo());
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbHorarios;
    private javax.swing.JComboBox<Sala> jcbSalas;
    private javax.swing.JTextField jtTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
