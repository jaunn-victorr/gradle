package gradlegs;

public class PessoaFisica extends Pessoa{
    private String CPF;
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
}
