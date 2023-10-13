public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar publicaciones (libros y revistas)
        Libro libro1 = new Libro(1, "El Gran Gatsby", "F. Scott Fitzgerald", "Editorial A", "Ficción", 5);
        Libro libro2 = new Libro(2, "1984", "George Orwell", "Editorial B", "Ciencia Ficción", 3);
        Revista revista1 = new Revista(3, "National Geographic", 2023, 10, "Ciencia", 2);
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(libro2);
        biblioteca.agregarPublicacion(revista1);

        // Agregar clientes
        Cliente cliente1 = new Cliente(101, "Juan Pérez", "Calle Principal 123");
        Cliente cliente2 = new Cliente(102, "María López", "Avenida Central 456");
        biblioteca.agregarCliente(cliente1);
        biblioteca.agregarCliente(cliente2);

        // Realizar préstamos
        biblioteca.realizarPrestamo(libro1, cliente1, "2023-10-01", "2023-10-15");
        biblioteca.realizarPrestamo(revista1, cliente2, "2023-10-05", "2023-10-20");

        // Buscar y mostrar una publicación por ID
        Publicacion publicacionBuscada = biblioteca.buscarPublicacionPorId(1);
        if (publicacionBuscada != null) {
            System.out.println("Publicación encontrada:");
            System.out.println("Título: " + publicacionBuscada.getTitulo());
        } else {
            System.out.println("Publicación no encontrada.");
        }

        // Eliminar un cliente por ID
        biblioteca.eliminarCliente(102);
        System.out.println("Cliente eliminado.");

        // Generar informes
        biblioteca.generarInformePublicaciones();
        biblioteca.generarInformeClientes();
    }
}/// aqui es solo un ejemplo despues el programa si lo pide ya lo hare con menu y ya podra llenar sus datos 
