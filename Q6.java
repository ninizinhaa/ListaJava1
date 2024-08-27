
import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite seu salário atual: ");

        double salarioAntigo = Double.parseDouble(entrada1);

        double aumento = (salarioAntigo * 15) / 100;

        double calculoSalario = aumento + salarioAntigo;
        String salarioNovo = String.format("%.2f", calculoSalario);

        JOptionPane.showMessageDialog(null,
                "Seu salário antigo era " + salarioAntigo + " e agora foi reajustado para " + salarioNovo + "!!");

    }
}
