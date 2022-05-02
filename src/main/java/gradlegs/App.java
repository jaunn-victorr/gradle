package gradlegs;

public class App {
    public static void main(String[] args) {
        Genero g = new Genero();
        g.setId(-10);
        g.setNome("Aventura");

        PessoaFisica p = new PessoaFisica();
        p.setNome("José da Silva");
        p.setCPF("12345678910");

        System.out.println("olá gradle");
        System.out.println(g.getNome());
    
    }
}
