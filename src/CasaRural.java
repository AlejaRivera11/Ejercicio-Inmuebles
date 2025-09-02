public class CasaRural extends Casa{
    protected double valorArea;
    protected int distanciaCabera;
    protected int altitud;


    public CasaRural(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, double valorArea, int distanciaCabera, int altitud){
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea = valorArea;
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    public double getValorArea(){
    return valorArea;
    }

    public void setValorArea(double valorArea){
    this.valorArea= valorArea;
    }

    public int getDistanciaCabera(){
    return distanciaCabera;
    }

    public void setDistanciaCabera(int distanciaCabera){
    this.distanciaCabera = distanciaCabera;
    }

    public int getAltitud(){
    return altitud;
    }

    public void setAltitud(int altitud){
    this.altitud = altitud;
    }

    public void imprimir(){
    super.imprimir();
    System.out.println("El valor del area es: $ " + valorArea);
    System.out.println("La distancia a la cabecera municipal es: " + distanciaCabera);
    System.out.println("La altitud sobre el nivel del mar es: " + altitud);
    }
}
