package aplicacao_compras;

import javax.swing.*;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cartão"));
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            String descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                sair = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e 1 para continuar"));
                JOptionPane.showMessageDialog(null, "Compra realizada!");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());

        // Ordenar as compras por valor
        cartao.getCompras().sort(Comparator.comparing(Compra::getValor));
    }
}

