package br.com.aulascreenmatch.modelos;

import br.com.aulascreenmatch.calculadoraDeTempo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private boolean retro;
    private int minutosDoFilme;
    private double classificacao;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    public int getMinutosDoFilme() {
        return minutosDoFilme;
    }

    public void setMinutosDoFilme(int minutosDoFilme) {
        this.minutosDoFilme = minutosDoFilme;
    }

    public double getNota() {
        return classificacao;
    }

    public void setNota(double classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public int getClassificacao() {
        return (int) Math.round(classificacao);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
