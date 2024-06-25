package br.com.aulascreenmatch.modelos;

public class Filme extends Titulo {
private boolean retro;
private int minutosDoFilme;
private int anoDeLancamento;
private double classificacao;

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    private String nome;

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

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
