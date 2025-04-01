import java.util.ArrayList;
import java.util.List;

public class GestorCitas{
    private List<CitaMedica> citas = new ArrayList<>();
    public void agregarCita(CitaMedica cita){
        citas.add(cita);
    }
    public void eliminarCita(String fecha, String hora){
        citas.removeIf(c -> c.getFecha().equals(fecha) && c.getHora().equals(hora));
    }

    public List<CitaMedica> mostrarCitas(){
        return citas;
    }

    public CitaMedica buscarCita(String fecha, String hora){
        return citas.stream()
            .filter(C -> C.getFecha().equals(fecha) && C.getHora().equals(hora))
            .findFirst()
            .orElse(null);
    }
}