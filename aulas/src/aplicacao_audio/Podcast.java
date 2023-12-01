package aplicacao_audio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Podcast extends Audio {
    private String criador;
    private String tema;

    public void mostrarPodcast(){
        System.out.println("Nome: " + getNome());
        System.out.println("Criador: " + getCriador());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Tema: " + getTema());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + classificacao());


    }
}
