public class Inmueble {
    //Definicion de variables 
   protected int identificadorInmueble;
   protected int area;
   protected String direccion;
   protected double precioVenta;

   public Inmueble() {
    }
    
   public Inmueble (int identificadorInmueble,int area, String direccion){
    this.identificadorInmueble = identificadorInmueble;
    this.area = area;
    this.direccion = direccion;
   }

  public void calcularPrecioVenta(double valorArea){
    this.precioVenta = area * valorArea;
   }

   public int getidentificadorInmueble(){
    return identificadorInmueble;
    }

   public int getarea(){
    return area;
   }

   public void setArea(int area){
    this.area = area;
  }

  public String getDirrecion(){
  return direccion;
  }

  public void setDireccion(String direccion){
  this.direccion = direccion;
  }

  public double getPrecioVenta(){
  return precioVenta;
  }

  public void setPrecioVenta(double precioVenta){
    this.precioVenta= precioVenta;
  }


   public void imprimir(){
    System.out.println("----Informacion del inmueble-----");
    System.out.println("El identificador es: " + identificadorInmueble);
    System.out.println("El area del inmuebles es : " + area);
    System.out.println("La direccion es: " + direccion);
    System.out.println("El precio es: $" + precioVenta);
   }

   

}
