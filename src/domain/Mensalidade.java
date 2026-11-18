package domain;

import java.time.LocalDate;
import java.time.YearMonth;

public class Mensalidade {

    private final int id;
    private final YearMonth competencia;
    private final LocalDate vencimento;
    private final double valorCobrado;
    private LocalDate dataPagamento;
    private final Plano plano;

    public Mensalidade(int id, YearMonth competencia,
                       LocalDate vencimento, Plano plano) {

        this.id = id;
        this.competencia = competencia;
        this.vencimento = vencimento;
        this.plano = plano;

        this.valorCobrado = plano.calcularValor();
        this.dataPagamento = null;
    }

    public void registrarPagamento(LocalDate dataPagamento) {
        if (this.dataPagamento != null) {
            throw new IllegalStateException("Mensalidade já foi paga.");
        }

        if (dataPagamento == null) {
            throw new IllegalArgumentException("Informe a data do pagamento.");
        }

        this.dataPagamento = dataPagamento;
    }

    public boolean estaPaga() {
        return dataPagamento != null;
    }

    public boolean estaAtrasada(LocalDate hoje) {
        return !estaPaga() && hoje.isAfter(vencimento); // mensalidade não está paga E a data atual é posterior à data de vencimento.
    }

    public int getId() {
        return id;
    }

    public YearMonth getCompetencia() {
        return competencia;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public Plano getPlano() {
        return plano;
    }
}