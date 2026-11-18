package domain;

import java.util.ArrayList;
import java.util.List;

public class Treino {

    private final int id;
    private String nome;
    private String objetivo;
    private List<ExercicioPersonalizado> exercicios;

    public Treino(int id, String nome, String objetivo) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(ExercicioPersonalizado exercicio) {
        exercicios.add(exercicio);
    }

    public void removerExercicio(int id) {
        exercicios.removeIf(exercicio -> exercicio.getId() == id);
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public List<ExercicioPersonalizado> getExercicios() {
        return List.copyOf(exercicios);
    }
}