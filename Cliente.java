import java.util.ArrayList;
import java.util.List;

class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private List<Prestamo> prestamos;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}