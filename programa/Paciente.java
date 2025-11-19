package programa;

public class Paciente extends Pessoa{
    private String id_paciente;
    private String plano;

    public Paciente() {}

    public String getId_paciente() {
        return id_paciente;
    }
    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }

    public void agendar_consulta(){

    }

    public void confirmar_presenca(){

    }

    public void acessar_historico(){

    }
} 