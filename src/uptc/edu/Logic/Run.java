package uptc.edu.Logic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Run {

	public static void main(String[] args) {
		Logic logic = new Logic();
		Scanner scanner = new Scanner(System.in);
		boolean option = true;
		String selections[] = { "1.Convertir en nombre propio el contenido de la cadena",
				"2. Buscar cadena de caracteres", "3. Encriptar", "4. Desencriptar", "5. Llenar caracteres",
				"6. Borrar caracteres", "7. Insercion", "8. Diferencia", "9. Borrar caracteres", "10. Convertir fecha",
		"11. Salir" };
		while (option != false) {
			String election;
			election = (String) JOptionPane.showInputDialog(null, "Seleccione la opcion que desea realizar", "Menú",
					JOptionPane.INFORMATION_MESSAGE, null, selections, selections[0]);
			switch (election) {
			case "1.Convertir en nombre propio el contenido de la cadena":

				break;

			case "2. Buscar cadena de caracteres":
				break;

			case "3. Encriptar":
				JOptionPane.showMessageDialog(null, Logic.encryptedCode());
				break;
			case "4. Desencriptar":
				JOptionPane.showMessageDialog(null, Logic.decryptedCode());
				break;

			case "5. Llenar caracteres":
				break;

			case "6. Borrar caracteres":
				String character;
				character=JOptionPane.showInputDialog(null, "Ingrese el caracter a eliminar");
				JOptionPane.showMessageDialog(null, logic.removeDuplicates(character));
				break;
			case "7. Insercion":
				break;
			case "8. Diferencia":
				break;
			case "9. Borrar caracteres":
				break;
			case "10. Convertir fecha":
				break;

			case "11. Salir":
				JOptionPane.showMessageDialog(null, "Has finalizado la ejecucion del programa");
				option = false;
				break;
			}

		}

	}

}
