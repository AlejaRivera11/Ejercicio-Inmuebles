public class ApartamentoFamiliar extends Apartamento {
    
    protected double valorArea;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, double valorArea, int valorAdministracion){
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorArea= valorArea;
        this.valorAdministracion=valorAdministracion;
    
    }

    public double getvalorArea(){
    return valorArea;
    }

    public void setvalorArea(double valorArea){
    this.valorArea =  valorArea;
    }

    public int getvalorAdministracion(){
    return valorAdministracion;
    }

    public void setvalorAdministracion(int valorAdministracion){
    this.valorAdministracion = valorAdministracion;
    }

    public void imprimir(){
    super.imprimir();
    System.out.println("El  valor del area: $ " + valorArea);
    System.out.println("El valor de la administracion" + valorAdministracion);
    }
}
