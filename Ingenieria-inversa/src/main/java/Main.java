public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jesús", "jesus@example.com", "Calle Falsa 123");
        Pedido pedido = new Pedido(cliente);

        ProductoFisico libro = new ProductoFisico("Harry Potter  1", 24.90, 3.50);
        ProductoDigital curso = new ProductoDigital("Rubius 2009", 19.99, 1200);
        ProductoDigital bandaSonora = new ProductoDigital("Los secretos de YouTube", 8.99);

        pedido.agregarProducto(libro);
        pedido.agregarProducto(curso);
        pedido.agregarProducto(bandaSonora);

        System.out.println(pedido.mostrarResumen());
    }
}
