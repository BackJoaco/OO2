import java.time.LocalDate;

public class Pedido {
  private Cliente cliente;
  private List<Producto> productos;
  private String formaPago;

  public Pedido(Cliente cliente, List<Producto> productos, String formaPago) {
     if (!"efectivo".equals(formaPago)
        && !"6 cuotas".equals(formaPago)
        && !"12 cuotas".equals(formaPago)) {
          throw new Error("Forma de pago incorrecta");
    }
    this.cliente = cliente;
    this.productos = productos;
    this.formaPago = formaPago;
   }
   public double calcularDescuento(double costoProductos, double extraFormaPago){
        if (this.cliente.aniosDesdeFechaAlta() > 5){
            return (costoProductos + extraFormaPago) * 0.9;
        }
        return costoProductos + extraFormaPago;
    }
   public double getCostoTotal() {
     double costoProductos = this.productos.Stream().mapToDouble(p -> p.getPrecio()).sum();
     double extraFormaPago = this.formaPago.calcularExtra(costoProductos);
     return calcularDescuento(costoProductos, extraFormaPago);
   }
 }
 public class Cliente {
   private LocalDate fechaAlta;
   public LocalDate getFechaAlta() {
     return this.fechaAlta;
   }
   public int aniosDesdeFechaAlta(){
        return Period.between(this.getFechaAlta(), LocalDate.now()).getYears();
   }
 }
 public class Producto {
   private double precio;
   public double getPrecio() {
     return this.precio;
   }
 }
 public interface FormaPago{
    public double calcularExtra(double costoProductos);
 }
 public class Efectivo implements FormaPago {
    public double calcularExtra(double costoProductos){
        return 1;
    }
 }
 public class SeisCuotas implements FormaPago{
    public double calcularExtra(double costoProductos){
        return 0.2;
    }
 }
 public class DoceCuotas implements FormaPago{
    public double calcularExtra(double costoProductos){
        return 0.5;
    }
 }