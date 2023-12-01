package screenmatch.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Serie extends Titulo {
   private int temporadas;
   private int episodiosPorTemporada;
   private boolean ativa;
   private int minutosPorEpisodio;

   public Serie(String nome, int anoDeLancamento) {
      super(nome, anoDeLancamento);
   }

   @Override
   public int getDuracaoEmMinutos() {
      return temporadas * episodiosPorTemporada * minutosPorEpisodio;
   }

   @Override
   public String toString() {
      return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
   }
}
