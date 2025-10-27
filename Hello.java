import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		System.out.println("bonjour et bienvenu dans mon programme java");
		System.out.println("Quel est votre nom ?");
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		System.out.println("Salut " + nom);
		System.out.println("Quel est votre prénom ?");
		String prenom = scan.nextLine();
		System.out.println("Bienvenue " + nom + " " + prenom + " !");
	}
}

