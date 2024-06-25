package br.com.aulascreenmatch.modelos;

import br.com.aulascreenmatch.calculadoraDeTempo.Classificavel;

public class Episodio implements Classificavel {
    private String serie;
    private int numero;
    private Seríe seríe;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Seríe getSeríe() {
        return seríe;
    }

    public void setSeríe(Seríe seríe) {
        this.seríe = seríe;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
