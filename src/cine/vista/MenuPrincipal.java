/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.vista;

import cine.controlador.ClienteData;
import cine.controlador.Conexion;
import cine.controlador.ProyeccionData;
import cine.controlador.SalaData;
import cine.modelo.Cliente;
import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMClientes = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Clientes");

        jMClientes.setText("Alta de clientes");
        jMClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMClientes);

        jMenuItem5.setText("Baja y modificación de clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu8.setText("Salas");

        jMenuItem6.setText("Alta de salas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuItem7.setText("Baja y modificación de salas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuBar1.add(jMenu8);

        jMenu2.setText("Peliculas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Alta de películas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Baja y modificación de peliculas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Proyecciones");

        jMenuItem15.setText("Administracion de poryecciones");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Tickets");

        jMenuItem13.setText("Generar ticket de compra");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Modificar o anular ticket");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Consultas");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem8.setText("Listar peliculas por sala y horario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem9.setText("Lista salas donde se proyecta una pelicula");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem10.setText("Listar clientes por fecha");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setText("Informe de tickets por fecha");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("Informe de tickets por pelicula");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClientesActionPerformed
        //ALTA DE CLIENTES
        jEscritorio.removeAll();
        jEscritorio.repaint();
        AltaClientesView panelAltaClientes = new AltaClientesView();
        panelAltaClientes.setVisible(true);
        jEscritorio.add(panelAltaClientes);
        jEscritorio.moveToFront(panelAltaClientes);
    }//GEN-LAST:event_jMClientesActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //ALTA DE PELICULAS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        AltaPeliculasView panelAltaPeliculas = new AltaPeliculasView();
        panelAltaPeliculas.setVisible(true);
        jEscritorio.add(panelAltaPeliculas);
        jEscritorio.moveToFront(panelAltaPeliculas);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //BAJA Y MODIFICACION DE PELICULAS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BajaModificacionPeliculasView panelBMPeliculas = new BajaModificacionPeliculasView();
        panelBMPeliculas.setVisible(true);
        jEscritorio.add(panelBMPeliculas);
        jEscritorio.moveToFront(panelBMPeliculas);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //BAJA Y MODIFICACION DE SALAS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BajaModificacionSalasView panelBMSalas = new BajaModificacionSalasView();
        panelBMSalas.setVisible(true);
        jEscritorio.add(panelBMSalas);
        jEscritorio.moveToFront(panelBMSalas);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        //ELIMINAR
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //BAJA Y MODIFICACION DE TICKETS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BajaModificacionClientesView panelBMClientes = new BajaModificacionClientesView();
        panelBMClientes.setVisible(true);
        jEscritorio.add(panelBMClientes);
        jEscritorio.moveToFront(panelBMClientes);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //ALTA DE SALAS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        AltaSalasView panelAltaSalas = new AltaSalasView();
        panelAltaSalas.setVisible(true);
        jEscritorio.add(panelAltaSalas);
        jEscritorio.moveToFront(panelAltaSalas);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        //ALTA DE TICKETS
        Conexion con = new Conexion();
        ArrayList<Cliente> listaClientes;
        ArrayList<Sala> listaSalas;
        ArrayList<Proyeccion> listaProyecciones;
        
        ClienteData clienteData = new ClienteData(con);
        SalaData salaData = new SalaData(con);
        ProyeccionData proyeccionData = new ProyeccionData(con);
        
        listaClientes=(ArrayList)clienteData.obtenerClientes();
        listaSalas=(ArrayList)salaData.obtenerSalas();
        listaProyecciones=(ArrayList)proyeccionData.obtenerProyecciones();
        
        if(listaClientes.isEmpty() || listaClientes.isEmpty() || listaClientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "Esta ventana no se puede abrir si no hay clientes, salas y proyecciones creadas.","Error al cargar la ventana",JOptionPane.ERROR_MESSAGE);
        }else{
            jEscritorio.removeAll();
            jEscritorio.repaint();
            AltaTicketsView PanelGeneracionTicket = new AltaTicketsView();
            PanelGeneracionTicket.setVisible(true);
            jEscritorio.add(PanelGeneracionTicket);
            jEscritorio.moveToFront(PanelGeneracionTicket);
        }
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        //BAJA Y MODIFICACION DE TICKETS
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BajaModificacionTicketsView PanelEdicionTicket = new BajaModificacionTicketsView();
        PanelEdicionTicket.setVisible(true);
        jEscritorio.add(PanelEdicionTicket);
        jEscritorio.moveToFront(PanelEdicionTicket);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        TicketsXFecha ticketsXFecha = new TicketsXFecha();
        ticketsXFecha.setVisible(true);
        jEscritorio.add(ticketsXFecha);
        jEscritorio.moveToFront(ticketsXFecha);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        SalasXPelicula salasXPelicula = new SalasXPelicula();
        salasXPelicula.setVisible(true);
        jEscritorio.add(salasXPelicula);
        jEscritorio.moveToFront(salasXPelicula);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        PeliculaXSalaYHorarioView psh = new PeliculaXSalaYHorarioView();
        psh.setVisible(true);
        jEscritorio.add(psh);
        jEscritorio.moveToFront(psh);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        TicketsXPelicula txp = new TicketsXPelicula();
        txp.setVisible(true);
        jEscritorio.add(txp);
        jEscritorio.moveToFront(txp);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ProyeccionesView panelProyecciones = new ProyeccionesView();
        panelProyecciones.setVisible(true);
        jEscritorio.add(panelProyecciones);
        jEscritorio.moveToFront(panelProyecciones);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ClientesXFecha cxf = new ClientesXFecha();
        cxf.setVisible(true);
        jEscritorio.add(cxf);
        jEscritorio.moveToFront(cxf);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jMClientes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
