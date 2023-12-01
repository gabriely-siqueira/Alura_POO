package screenmatch.modelos;

import lombok.Getter;
import lombok.Setter;
import screenmatch.calculos.Classificavel;

@Getter
@Setter

public class Episodio implements Classificavel {
        private int numero;
        private String nome;
        private Serie serie;
        private int totalVisualizacoes;



        public void setTotalVisualizacoes(int totalVisualizacoes) {
            this.totalVisualizacoes = totalVisualizacoes;
        }



        public void setNumero(int numero) {
            this.numero = numero;
        }




        @Override
        public int getClassificacao() {
            if (totalVisualizacoes > 100) {
                return 4;
            } else {
                return 2;
            }
        }}
