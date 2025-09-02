public class CasaConjuntoCerrado extends CasaUrbana{
    
    protected double valorArea;
    protected double valorAdministracion;
    protected boolean tienePisina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmueble,int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, double valorArea, double valorAdministracion, boolean tienePisina, boolean tieneCamposDeportivos){
        super(identificadorInmueble, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea=valorArea;
        this.valorAdministracion=valorAdministracion;
        this.tienePisina= tienePisina;
        this.tieneCamposDeportivos=tieneCamposDeportivos;   
    }

    public void calcularPrecioVenta(double valorArea){
        super.calcularPrecioVenta(valorArea);
        this.precioVenta += valorAdministracion;
    }

    public double getvalorArea(){
    return valorArea;
    }

    public void setvalorArea(double valorArea){
    this.valorArea= valorArea;
    }

    public double getvalorAdministracion(){
    return valorAdministracion;
    }

    public void setvalorAdministracion(double valorAdministracion){
    this.valorAdministracion=valorAdministracion;
    }

    public boolean gettienePisina(){
        return tienePisina;
    }

    public void settienePisina(boolean tienePisina){
        this.tienePisina =tienePisina;
    
    }

    public boolean getTieneCamposDeportivos(){
    return tieneCamposDeportivos;
    }

    public void setTieneCamposDeportivos(boolean tieneCamposDeportivos){
    this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public void imprimir(){
    super.imprimir();
    System.out.println("El valor del area : $" +valorArea);
    System.out.println("El valor Administracion :$ " +valorAdministracion);
    System.out.println("¿Tiene piscina?" + tienePisina);
    System.out.println("Tiene Campos Deportivos" + tieneCamposDeportivos);
    }
}
