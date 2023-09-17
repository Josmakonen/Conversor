import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class prueba {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos Colombianos a Euros", "Pesos Colombianos a Dólares", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen", "Pesos Colombianos a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos colombianos: ");
            double pesosColombianos;
            try {
                pesosColombianos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos Colombianos a Dólares")) {
                double dolares = pesosColombianos / 3762.63; // Tasa de cambio actual de pesos colombianos a dólares
                JOptionPane.showMessageDialog(null, pesosColombianos + " pesos colombianos son " + FormatearDecimal.format(dolares) + " dólares.");
            } else if (choice.equals("Pesos Colombianos a Euros")) {
                double euros = pesosColombianos / 4455.56; // Tasa de cambio actual de pesos colombianos a euros
                JOptionPane.showMessageDialog(null, pesosColombianos + " pesos colombianos son " + FormatearDecimal.format(euros) + " euros.");
            } else if (choice.equals("Pesos Colombianos a Libras Esterlinas")) {
                double libras = pesosColombianos / 5189.02; // Tasa de cambio actual de pesos colombianos a libras esterlinas
                JOptionPane.showMessageDialog(null, pesosColombianos + " pesos colombianos son " + FormatearDecimal.format(libras) + " libras esterlinas.");
            } else if (choice.equals("Pesos Colombianos a Yen")) {
                double yen = pesosColombianos / 33.03; // Tasa de cambio actual de pesos colombianos a yenes japoneses
                JOptionPane.showMessageDialog(null, pesosColombianos + " pesos colombianos son " + FormatearDecimal.format(yen) + " yenes japoneses.");
            } else if (choice.equals("Pesos Colombianos a Won")) {
                double won = pesosColombianos / 0.0030; // Tasa de cambio actual de pesos colombianos a wones surcoreanos
                JOptionPane.showMessageDialog(null, pesosColombianos + " pesos colombianos son " + FormatearDecimal.format(won) + " wones surcoreanos.");
            }

            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }
    }
}

    

