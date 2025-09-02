public class Casa extends InmuebleVivienda{
    
    protected int numeroPisos;

    public Casa(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos){
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos=numeroPisos;
    
    }


    public int getNumeroPisos(){
    return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos){
    this.numeroPisos = numeroPisos;
    }

    public void imprimir (){
   
    super.imprimir();
    System.out.println("Numero de pisos" + numeroBaños);

    }
}
