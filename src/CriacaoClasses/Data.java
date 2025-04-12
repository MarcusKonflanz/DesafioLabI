package CriacaoClasses;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasNoMes(mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    // INICIO Verifica ano bissexto para validar classe construtora.
    private int diasNoMes(int mes, int ano) {
        return switch (mes) {
            case 2 -> (verificaAnoBissexto() ? 29 : 28);
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    // FIM Verifica ano bissexto para validar classe construtora.

    @Override
    public String toString() {
        return "Data {" +
                  dia + "/" + "/" + mes + "/" + ano + " }";
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
