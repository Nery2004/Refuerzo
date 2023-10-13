import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Cliente> clientes;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarPrestamo(Publicacion publicacion, Cliente cliente, String fechaSolicitud, String fechaDevolucion) {
        Prestamo prestamo = new Prestamo(publicacion, cliente, fechaSolicitud, fechaDevolucion);
        prestamos.add(prestamo);
        // Actualizar la disponibilidad de la publicación
        publicacion.setDisponible(false);
    }

    public Publicacion buscarPublicacionPorId(int id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                return publicacion;
            }
        }
        return null; // No se encontró la publicación
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; // No se encontró el cliente
    }

    public void eliminarPublicacion(int id) {
        Publicacion publicacion = buscarPublicacionPorId(id);
        if (publicacion != null) {
            publicaciones.remove(publicacion);
            // Puedes agregar lógica adicional, como desvincular préstamos relacionados con la publicación
        }
    }

    public void eliminarCliente(int id) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            clientes.remove(cliente);
            // Puedes agregar lógica adicional, como cancelar préstamos del cliente
        }
    }

    public void generarInformePublicaciones() {
        System.out.println("Lista de Publicaciones:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println("ID: " + publicacion.getId());
            System.out.println("Título: " + publicacion.getTitulo());
            System.out.println("Materia: " + publicacion.getMateria());
            System.out.println("Cantidad de Ejemplares: " + publicacion.getCantidadEjemplares());
            System.out.println("Estado: " + (publicacion.isDisponible() ? "Disponible" : "Agotado"));
            System.out.println("----------------------------");
        }
    }

    public void generarInformeClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("----------------------------");
        }
    }
}
