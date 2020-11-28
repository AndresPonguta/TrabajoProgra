package uptc.edu.Logic;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase define unos métodos que realizan operaciones
 * con cadenas de caracteres
 * @author Juan Herrera y Andrés Pongutá
 *
 */
/**
 * @author JuanC
 *
 */
/**
 * @author JuanC
 *
 */
public class Logic {
	public static final String phrase = "Sogamoso ciudad del sol"; // Esta es la
	// frase por
	// defecto
	// seleccionada
	private LocalDate date;

	public Logic() {

	}

	/**
	 * Este método permite ver un nombre propio por cada palabra de la cadena de
	 * caracteres
	 * 
	 * @return Frase con cada palabra propia
	 */
	public String Turn() {

		String word = "";
		word += Character.toString(phrase.charAt(0)).toUpperCase();
		for (int i = 1; i < phrase.length(); i++) {

			if (Character.toString(phrase.charAt(i)).equals(" ")
					&& !Character.toString(phrase.charAt(i + 1)).equals(" ")
					&& !Character.toString(phrase.charAt(i + 2)).equals(" ")) {

				word += Character.toString(phrase.charAt(i)).toUpperCase();
				word += Character.toString(phrase.charAt(i + 1)).toUpperCase();
				i++;

			} else {

				word += Character.toString(phrase.charAt(i)).toLowerCase();
			}

		}
		return word;
	}

	/**
	 * Este método permite saber cuántas palabras están o hay en una cadena de
	 * caracteres
	 * 
	 * @param Cadena
	 *            a buscar
	 * @return Cantidad de palabras encontradas
	 */
	public int LookFor(String search) {

		String word = "";
		int counter = 0;
		int amount = 0;

		for (int i = 0; i < phrase.length(); i++) {

			if (Character.toString(phrase.charAt(0)).equalsIgnoreCase(Character.toString(search.charAt(0))) && i == 0) {

				for (int j = 0; j < search.length(); j++) {

					if (Character.toString(phrase.charAt(counter)).equals(Character.toString(search.charAt(j)))) {

						word += Character.toString(phrase.charAt(counter));

						counter++;
					}

					if (word.equalsIgnoreCase(search)) {

						amount++;

					}
				}
				word = "";

			} else if (Character.toString(phrase.charAt(i)).equals(" ")) {

				counter = i + 1;

				for (int j = 0; j < search.length(); j++) {

					if (Character.toString(phrase.charAt(counter)).equals(Character.toString(search.charAt(j)))) {

						word += Character.toString(phrase.charAt(counter));

						counter++;
					}

					if (word.equalsIgnoreCase(search)) {

						amount++;

					}
				}
				word = "";
			}

		}
		return amount;
	}

	/**
	 * Este método permite encriptar una cadena de caracteres
	 * 
	 * @return Una cadena de caracteres
	 */
	public static String encryptedCode() {
		char encrypt[] = phrase.toCharArray();
		for (int i = 0; i < encrypt.length; i++) {
			encrypt[i] = (char) (encrypt[i] + (char) 56);
		}
		return String.valueOf(encrypt.clone());

	}

	/**
	 * Este método desencripta una cadena de caracteres
	 * 
	 * @return Cadena de caracteres
	 */
	public static String decryptedCode() {
		char decrypted[] = encryptedCode().toCharArray();
		for (int i = 0; i < decrypted.length; i++) {
			decrypted[i] = (char) (decrypted[i] - (char) 56);
		}
		return String.valueOf(decrypted.clone());

	}

	/**
	 * Este método añade caracteres a la derecha o izquierda de una cadena de
	 * caracteres
	 * 
	 * @param Caracter
	 *            a añadir
	 * @param Cantidad
	 *            de veces
	 * @param Saber
	 *            si es a la dereacha o izquierda
	 * @return Cadena de caracteres
	 */
	public String FillIn(String character, int amount, boolean option) {

		String phrase2 = "";
		String phrase3 = "";

		try {
			for (int i = 0; i < amount; i++) {

				phrase2 += character;

			}

			if (option) {

				phrase3 = phrase + phrase2;

			} else {

				phrase3 = phrase2 + phrase;
			}

		} catch (Exception e) {
			return "Digitó una opción correcta";
		}

		return phrase3;
	}

