package CriacaoClasses;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    public Endereco endereco;
    public Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }
    public Loja (String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    @Override
    public String toString() {
        return "Loja: {" +
                "Nome: " + nome +
                " Quantidade Funcionarios: " + quantidadeFuncionarios +
                " Salario Base Funcionarios: " + salarioBaseFuncionario +
                ", endereco: " + endereco +
                ", data: " + dataFundacao + " }";
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
}
