import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<Producto>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }

    public String mostrarResumen() {
        String resumen = "===== RESUMEN DEL PEDIDO =====\n";
        resumen += cliente.toString() + "\n\n";
        resumen += "Productos:\n";

        for (Producto p : productos) {
            resumen += " - " + p.toString() + "\n";
        }

        resumen += "\nTOTAL A PAGAR: " + calcularTotal() + " euros";
        resumen += "\n==============================\n";

        return resumen;
    }
}
