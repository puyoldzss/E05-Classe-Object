import java.util.Date;

public class PessoaFisica extends Cliente {

    private String cpf;

    private int idade;

    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("---- PF ----");
        System.out.println("nome = " + this.getNome());
        System.out.println("data = " + this.getData());
        System.out.println("endereco = " + this.getEndereco());

        System.out.println("cpf = " + cpf);
        System.out.println("idade = " + idade);
        System.out.println("genero = " + genero);
        System.out.println("------------");
    }

}
