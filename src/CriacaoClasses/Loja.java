package CriacaoClasses;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    public Endereco endereco;
    public Data dataFundacao;
    public Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos ) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos ) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario(){
        double i = 0;
        if (salarioBaseFuncionario != -1) {
            i = quantidadeFuncionarios * salarioBaseFuncionario;
        } else {
            i = -1;
            return i;
        }
        return i;
    }
    public char tamanhoDaLoja(){
        char tamanhoLoja = '\u0000';

        if (quantidadeFuncionarios < 10) {
            return tamanhoLoja = 'P';
        }
        if (quantidadeFuncionarios >= 30) {
            return tamanhoLoja = 'M';
        }
        else {
            return tamanhoLoja = 'G';
        }
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            System.out.println(estoqueProdutos[i]);
        }
    }
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Loja: {" +
                "Nome: " + nome +
                ", Quantidade Funcionarios: " + quantidadeFuncionarios +
                ", Salario Base Funcionarios: " + salarioBaseFuncionario +
                ", Endereco: " + endereco +
                ", Data Fundação: " + dataFundacao +
                ", Estoque Produtos: " + estoqueProdutos.length +
                " }";
    }
}