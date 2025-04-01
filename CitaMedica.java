public class CitaMedica {
    private CentroClinico centro;
    private Medico medico;
    private Paciente paciente;
    private String fecha;
    private String hora;
    private String motivo;

    public CitaMedica(CentroClinico centro, Medico medico, Paciente paciente, String fecha, String hora, String motivo) {
        this.centro = centro;
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;}

        public CentroClinico getCentro() { return centro; }
        public Medico getMedico() { return medico; }
        public Paciente getPaciente() { return paciente; }
        public String getFecha() { return fecha; }
        public String getHora() { return hora; }
        public String getMotivo() { return motivo; }

}
