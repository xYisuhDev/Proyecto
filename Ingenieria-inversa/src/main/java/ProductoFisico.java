public class ProductoFisico extends Producto {

    private final double costeEnvio;

    public ProductoFisico(String nombre, double precio, double costeEnvio) {
        super(nombre, precio);
        this.costeEnvio = costeEnvio;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + costeEnvio;
    }

    @Override
    public String toString() {
        return getNombre() + " (Físico) - Precio base: " + getPrecio() +
                " | Coste envío: " + costeEnvio + " euros" +
                " | Total: " + calcularPrecioFinal();
    }
}
