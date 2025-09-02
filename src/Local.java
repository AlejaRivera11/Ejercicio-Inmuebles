
public class Local extends Inmueble {

    protected tipo tipoLocal;

    public Local (int identificadorInmueble,int area, String direccion, tipo tipoLocal){
    super(identificadorInmueble, area, direccion);
    this.tipoLocal=tipoLocal;
    }


    public void imprimir () {
     super.imprimir();
     System.out.println("Tipo de Local " + tipoLocal);
    }


    
}
