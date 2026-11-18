package domain;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

    private String especialidade;
    private List<Aluno> alunos;

    public Instrutor(int id, String nome, int idade, String especialidade) {
        super(id, nome, idade);
        this.especialidade = especialidade;
        this.alunos = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Aluno> getAlunos() {
        return List.copyOf(alunos);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }


    @Override
    public String getDescricao() {
        return "Instrutor: " + getNome()
                + "\nID: " + getId()
                + "\nIdade: " + getIdade()
                + "\nEspecialidade: " + especialidade;
    }
}