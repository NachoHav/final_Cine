
package cine.modelo;

import java.time.LocalDate;


public class Ticket {
    private int idTicket = -1;
    private Cliente cliente;
    private Proyeccion proyeccion;
    private Butaca butaca;
    private LocalDate fecha_ticket;
    private double monto;
    private boolean estado;
    private String metodo_pago;

    public Ticket() {
    }

    public Ticket(Cliente cliente, Proyeccion proyeccion, Butaca butaca, LocalDate fecha_ticket, double monto, boolean estado, String metodo_pago) {
        this.cliente = cliente;
        this.proyeccion = proyeccion;
        this.butaca = butaca;
        this.fecha_ticket = fecha_ticket;
        this.monto = monto;
        this.estado = estado;
        this.metodo_pago = metodo_pago;
    }

    public int getIdTicket() 
    {
        return idTicket;
    }

    public void setIdTicket(int idTicket) 
    {
        this.idTicket = idTicket;
    }   
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public LocalDate getFecha_ticket() {
        return fecha_ticket;
    }

    public void setFecha_ticket(LocalDate fecha_ticket) {
        this.fecha_ticket = fecha_ticket;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    
    @Override
    public String toString() {
        return "ID:" + idTicket + " - " + fecha_ticket + " - " + proyeccion.getPelicula().getTitulo();
    }
    
    
    


}
    

    

