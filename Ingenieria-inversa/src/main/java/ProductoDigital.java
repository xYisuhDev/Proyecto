public class ProductoDigital extends Producto {

    private final double tamanoDescarga; // en MB por ejemplo
    private static final double IVA_DIGITAL = 0.10;

    public ProductoDigital(String nombre, double precio) {
        this(nombre, precio, 0.0);
    }

    public ProductoDigital(String nombre, double precio, double tamanoDescarga) {
        super(nombre, precio);
        this.tamanoDescarga = tamanoDescarga;
    }

    public double getTamanoDescarga() {
        return tamanoDescarga;
    }

    @Override
    public double calcularPrecioFinal() {
        double base = getPrecio();
        return base + (base * IVA_DIGITAL);
    }

    @Override
    public String toString() {
        return getNombre() + " (Digital) - Precio base: " + getPrecio() +
                " | Tamaño: " + tamanoDescarga + "MB" +
                " | Total: " + calcularPrecioFinal();
    }
}
