public class Paciente {
    private String run;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno; 
    private String contacto;

    public Paciente (String run, String nombre, String apellidoPaterno,String apellidoMaterno,String contacto){
        this.run = run;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contacto = contacto;
    }
    public String getRun() { return run; }
    public String getNombre() { return nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public String getContacto() { return contacto; }

    @Override
    public String toString() {
        return "\n------------------------------------ \nPaciente: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + ", \nContacto: " + contacto;
    }
}
