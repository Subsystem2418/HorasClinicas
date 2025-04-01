public class Profesional{
    private String run;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String especialidad;
    private String experiencia;
    private Boolean disponibilidadAtencion;

    public Profesional (String run, String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad, String experiencia){
        this.run = run;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.disponibilidadAtencion = true;
    }
    public String getRun() { return run; }
    public String getNombre() { return nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public String getEspecialidad() { return especialidad; }
    public String getExperiencia() { return experiencia; }
    public Boolean getDisponibilidadAtencion() { return disponibilidadAtencion; }
}