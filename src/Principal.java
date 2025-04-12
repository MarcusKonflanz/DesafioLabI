import CriacaoClasses.*;


public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        int dia = 0;
        int mes = 0;
        int ano = 0;

        do {
            System.out.println("MENU: ");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair ");
            opcao = Teclado.leInt("Informe a opcao desejada: ");

            switch (opcao) {
                case 1:
                    String nomeLoja = Teclado.leString("Informe o nome da loja: ");
                    int quantidadeFuncionario = Teclado.leInt("Informe a quantidade de funcionarios: ");
                    double salarioBase = Teclado.leDouble("Informe o salario base: ");
                    String nomeRua = Teclado.leString("Informe a rua da loja: ");
                    String cidade = Teclado.leString("Informe a cidade da loja: ");
                    String estado = Teclado.leString("Informe o estado da loja: ");
                    String pais = Teclado.leString("Informe o pais da loja: ");
                    String cep = Teclado.leString("Informe o cep da loja: ");
                    String numero = Teclado.leString("Informe o numero da loja: ");
                    String complemento = Teclado.leString("Informe o complemento da loja: ");
                    dia = Teclado.leInt("Informe o dia de criacao da loja: ");
                    mes = Teclado.leInt("Informe o mes de criacao da loja:: ");
                    ano = Teclado.leInt("Informe o ano de criacao da loja:: ");

                    Data dataFundacao = new Data(dia, mes, ano);
                    Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                    Loja loja = new Loja(nomeLoja, quantidadeFuncionario, salarioBase, endereco, dataFundacao);

                    System.out.println(loja);
                    break;

                case 2:
                    String nomeProduto = Teclado.leString("Informe o nome do produto: ");
                    double precoProduto = Teclado.leDouble("Informe o preco do produto: ");
                    dia = Teclado.leInt("Informe o dia de vencimento do produto: ");
                    mes = Teclado.leInt("Informe o dia de vencimento do produto: ");
                    ano = Teclado.leInt("Informe o dia de vencimento do produto: ");

                    Data dataVencimento = new Data(dia, mes, ano);
                    Produto produto = new Produto(nomeProduto, precoProduto, dataVencimento);
                    System.out.println(produto);
                    break;

                case 3:
                    System.out.println("Saindo do programa!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;

            }
        } while (opcao != 3);
    }
}
