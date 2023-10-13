class Prestamo {
    private Publicacion publicacion;
    private Cliente cliente;
    private String fechaSolicitud;
    private String fechaDevolucion;

    public Prestamo(Publicacion publicacion, Cliente cliente, String fechaSolicitud, String fechaDevolucion) {
        this.publicacion = publicacion;
        this.cliente = cliente;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
}