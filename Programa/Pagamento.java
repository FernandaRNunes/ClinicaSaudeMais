package Programa;

public class Pagamento {
    private double valor_consulta;
    private String forma_pagamento;
    private int id_paciente;
    private boolean status_pagamento;

    
    public double getValor_consulta() {
        return valor_consulta;
    }


    public void setValor_consulta(double valor_consulta) {
        this.valor_consulta = valor_consulta;
    }


    public String getForma_pagamento() {
        return forma_pagamento;
    }


    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }


    public int getId_paciente() {
        return id_paciente;
    }


    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


    public boolean isStatus_pagamento() {
        return status_pagamento;
    }


    public void setStatus_pagamento(boolean status_pagamento) {
        this.status_pagamento = status_pagamento;
    }


    public void processar_pagamento (){

    }
}
