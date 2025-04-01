public class CentroClinico{
    private String nombre;
    private String ubicacion;
    private String infraestructura;

    public CentroClinico(String nombre, String ubicacion, String infraestructura){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.infraestructura = infraestructura;
    }
    public String getNombre(){return nombre;}
    public String getubicacion(){return ubicacion;}
    public String getInfraestructura() {return infraestructura;}
}