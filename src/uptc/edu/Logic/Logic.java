package uptc.edu.Logic;

public class Logic {
	public static final String phrase = "Sogamoso ciudad del sol";

	public Logic() {

	}

	public static String encryptedCode() {
		char encrypt[] = phrase.toCharArray();
		for (int i = 0; i < encrypt.length; i++) {
			encrypt[i] = (char) (encrypt[i] + (char) 56);
		}
		return String.valueOf(encrypt);

	}

	public static String decryptedCode() {
		char decrypted[] = encryptedCode().toCharArray();
		for (int i = 0; i < decrypted.length; i++) {
			decrypted[i] = (char) (decrypted[i] - (char) 56);
		}
		return String.valueOf(decrypted);

	}

	public String removeDuplicates(String character) {
		String result = "";
		char remove[] = phrase.toCharArray();
		for (int i = 0; i < remove.length; i++) {
			if ((character.equals(remove[i]))) {
				System.out.println(remove[i]);

			} else {

			}
		}
		return result;
	}

	// public String insertion(String phrase){
	// String insertionPhrase= "";
	// for (int i = 0; i < phrase.length(); i++) {
	// for (int j = i; i<phrase.length() && j < phrase.length(); j++) {
	// if (insertionPhrase.charAt(i) != insertionPhrase.charAt(j+1)) {
	// i=j+1;
	// }else{
	// insertionPhrase.charAt(j+1);
	// }
	// }
	// }
	// return insertionPhrase;
	//
	// }
}
