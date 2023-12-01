package aplicacao_compras;

import lombok.Getter;


@Getter

public class Compra {
private String descricao;
private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: descrição ='" + descricao  + " valor =" + valor;
    }
}
