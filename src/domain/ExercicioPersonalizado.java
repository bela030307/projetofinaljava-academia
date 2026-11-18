package domain;

public class ExercicioPersonalizado {

    private final int id;
    private int series;
    private int repeticoes;
    private double carga;
    private Exercicio exercicio; //agregacao

    public ExercicioPersonalizado(int id, int series, int repeticoes,
                                  double carga, Exercicio exercicio) {
        this.id = id;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.exercicio = exercicio;
    }

    public int getId() {
        return id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }
}