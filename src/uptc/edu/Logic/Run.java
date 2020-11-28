package uptc.edu.Logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Esta clase ejecuta los metodos de la clase Logic en forma de menú
 * 
 * @author Juan Herrera y Andrés Pongutá
 *
 */
public class Run {

	/**
	 * Este método muestra un menú donde están todos los métodos de a clase
	 * Logic
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Logic logic = new Logic();
		Scanner scanner = new Scanner(System.in);
		boolean option = true;

		String selections[] = { "1.Convertir en nombre propio el contenido de la cadena",
				"2. Buscar cadena de caracteres", "3. Encriptar", "4. Desencriptar", "5. Llenar caracteres",
				"6. Borrar caracteres", "7. Interseccion", "8. Diferencia", "9. Borrar caracteres por I o D",
				"10. Convertir fecha", "11. Salir" };
		while (option != false) {
			try {
				String election;
				election = (String) JOptionPane.showInputDialog(null, "Seleccione la opcion que desea realizar", "Menú",
						JOptionPane.INFORMATION_MESSAGE, null, selections, selections[0]);
				switch (election) {

				case "1.Convertir en nombre propio el contenido de la cadena":
					JOptionPane.showMessageDialog(null, logic.Turn());
					break;

				case "2. Buscar cadena de caracteres":
					String search;
					search = JOptionPane.showInputDialog(null, "Ingrese la cadena ");
					JOptionPane.showMessageDialog(null, logic.LookFor(search));
					break;

				case "3. Encriptar":
					JOptionPane.showMessageDialog(null, Logic.encryptedCode());
					break;

				case "4. Desencriptar":
					JOptionPane.showMessageDialog(null, Logic.decryptedCode());
					break;

				case "5. Llenar caracteres":
					String character = JOptionPane.showInputDialog("Ingrese el caracter");
					int amount = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de caracteres"));

					boolean condition = true;

					while (condition != false) {
						String option2 = JOptionPane.showInputDialog(
								"Para digite la posición de los carácteres. D para derecha y I para izquierda");

						if (option2.equalsIgnoreCase("d")) {

							JOptionPane.showMessageDialog(null, logic.FillIn(character.toUpperCase(), amount, true));
							condition = false;
						} else if (option2.equalsIgnoreCase("i")) {

							JOptionPane.showMessageDialog(null, logic.FillIn(character, amount, false));
							condition = false;
						}

						else {

							JOptionPane.showMessageDialog(null, "No digito una opción correcta");

						}
					}
					break;

				case "6. Borrar caracteres":
					String character2 = JOptionPane.showInputDialog(null, "Ingrese el caracter a eliminar");
					JOptionPane.showMessageDialog(null, logic.removeCharacter(character2));
					break;

				case "7. Interseccion":
					String phrase2 = JOptionPane.showInputDialog(null, "Ingrese una cadena");
					JOptionPane.showMessageDialog(null, logic.Intersect(phrase2));
					break;

				case "8. Diferencia":
					String character3 = JOptionPane.showInputDialog(null, "Ingrese la cadena a comparar");
					JOptionPane.showMessageDialog(null, logic.Subtract(character3));
					break;

				case "9. Borrar caracteres por I o D":
					String phrase4 = JOptionPane.showInputDialog(null,
							"Ingrese la palabra de la cual quiere eliminar caracteres");

					String option4 = JOptionPane.showInputDialog(null,
							"Ingreser I si quiere que se compare de izquierda/derecha o D si quiere que se compare de derecha/izquierda");

					JOptionPane.showMessageDialog(null, logic.DeleteLeftRight(phrase4, option4));
					break;

				case "10. Convertir fecha":
					String dateOne = JOptionPane.showInputDialog(null,
							"Ingrese la fecha en este formato dd-MM-yyyy");
					JOptionPane.showMessageDialog(null, logic.covertDate(dateOne));
					break;

				case "11. Salir":
					JOptionPane.showMessageDialog(null, "Has finalizado la ejecucion del programa");
					option = false;
					break;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite una opcion correcta");
			}
		}

	}

}
