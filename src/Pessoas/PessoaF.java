package Pessoas;

import java.util.Date;

public class PessoaF extends Pessoas{
    private String Cpf;

    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public int calcularidade(Date data){

        return 1;
    }
}
