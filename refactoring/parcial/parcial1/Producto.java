public class Producto {
    private double precio;
    private double IVA;
    public double getPrecio() {
        return precio;
    }
    public double getIVA() {
        return IVA;
    }
    public Producto(double precio, double iVA) {
        this.precio = precio;
        IVA = iVA;
    }
    
}
