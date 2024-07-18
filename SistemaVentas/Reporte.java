public class Reporte {
    private String id;
    private String fecha;
    private String tipo;
    private String datos;

    public Reporte(String id, String fecha, String tipo, String datos) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.datos = datos;
    }

    public void generarReporte() {
        System.out.println("Reporte generado: " + tipo + " - " + datos);
    }
}
