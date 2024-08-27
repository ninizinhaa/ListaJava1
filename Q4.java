
import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Olá, como você se chama? ");
        String entrada2 = JOptionPane.showInputDialog("Em qual ano você nasceu: ");

        int numero2 = Integer.parseInt(entrada2);
        int idade = 2024 - numero2;

        JOptionPane.showMessageDialog(null, "Você se chama " + nome + " e possui " + idade + " anos de idade!");

    }
}
