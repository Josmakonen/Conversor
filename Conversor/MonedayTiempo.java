import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MonedayTiempo {
    public static void main(String[] args) {

        Object[] options = { "Conversor de Monedas", "Conversor de Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Bienvenido al conversor de moneda y temperatura. Selecciona una opcion", "Conversor M&T",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Terminado");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos Colombianos a Euros", "Pesos Colombianos a Dolar Americano", "Pesos Colombianos a Dolar Australiano", "Pesos Colombianos a Pesos Mexicanos",
                "Pesos Colombianos a Rublo Ruso" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Selecciona una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingresa la cantidad en pesos colombianos: ");
                double pesos;
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido.");
                    return;
                }

                if (cambio.equals("Pesos Colombianos a Dolar Americano")) {
                    double dolar = pesos / 4107;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Colombianos son " + FormatearDecimal.format(dolar) + dolar + " Dolares Americanos.");
                } else if (cambio.equals("Pesos Colombianos a Euros")) {
                    double euros = pesos / 4434;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + euros + " Euros.");
                } else if (cambio.equals("Pesos Colombianos a Dolar Australiano")) {
                    double aud = pesos / 2653;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Colombianos son " + aud + " Dolares Australianos.");
                } else if (cambio.equals("Pesos Colombianos a Pesos Mexicanos")) {
                    double mxn = pesos / 240.30;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos " + mxn + " Pesos Mexicanos.");
                } else if (cambio.equals("Pesos Colombianos a Rublo Ruso")) {
                    double rub = pesos / 42.60;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + rub + " Rublos Rusos.");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opcion:",
                        "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor de la temperatura a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " Grados Celsius son " + resultado + " Grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " Grados Fahrenheit son " + resultado + " Grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar en el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Terminado");

                }
            }

        }

    }
}
