package domain;

import java.time.YearMonth;

public class HistoricoPlano {

    private final YearMonth competenciaInicio;
    private final Plano plano;
    private final double valorMensal;

    public HistoricoPlano(YearMonth competenciaInicio, Plano plano) {
        this.competenciaInicio = competenciaInicio;
        this.plano = plano;
        this.valorMensal = plano.calcularValor();
    }

    public YearMonth getCompetenciaInicio() {
        return competenciaInicio;
    }

    public Plano getPlano() {
        return plano;
    }

    public double getValorMensal() {
        return valorMensal;
    }
}