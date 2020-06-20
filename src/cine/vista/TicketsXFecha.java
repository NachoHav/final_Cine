/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.Conexion;
import cine.controlador.TicketData;
import cine.modelo.Ticket;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arezlon
 */
public class TicketsXFecha extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private TicketData td;
    private Conexion con;
    private ArrayList<Ticket> listaTickets;
    /**
     * Creates new form TicketsXFecha
     */
    public TicketsXFecha() {
        initComponents();
        con = new Conexion();
        modelo = new DefaultTableModel();
        td = new TicketData(con);
        armarEncabezadosTabla();
        cargarAnios();
        cargarMeses();
        jCBDia.setEnabled(false);
        
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
        jTTickets = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jBBuscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBVaciar = new javax.swing.JButton();
        jCBDia = new javax.swing.JComboBox<>();
        jCBMes = new javax.swing.JComboBox<>();
        jCAnio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listado de Tickets por fecha");

        jTTickets.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTTickets);

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBVaciar.setText("Vaciar");

        jCBMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMesItemStateChanged(evt);
            }
        });

        jCAnio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCAnioItemStateChanged(evt);
            }
        });
        jCAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAnioActionPerformed(evt);
            }
        });

        jLabel1.setText("Año");

        jLabel2.setText("Mes");

        jLabel3.setText("Dia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jBVaciar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jCAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBMes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jCBDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVaciar)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Listado de tickets por fecha");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jCBMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMesItemStateChanged
        cargarDias();
        jCBDia.setEnabled(true);
    }//GEN-LAST:event_jCBMesItemStateChanged

    private void jCAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAnioActionPerformed

    private void jCAnioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCAnioItemStateChanged
        cargarDias();
    }//GEN-LAST:event_jCAnioItemStateChanged

    private void cargarAnios(){
        int añoActual = LocalDate.now().getYear();
        for(int i=añoActual ; i >= 2000; i--){
            jCAnio.addItem(i+"");
        }
    }
    
    private void cargarMeses(){
        int mesActual = LocalDate.now().getMonthValue();
        for(int i=1 ; i <= 12; i++){
            jCBMes.addItem(i+"");
        }
    }
    
    private void cargarDias(){
        eliminarDias();
        int mes;
        int año;
        
        try{
            mes = Integer.parseInt((String)jCBMes.getSelectedItem());
            año = Integer.parseInt((String)jCAnio.getSelectedItem());
        }catch(NumberFormatException e){
            return;
        }
        
        boolean bisiesto = año % 4 == 0;
        int diasMes = 0;
        
        if(mes == 3 || mes == 6 || mes == 9 || mes == 11){
            diasMes = 30;
        }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            diasMes = 31;
        }else if(mes == 2 && bisiesto){
            diasMes = 29;
        }else{
            diasMes = 28;
        }
        
        for(int i=1 ; i <= diasMes; i++){
            jCBDia.addItem(i+"");
        }
    }
    
    private void eliminarDias(){
        jCBDia.removeAllItems();
    }
    
    private void borrarFilas(){
        int cantidadFilas = modelo.getRowCount()-1;
        for(int i=cantidadFilas; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarDatos(){
        borrarFilas();
        int añoBusqueda = Integer.parseInt((String)jCAnio.getSelectedItem());
        int mesBusqueda = Integer.parseInt((String)jCBMes.getSelectedItem());
        int diaBusqueda = Integer.parseInt((String)jCBDia.getSelectedItem());
        LocalDate fechaBusqueda = LocalDate.of(añoBusqueda, Month.of(mesBusqueda), diaBusqueda);
        listaTickets = (ArrayList)td.obtenerTicketXFecha(fechaBusqueda);
        
        for(Ticket t:listaTickets){
            modelo.addRow(new Object[]{t.getIdTicket(),t.getCliente().getNombre(),t.getProyeccion().getPelicula().getTitulo(),t.getFecha_ticket(),t.getMonto(),t.getMetodo_pago()});
        }
    }
    
    private void armarEncabezadosTabla(){
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID Ticket");
        columnas.add("Cliente");
        columnas.add("Pelicula");
        columnas.add("Horario");
        columnas.add("Monto");
        columnas.add("Metodo pago");
        
        for(Object columna:columnas){
            modelo.addColumn(columna);
        }
        jTTickets.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBVaciar;
    private javax.swing.JComboBox<String> jCAnio;
    private javax.swing.JComboBox<String> jCBDia;
    private javax.swing.JComboBox<String> jCBMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTTickets;
    // End of variables declaration//GEN-END:variables
}
