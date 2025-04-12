package CriacaoClasses;
import  java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Produto {
    public String nome;
    public double preco;
    public Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: {" +
                "Nome: " + nome +
                " Preco: " + preco
                + "Data validade: " + dataValidade
                + "}";
    }

    public Boolean estaVencido(Data dataValidade){
        boolean estaVencido = false;
        LocalDate data = LocalDate.now();
        Data dataAtual = new Data(data.getDayOfMonth(), data.getMonthValue(), data.getYear());

        if(dataValidade.ano >= dataAtual.ano || dataValidade.mes >= dataAtual.mes){
            estaVencido = true;
        }
        return estaVencido;
    }
}
