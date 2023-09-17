import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos Colombianos a Euros", "Pesos Colombianos a Dolares Americanos", "Pesos Colombianos a Dolar Australiano", "Pesos Colombianos a Pesos Mexicanos",
                    "Pesos Colombianos a Rublo Ruso" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos colombianos: ");
            double pesos;
            try {
                pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos Colombianos a Dólares")) {
                double dollars = pesos / 4107;
                JOptionPane.showMessageDialog(null,
                        pesos + " Pesos Colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos Colombianos a Euros")) {
                double euros = pesos / 4434;
                JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + euros + " euros.");
            } else if (choice.equals("Pesos Colombianos a Dolar Australiano")) {
                double aud = pesos / 2653;
                JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + aud + " Dolares Australianos.");
            } else if (choice.equals("Pesos Colombianos a Pesos Mexicanos")) {
                double mxn = pesos / 240.30;
                JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + mxn + " Pesos Mexicanos.");
            } else if (choice.equals("Pesos Colombianos a Rublo Ruso")) {
                double rub = pesos / 42.60;
                JOptionPane.showMessageDialog(null, pesos + " COP " + rub + " Rublos Rusos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Terminado");
            }
        }

    }
}