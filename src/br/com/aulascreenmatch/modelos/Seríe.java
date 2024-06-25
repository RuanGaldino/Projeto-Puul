package br.com.aulascreenmatch.modelos;

import br.com.aulascreenmatch.calculadoraDeTempo.Classificavel;

public class Seríe extends Titulo {

    private String diretor;

    public Seríe(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
        }
    }





