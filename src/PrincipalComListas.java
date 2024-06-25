
import br.com.aulascreenmatch.modelos.Filme;
import br.com.aulascreenmatch.modelos.Seríe;
import br.com.aulascreenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filmeDoRuan = new Filme("Os suspeitos", 2013);
        Seríe outraSerie = new Seríe("The Walking dead", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoRuan);
        lista.add(outraSerie);
        for (Titulo item : lista) {
            System.out.println(item);
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + ((Filme) item).getClassificacao());

            }
        }


        Collections.sort(lista);
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);



    }
}
