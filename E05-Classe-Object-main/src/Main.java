import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                                        new Date(), "111.111.111-11", 36, 'm');
        Cliente pudjol = new PessoaFisica("pudjol", "Santa Cruz",
                new Date(), "141.013.976-69", 19, 'm');
        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                                        new Date(), "000.00000.0000/0001", 25, "Comércio");
        Cliente lojinha2 = new PessoaJuridica("Loja R$1,99", "Itapetinga, 30",
                new Date(), "000.00000.0000/0001", 25, "Comércio");
        Cliente loja = new PessoaJuridica("Lojona", "Av. Afonso Pena, 3050",
                new Date(), "000.00000.0000/0016", 25, "Comércio");


        Conta conta1 = new Conta(1234, joao, 0, 1500);
        Conta conta2 = new Conta(12121, lojinha, 10000, 1500);

        conta1.depositar(3000);
        conta1.depositar(2000);
        conta1.sacar(500);
        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        System.out.println(conta1.equals(conta2));

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);

        System.out.println(joao.equals(joao));
        System.out.println(joao.equals(pudjol));
        System.out.println(loja.equals(lojinha));

    }
}