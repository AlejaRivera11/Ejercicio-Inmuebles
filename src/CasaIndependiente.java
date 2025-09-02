public class CasaIndependiente extends CasaUrbana{

    protected double valorArea;

    public CasaIndependiente (int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, double valorArea){
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea = valorArea;
    }

    public double getValorArea(){
    return valorArea;
    }

    public void setValorArea(double valorArea){
        this.valorArea = valorArea;
    }

    public void imprimir(){
    super.imprimir();
    System.out.println("El valor del area es: $ " + valorArea);
    }
}
