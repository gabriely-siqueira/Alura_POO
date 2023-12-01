import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        String nome = "Taylor Swift";
        String tipoConta = "Corrente";
        double saldo = 1599.00;

        while (opcao != 5) {
            String menu = "Bem vindo ao Banco da Gaby\n" +
                    "1 - Consultar saldo\n" +
                    "2 - Transferência\n" +
                    "3 - Saque\n" +
                    "4 - Depósito\n" +
                    "5 - Sair\n\n" +
                    "Escolha uma opção:";
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Saldo atual: " + saldo);
                        break;
                    case 2:
                        double transf = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transferência"));
                        if (transf > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente para transferência.");
                        } else {
                           int contaTransf = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
                            saldo -= transf;
                            JOptionPane.showMessageDialog(null, "Transferência para a conta " + contaTransf + " realizado!");
                        }
                        break;
                    case 3:
                        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                        if (saque > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque.");
                        } else {
                            saldo -= saque;
                            JOptionPane.showMessageDialog(null, "Saque realizado!");
                        }
                        break;
                    case 4:
                        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                        if (deposito > 0) {
                            saldo = saldo + deposito;
                            JOptionPane.showMessageDialog(null, "Saldo realizado!");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Saindo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            }
        }
    }
}
