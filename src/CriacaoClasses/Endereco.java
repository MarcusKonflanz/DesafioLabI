package CriacaoClasses;

public class Endereco {
    public String nomeRua;
    public String cidade;
    public String estado;
    public String pais;
    public String cep;
    public String numero;
    public String complemento;


    public Endereco(String nomeRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeRua = nomeRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    public String getNomeDaRua(){
        return nomeRua;
    }
    public void setNomeDaRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getCep(){
        return cep;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco {" +
                "nomeRua:" + nomeRua +
                ", cidade:" + cidade +
                ", estado: " + estado +
                ", pais: " + pais +
                ", cep: " + cep +
                ", numero: " + numero +
                ", complemento: " + complemento + ". }";
    }
}
