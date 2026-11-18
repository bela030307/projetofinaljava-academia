package domain;

public class Plano {

    private final int id;
    private String nome;
    private double valorBase;
    private PoliticaDesconto politica;

    public Plano(int id, String nome, double valorBase,
                 PoliticaDesconto politica) {
        this.id = id;
        this.nome = nome;
        this.valorBase = valorBase;
        this.politica = politica;
    }

    public double calcularValor() {
        return politica.calcularValor(valorBase);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public PoliticaDesconto getPolitica() {
        return politica;
    }

    public void setPolitica(PoliticaDesconto politica) {
        this.politica = politica;
    }
}