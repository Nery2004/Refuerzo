class Publicacion {
    private int id;
    private String titulo;
    private String materia;
    private int cantidadEjemplares;
    private boolean estado;

    public Publicacion(int id, String titulo, String materia, int cantidadEjemplares) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = true; // Por defecto, esta disponible
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public boolean isDisponible() {
        return estado;
    }

    public void setDisponible(boolean disponible) {
        this.estado = disponible;
    }
}