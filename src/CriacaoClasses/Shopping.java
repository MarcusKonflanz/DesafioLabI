package CriacaoClasses;

public class Shopping {
    public String nome;
    public Endereco endereco;
    public Loja[] lojas;


    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping{ " +
                "nome: " + nome +
                "Endereco: " + endereco +
                "Quantidade de lojas: " + lojas.length;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int count = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().contains(tipoLoja)) {
                count++;
            }
        }
        if (count > 0)
            return count;
        else
            return -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        int valorSeguro = 0;
        int lojaIndex = -1;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInf = (Informatica) lojas[i];
                if (lojaInf.getSeguroEletronicos() > valorSeguro) {
                    valorSeguro = (int) lojaInf.getSeguroEletronicos();
                    lojaIndex = i;
                }
            }
        }

        if (lojaIndex != -1)
            return (Informatica) lojas[lojaIndex];
        else
            return null;
    }
}
