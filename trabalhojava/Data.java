package trabalhojava;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor (opcional, se quiser inicializar)
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }
}
