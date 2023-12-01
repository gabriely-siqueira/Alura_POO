package screenmatch.calculos;



import lombok.Getter;
import lombok.Setter;
import screenmatch.modelos.Titulo;

@Getter
@Setter
public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
