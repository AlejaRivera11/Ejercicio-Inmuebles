
public class Objetos {
    public static void main(String[] args) {
        
        Inmueble inmueble1 = new Inmueble(101, 10, "Calle 12");
        inmueble1.calcularPrecioVenta(1000);
        inmueble1.imprimir();

        InmuebleVivienda inmuebleVivienda1 = new InmuebleVivienda(202, 10, "Centro", 4, 2);
        inmuebleVivienda1.imprimir();

        Casa casa1 = new Casa(202, 20, "Centro", 4, 2,2);
        casa1.calcularPrecioVenta(7000);
        casa1.imprimir();

        Apartamento apartamento1 = new Apartamento(304, 5, "Cali", 2, 1);
        apartamento1.calcularPrecioVenta(6000);
        apartamento1.imprimir();

        CasaConjuntoCerrado casa2 = new CasaConjuntoCerrado(109, 4, "Bogota", 2, 4, 2, 2500000, 20000, false, false);
        casa2.calcularPrecioVenta(2500000);
        casa2.imprimir();

        Local local1 = new Local(309, 21, "Bogota", tipo.CALLE);
        local1.calcularPrecioVenta(200000);
        local1.imprimir();
    }
}
