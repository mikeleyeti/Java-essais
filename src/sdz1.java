
public class sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte temperature;
		temperature = 64; // Type entier entre -127 et +128
		short vitesseMax;
		vitesseMax = 32000; //Le type short (2 octets) contient les entiers compris entre -32768 et +32767.
		int temperatureSoleil;
		temperatureSoleil = 15600000; //Le type int (4 octets) va de -2*10^9 à 2*10^9 (2 et 9 zéros derrière… ce qui fait déjà un joli nombre).
		long anneeLumiere;
		anneeLumiere = 9460700000000000L; // Le type long (8 octets)  va de -2*10^18 à 2*10^18 et finir par L
		float pi;
		pi = 3.141592653f; // A terminer par un f
		char caractere;
		caractere = 'A'; // un seul charactère
		//
		//METHODE DE DECLARATION
		//Première méthode de déclaration
		String phrase;
		phrase = "Titi et Grosminet";

		//Deuxième méthode de déclaration
		String str = new String();
		str = "Une autre chaîne de caractères";

		//Troisième méthode de déclaration
		String string = "Une autre chaîne";

		//Quatrième méthode de déclaration
		String chaine = new String("Et une de plus !");
		
		System.out.println("La phrase test est : " + chaine );
	} 

}
