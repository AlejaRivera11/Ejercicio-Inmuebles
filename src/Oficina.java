public class Oficina extends Local{

    protected double valorArea;
    protected boolean esGobierno;

     public Oficina(int identificadorInmueble,int area, String direccion, tipo tipoLocal, double valorArea, boolean esGobierno){
        super(identificadorInmueble, area, direccion, tipoLocal);
        this.valorArea= valorArea;
        this.esGobierno= esGobierno;
    
    }

    public double getValorArea(){
    return valorArea;
    }

    public void setValorArea(double valorArea){
        this.valorArea= valorArea;
    }

    public boolean getEsGobierno(){
    return esGobierno;
    }

    public void setEsGobierno(boolean esGobierno){
    this.esGobierno= esGobierno;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor area :" + valorArea);
        System.out.println("Es del gobierno "+ esGobierno);
    }
}
