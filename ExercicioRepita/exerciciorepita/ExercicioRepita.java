package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {

        int n;
        int total = 0;
        int pares = 0;
        int impares = 0;
        int acima100 = 0;
        int soma = 0;

        do {

            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br>"
                    + "<em>(valor 0 interrompe)</em></html>"));

            if (n != 0) {

                total++;
                soma += n;

                if (n % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (n > 100) {
                    acima100++;
                }
            }

        } while (n != 0);

        double media = (double) soma / total;

        JOptionPane.showMessageDialog(null,
                "<html><b>Resultado:</b><br>"
                + "-------------------------<br>"
                + "Total de Valores: " + total + "<br>"
                + "Total de Pares: " + pares + "<br>"
                + "Total de Ímpares: " + impares + "<br>"
                + "Acima de 100: " + acima100 + "<br>"
                + "Média dos valores: " + media
                + "</html>");
    }
}
