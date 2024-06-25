package br.com.aulascreenmatch.calculadoraDeTempo;

import br.com.aulascreenmatch.modelos.Filme;
import br.com.aulascreenmatch.modelos.Seríe;
import br.com.aulascreenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getMinutosDoFilme();
//    }
//    public void inclui(Seríe s){
//        tempoTotal += s.getMinutosPorEpisodio();
//    }

    public void inclui (Titulo titulo){
        this.tempoTotal+=titulo.getDuracaoEmMinutos();

    }

}
