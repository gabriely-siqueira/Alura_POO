package aplicacao_audio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Musica extends Audio {
    private String cantor;
    private int anoLancamento;
    private String genero;

    public void mostrar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Genêro: " + getGenero());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + classificacao());


    }
}