	/**
	 * Este método borra el caracter dado de una cadena de caracteres
	 * 
	 * @param Caracter
	 *            a borrar
	 * @return Cadena de caracteres
	 */
	public String removeCharacter(String character) {
		String result = "";
		for (int i = 0; i < phrase.length(); i++) {
			if (!Character.toString(phrase.charAt(i)).equalsIgnoreCase(Character.toString(character.charAt(0)))) {
				result += phrase.charAt(i);
			}
		}
		return result;
	}

	/**
	 * Este método elimina la palabra seguida repetida de una cadena de
	 * caracteres
	 * 
	 * @param Cadena
	 *            de caracteres a modificar
	 * @return Cadena de caracteres
	 */
	public String Intersect(String phrase) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];

		for (int i = 0; i < phrase2.length; i++) {

			phrase2[i] = Character.toString(phrase.charAt(i));
		}

		for (int i = 0; i < phrase2.length; i++) {

			for (int j = 0; j < phrase2.length; j++) {

				if (i != j) {

					if (phrase2[i].equalsIgnoreCase(phrase2[j])) {

						phrase2[j] = "";

					}
				}
			}
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}

	/**
	 * Este método compra dos cadenas de caracteres y elimna de una los
	 * caracteres repetidos en la otra
	 * 
	 * @param Cadena
	 *            de caracteres a comparar
	 * @return Cadena de caracteres
	 */
	public String Subtract(String phrase1) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];
		String[] phrase3 = new String[phrase1.length()];

		for (int i = 0; i < phrase2.length; i++) {

			phrase2[i] = Character.toString(phrase.charAt(i));
		}

		for (int i = 0; i < phrase3.length; i++) {

			phrase3[i] = Character.toString(phrase1.charAt(i));
		}

		for (int i = 0; i < phrase3.length; i++) {

			for (int j = 0; j < phrase2.length; j++) {

				if (phrase3[i].equalsIgnoreCase(phrase2[j])) {

					phrase2[j] = "";

				}

			}
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}

	/**
	 * Este método compra dos cadenas de caracteres y elimna de una los
	 * caracteres repetidos en la otra ya sea por derecha o izquierda
	 * 
	 * @param Cadena
	 *            de caracteres a comparar
	 * @param Saber
	 *            si es izquierda o derecha
	 * @return Cadena de caracteres
	 */
	public String DeleteLeftRight(String phrase3, String option) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];
		String[] phrase4 = new String[phrase3.length()];
		boolean option2 = true;
		try {

			if (option.equalsIgnoreCase("d")) {

				option2 = true;
			} else if (option.equalsIgnoreCase("i")) {
				option2 = false;

			} else if (!option.equalsIgnoreCase("i") || !option.equalsIgnoreCase("d")) {

				msj = "No digitó una opción correcta";
				return msj;
			}

			for (int i = 0; i < phrase2.length; i++) {

				phrase2[i] = Character.toString(phrase.charAt(i));
			}

			for (int i = 0; i < phrase4.length; i++) {

				phrase4[i] = Character.toString(phrase3.charAt(i));
			}

			if (option2) {
				for (int i = 0; i < phrase4.length; i++) {

					for (int j = 0; j < phrase2.length; j++) {

						if (phrase2[j].equalsIgnoreCase(phrase4[i])) {

							phrase2[j] = "";

						}
					}
				}
			} else if (option2 == false) {

				for (int i = 0; i < phrase4.length; i++) {

					for (int j = phrase2.length - 1; j >= 0; j--) {

						if (phrase2[j].equalsIgnoreCase(phrase4[i])) {

							phrase2[j] = "";

						}
					}
				}
			}
		} catch (Exception e) {
			msj = "Digite un caracter correcto";
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}

	/**
	 * Este método convierte una fecha tipo String a LocalDate
	 * 
	 * @param Fecha
	 *            a convertir
	 * @return Fecha LocalDate
	 */
	public LocalDate covertDate(String dateOne) {
		date = LocalDate.parse(dateOne, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		return date;
	}

}
