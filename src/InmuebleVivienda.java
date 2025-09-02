public class InmuebleVivienda extends Inmueble {

    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños){
        super(identificadorInmueble, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;   
    }
    
    
    public int getNumeroHabitaciones(){
    return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones){
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños(){
       return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños){
        this.numeroBaños = numeroBaños;   
    }

    public void imprimir(){
    
    super.imprimir();
    System.out.println("El numero de habitaciones es: " + numeroHabitaciones);
    System.out.println("El numero de baños es: " + numeroBaños);
    }

}

