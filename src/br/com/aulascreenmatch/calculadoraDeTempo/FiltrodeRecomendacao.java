package br.com.aulascreenmatch.calculadoraDeTempo;

public class FiltrodeRecomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao >= 4){
            System.out.println("Uma das melhores seríes do momento");
        }else if (classificavel.getClassificacao >= 2) {
            System.out.println("Seríe muito bem avaliada");
        } else {
            System.out.println("Vale a pena assistir depois");
        }
    }



}
