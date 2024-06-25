import br.com.aulascreenmatch.calculadoraDeTempo.CalculadoraDeTempo;
import br.com.aulascreenmatch.calculadoraDeTempo.FiltrodeRecomendacao;
import br.com.aulascreenmatch.modelos.Episodio;
import br.com.aulascreenmatch.modelos.Filme;
import br.com.aulascreenmatch.modelos.Seríe;

import java.util.ArrayList;

public class Principal {
 public static void main(String[] args) {
  Seríe minhaSerie = new Seríe("The Walking Dead", 2010);

  minhaSerie.setNome("The Walking dead");
  minhaSerie.setQuantidadeDeTemporadas(11);
  minhaSerie.setAnoDeLancamento(2010);
  //minhaSerie.somaDasAvaliacoes = 9.5;
  minhaSerie.setIncluidoNoPlano(true);
  minhaSerie.setDuracaoEmMinutos(500);


        System.out.println(minhaSerie.getNome());
        System.out.println(minhaSerie.getQuantidadeDeTemporadas());
        System.out.println(minhaSerie.getAnoDeLancamento());
        System.out.println(minhaSerie.getTotalDeAvaliacoes());


  minhaSerie.exibiFichaTecnica();
  minhaSerie.avalia(8);
  minhaSerie.avalia(5);
  minhaSerie.avalia(10);


  //System.out.println(minhaSerie.somaDasAvaliacoes);
  System.out.println("Total de avaliações" +minhaSerie.getTotalDeAvaliacoes());
  //minhaSerie.somaDasAvaliacoes =10;*/

  Filme meuFilme = new Filme("Poderoso Chefão",1978);
  meuFilme.setAnoDeLancamento(2022);
  meuFilme.exibiFichaTecnica();
  meuFilme.setRetro(true);
  meuFilme.setMinutosDoFilme(120);
  meuFilme.setAnoDeLancamento(1978);
  meuFilme.setDuracaoEmMinutos(180);

  System.out.println("Duração para acabar o filme " + meuFilme.getMinutosDoFilme());
  System.out.println("Nome do filme: " + meuFilme.getNome());
  System.out.println();


  Seríe outraSerie =new Seríe("The Walking dead", 2010);
  outraSerie.setQuantidadeDeTemporadas(11);
  //minhaSerie.somaDasAvaliacoes = 9.5;
  outraSerie.setIncluidoNoPlano(true);
  outraSerie.setDuracaoEmMinutos(250);

  CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
  calculadora.inclui(meuFilme);
  calculadora.inclui(outraSerie);
  calculadora.inclui(minhaSerie);

  System.out.println(calculadora.getTempoTotal());

  FiltrodeRecomendacao filtro = new FiltrodeRecomendacao();


  Episodio episodio = new Episodio();
  episodio.setNumero(1);
  episodio.setSerie("The walking dead");
  episodio.setTotalVisualizacoes(500);
  filtro.filtra(episodio);

  var filmeDoRuan = new Filme("Os Suspeitos",2013);
  filmeDoRuan.setDuracaoEmMinutos(250);
  filmeDoRuan.setNome("Os Suspeitos");
  filmeDoRuan.setAnoDeLancamento(2013);
  filmeDoRuan.avalia(10);

  ArrayList<Filme>listaDeFilmes = new ArrayList<>();
  listaDeFilmes.add(filmeDoRuan);
  System.out.println("Tamanho da lista " + listaDeFilmes.size() );
  System.out.println("Filme: " + listaDeFilmes.get(0).getNome());
  System.out.println("listaDeFilmes");


  }
 }

