
import javax.swing.JOptionPane;

public class Q2 {
	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite o valor do raio do círculo: ");
		double raio = Double.parseDouble(entrada);

		double area = Math.PI * raio * raio;

		String areaCirculo = String.format("%.4f", area);

		JOptionPane.showMessageDialog(null, "O valor da área é: " + areaCirculo);
	}
}
