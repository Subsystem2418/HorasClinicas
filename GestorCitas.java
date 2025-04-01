import java.util.ArrayList;
import java.util.List;

public class GestorCitas{
    private List<CitaMedica> citas = new ArrayList<>();
    public void agregarCita(CitaMedica cita, Profesional profesional, Paciente paciente){
        if (!cita.getMedico().getDisponibilidadAtencion()) {
            System.out.println("\n------------------------------------\nNo se puede agendar la cita. \nEl médico no está disponible.");
            return;
        }else {
            System.out.printf(paciente.toString());
            citas.add(cita);
        }
    }
    public void eliminarCita(String fecha, String hora){
        citas.removeIf(c -> c.getFecha().equals(fecha) && c.getHora().equals(hora));
    }

    public List<CitaMedica> mostrarCitas(){
        return citas;
    }

    public CitaMedica buscarCita(String fecha, String hora) {
        CitaMedica cita = citas.stream()
                .filter(c -> c.getFecha().equals(fecha) && c.getHora().equals(hora))
                .findFirst()
                .orElse(null);

        if (cita != null) {
            System.out.println("\n------------------------------------\nCita encontrada: \nCentro: " + cita.getCentro().getNombre() +
                    "\nMédico: " + cita.getMedico().getNombre() + " " + cita.getMedico().getApellidoPaterno() +
                    "\nPaciente: " + cita.getPaciente().getNombre() + " " + cita.getPaciente().getApellidoPaterno() +
                    "\nFecha: " + cita.getFecha() +
                    "\nHora: " + cita.getHora() +
                    "\nMotivo: " + cita.getMotivo());
        } else {
            System.out.println("No se encontró ninguna cita para la fecha y hora especificadas.");
        }

        return cita;
    }
}