/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.ClienteData;
import cine.controlador.Conexion;
import cine.controlador.TicketData;
import cine.modelo.Cliente;
import cine.modelo.Ticket;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arezlon
 */
public class ClientesXFecha extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private TicketData td;
    private Conexion con;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Ticket> listaTickets;
    private ClienteData cd;
    
    public ClientesXFecha() {
        initComponents();
        con = new Conexion();
        modelo = new DefaultTableModel();
        td = new TicketData(con);
        armarEncabezadosTabla();
        cargarAnios();
        cargarMeses();
        cargarDias();
        jcDia.setEnabled(true);
    }


    
    private void cargarAnios(){
        int añoActual = LocalDate.now().getYear();
        for(int i=añoActual ; i >= 2000; i--){
            jcAnio.addItem(i+"");
        }
    }
    
    private void cargarMeses(){
        int mesActual = LocalDate.now().getMonthValue();
        for(int i=1 ; i <= 12; i++){
            jcMes.addItem(i+"");
        }
    }
    
    private void cargarDias(){
        eliminarDias();
        int mes;
        int año;
        
        try{
            mes = Integer.parseInt((String)jcMes.getSelectedItem());
            año = Integer.parseInt((String)jcAnio.getSelectedItem());
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
            jcDia.addItem(i+"");
        }
    }
    
    private void eliminarDias(){
        jcDia.removeAllItems();
    }
    
    
    private void borrarFilas(){
        int cantidadFilas = modelo.getRowCount()-1;
        for(int i=cantidadFilas; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarDatos(){
        
        borrarFilas();
        
        int añoBusqueda = Integer.parseInt((String)jcAnio.getSelectedItem());
        int mesBusqueda = Integer.parseInt((String)jcMes.getSelectedItem());
        int diaBusqueda = Integer.parseInt((String)jcDia.getSelectedItem());
        LocalDate fechaBusqueda = LocalDate.of(añoBusqueda, Month.of(mesBusqueda), diaBusqueda);
        listaTickets = (ArrayList)td.obtenerTicketXFecha(fechaBusqueda);
        
        for(Ticket t:listaTickets){
            modelo.addRow(new Object[]{t.getCliente().getIdCliente(),t.getCliente().getNombre(), t.getCliente().getApellido(), t.getProyeccion().getPelicula(), t.getProyeccion().getHoraDesde()});
        }
    }
    
    private void armarEncabezadosTabla(){
        ArrayList<Object> columnas = new ArrayList<Object>();
        
        columnas.add("ID Cliente");
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("Pelicula");
        columnas.add("Horario");        
        for(Object columna:columnas){
            modelo.addColumn(columna);
        }
        jtClientes.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcAnio = new javax.swing.JComboBox();
        jcMes = new javax.swing.JComboBox();
        jcDia = new javax.swing.JComboBox();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Clientes por Fecha");

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtClientes);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Clientes");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Mes");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Dia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(138, 138, 138)
                                    .addComponent(jLabel5)
                                    .addGap(10, 10, 10)))
                            .addGap(84, 84, 84)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jbBuscar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox jcAnio;
    private javax.swing.JComboBox jcDia;
    private javax.swing.JComboBox jcMes;
    private javax.swing.JTable jtClientes;
    // End of variables declaration//GEN-END:variables
}
