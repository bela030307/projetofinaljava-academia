package domain;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Aluno extends Pessoa {

    private List<Treino> treinos;
    private List<Mensalidade> mensalidades;
    private Plano plano;
    private final LocalDate dataCadastro;

    public Aluno(int id, String nome, int idade, Plano plano,LocalDate dataCadastro) {
        super(id, nome, idade);

        this.plano = plano;
        this.treinos = new ArrayList<>();
        this.mensalidades = new ArrayList<>();
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public List<Treino> getTreinos() {
        return List.copyOf(treinos); //list.copyOf --> impedir que outras classes modifiquem diretamente a lista
    }

    public List<Mensalidade> getMensalidades() {
        return List.copyOf(mensalidades);
    }

    public Plano getPlano() {
        return plano;
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    public void removerTreino(int id) {
        treinos.removeIf(treino -> treino.getId() == id); //percorre a lista e remove os treinos que satisfazem a condição.
    }

    public Treino buscarTreino(int id) {
        for (Treino treino : treinos) {
            if (treino.getId() == id) {
                return treino;
            }
        }
        return null;
    }

    public void adicionarMensalidade(Mensalidade mensalidade) {
        mensalidades.add(mensalidade);
    }

    public void removerMensalidade(int id) {
        mensalidades.removeIf(mensalidade -> mensalidade.getId() == id);
    }

    public Mensalidade buscarMensalidade(int id) {
        for (Mensalidade mensalidade : mensalidades) {
            if (mensalidade.getId() == id) {
                return mensalidade;
            }
        }
        return null;
    }

    public void alterarPlano(Plano plano) {
        this.plano = plano;
    }



    @Override
    public String getDescricao() {
        return "Aluno: " + getNome()
                + "\nID: " + getId()
                + "\nIdade: " + getIdade()
                + "\nPlano: " + plano.getNome();
    }

}