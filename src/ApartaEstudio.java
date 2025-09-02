public class ApartaEstudio extends Apartamento{
    
    private double valorArea;

    public ApartaEstudio(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, double valorArea) { 
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorArea=valorArea;   
    
    }

    public double getvalorArea(){
    return valorArea;
    }

    public void setvalorArea(double valorArea){
    this.valorArea =  valorArea;
    }

    public void imprimir(){
    super.imprimir();
    System.out.println("El  valor del area: $ " + valorArea);
    }
}
