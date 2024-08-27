import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        String produto = JOptionPane.showInputDialog("Qual produto você vai levar? ");
        String entrada1 = JOptionPane.showInputDialog("Qual o valor deste produto? ");
        String entrada2 = JOptionPane.showInputDialog("Quanto você deseja de desconto ?");

        double numero1 = Double.parseDouble(entrada1);
        double numero2 = Double.parseDouble(entrada2);

        double porCento = (numero1 * numero2) / 100;
        double desconto = numero1 - porCento;

        String barato = String.format("%.3f", desconto);

        JOptionPane.showMessageDialog(null, "O produto escolhido foi " + produto + " que valia " + numero1
                + " reais e com desconto ficou " + barato + " reais!");

    }
}
