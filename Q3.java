import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite suas horas trabalhadas: ");
        String entrada2 = JOptionPane.showInputDialog("Digite o valor que você recebe por hora trabalhada: ");

        double numero1 = Double.parseDouble(entrada1);
        double numero2 = Double.parseDouble(entrada2);

        double vezes = numero1 * numero2;

        String salario = String.format("%.2f", vezes);

        JOptionPane.showMessageDialog(null, "O salário deste funcionário é: " + salario);

    }
}
