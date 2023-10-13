class Libro extends Publicacion {
    private String autor;
    private String editorial;

    public Libro(int id, String titulo, String autor, String editorial, String materia, int cantidadEjemplares) {
        super(id, titulo, materia, cantidadEjemplares);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }
}
