import java.util.Date;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    private int numFuncionarios;

    private String setor;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        System.out.println("---- PJ ----");
        System.out.println("nome = " + this.getNome());
        System.out.println("data = " + this.getData());
        System.out.println("endereco = " + this.getEndereco());

        System.out.println("cnpj = " + cnpj);
        System.out.println("numFuncionarios = " + numFuncionarios);
        System.out.println("setor = " + setor);
        System.out.println("------------");
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}

