package Programa;

public class Notificacao {
    private String mensagem;
    private long dataEnvio;
    private int id_paciente;

    
    public String getMensagem() {
        return mensagem;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public long getDataEnvio() {
        return dataEnvio;
    }


    public void setDataEnvio(long dataEnvio) {
        this.dataEnvio = dataEnvio;
    }


    public int getId_paciente() {
        return id_paciente;
    }


    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


    public void enviar(){

    }
    
}
