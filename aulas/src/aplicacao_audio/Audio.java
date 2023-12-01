package aplicacao_audio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Audio {
    private String nome;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public void curtir() {
        this.curtidas++;
    }

    public int classificacao() {
        if (curtidas > 100) {
            return 5;
        } else if (curtidas >= 50) {
            return  4;
        } else {
            return  3;
        }
    }
}
