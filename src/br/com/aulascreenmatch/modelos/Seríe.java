package br.com.aulascreenmatch.modelos;

public class Seríe extends Titulo {
    private int quantidadeDeTemporadas;

    public Seríe(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getQuantidadeDeTemporadas() {
        return quantidadeDeTemporadas;
    }

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
