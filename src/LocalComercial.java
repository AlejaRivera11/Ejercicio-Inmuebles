public class LocalComercial extends Local {

    protected double valorArea;
    protected String centroComercial;

    public LocalComercial(int identificadorInmueble,int area, String direccion, tipo tipoLocal, double valorArea, String centroComercial){
        super(identificadorInmueble, area, direccion, tipoLocal);
        this.valorArea= valorArea;
        this.centroComercial=centroComercial;
    
    }
    
    public double getValorArea(){
    return valorArea;
    }

    public void setValorArea(double valorArea){
        this.valorArea= valorArea;
    }

    public String getCentroComercial(){
    return centroComercial;
    }

    public void setCentroComercial(String centroComercial){
    this.centroComercial= centroComercial;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor del Area : $" + valorArea);
        System.out.println("Centro comercial :" + centroComercial);
    }
    
}
