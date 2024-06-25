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
  minhaSerie.setIncluidoNoPlano(true);
  minhaSerie.setDuracaoEmMinutos(500);

  System.out.println(minhaSerie.getNome());
  System.out.println(minhaSerie.getQuantidadeDeTemporadas());
  System.out.println(minhaSerie.getAnoDeLancamento());
  System.out.println(minhaSerie.getTotalDeAvaliacoes());

  minhaSerie.exibiFichaTecnica();
  minhaSerie.avalia(9);
  minhaSerie.avalia(5);
  minhaSerie.avalia(7);

  System.out.println("Média das avaliações: " + minhaSerie.pegaMedia());

  Filme meuFilme = new Filme("Os suspeitos", 2013);
  meuFilme.setDuracaoEmMinutos(120);
  meuFilme.setIncluidoNoPlano(true);
  meuFilme.setNota(8.1);

  CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
  calculadora.inclui(minhaSerie);
  calculadora.inclui(meuFilme);

  System.out.println(calculadora.getTempoTotal());

  FiltrodeRecomendacao filtro = new FiltrodeRecomendacao();
  filtro.filtra(meuFilme);

  Episodio episodio = new Episodio();
  episodio.setNumero(1);
  episodio.setSerie("The Walking Dead");
  episodio.setTotalVisualizacoes(300);

  filtro.filtra(episodio);

  var filmeDoPaulo = new Filme("Dogville", 2003);
  filmeDoPaulo.setDuracaoEmMinutos(200);
  filmeDoPaulo.setIncluidoNoPlano(true);
  filmeDoPaulo.setNota(10);

  ArrayList<Filme> listaDeFilmes = new ArrayList<>();
  listaDeFilmes.add(filmeDoPaulo);
  listaDeFilmes.add(meuFilme);
  System.out.println("Tamanho da lista: " + listaDeFilmes.size());
  System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
  System.out.println(listaDeFilmes);
  System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
 }
}
