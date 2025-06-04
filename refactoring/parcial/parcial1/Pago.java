public class Pago {
    private List<Producto> productos;
    private String tipo;
    private static final double ADICIONAL_TARJETA = 1000.0;
    private static final double DESCUENTO_EFECTIVO = 2000.0;
    public Pago(List<Producto> productos, String tipo) {
        this.productos = productos;
        this.tipo = tipo;
    }

    
}
