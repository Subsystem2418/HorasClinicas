public class Main {
    public static void main(String[] args) {
        CentroClinico centro = new CentroClinico("Clinica Alemana de Temuco", "Senador Estébanez 645", "Moderna");
        Profesional medico = new Profesional("123349680", "Oscar", "Aguayo", "Benzan", "Cardiologo", "5 años", true);
        Paciente paciente = new Paciente("197843492", "Hector", "Chavez", "Vejar", "944070642");

        GestorCitas gestor = new GestorCitas();
        CitaMedica cita = new CitaMedica(centro, medico, paciente, "2025-04-10", "10:00", "Chequeo general");

        gestor.agregarCita(cita , medico, paciente);


        CitaMedica encontrada = gestor.buscarCita("2025-04-10", "10:00");


    }
}