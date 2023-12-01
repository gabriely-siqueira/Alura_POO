package screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >=4){
            System.out.println("Está entre os favoritos do momento");
        } else if (classificavel.getClassificacao() >=4) {
            System.out.println("Está bem avaliado no momento");
        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
