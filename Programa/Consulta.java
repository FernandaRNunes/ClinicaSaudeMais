package Programa;

public class Consulta {
    private int id_Consulta;
    private long data;
    private String status;
    private double preco;

    
    public int getId_Consulta() {
        return id_Consulta;
    }

    public void setId_Consulta(int id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void confirmar_Consulta(){

    }

    public void cancelar_Consulta(){

    }
}
