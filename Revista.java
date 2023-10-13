class Revista extends Publicacion {
    private int ano;
    private int numero;

    public Revista(int id, String titulo, int ano, int numero, String materia, int cantidadEjemplares) {
        super(id, titulo, materia, cantidadEjemplares);
        this.ano = ano;
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public int getNumero() {
        return numero;
    }
}