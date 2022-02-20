import java.util.Scanner;

public class Exc_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String  senha;

		senha = sc.next();

		if (senha.length()<6){
			System.out.println("Falta(m) " + senha.length() + " caracteres para sua senha ser segura.");
		}
		if (senha.length()>=6){
			System.out.println("Sua senha contém a quantidade de digitos considerada segura.");
		}

		System.out.println("deseja verificar se sua senha é forte? (sim/SIM)");

		String resposta = sc.next();
		if (resposta.equalsIgnoreCase("sim")) {
			for(int i=0; i<senha.length(); i++) {
				char c = senha.charAt(i);

				boolean validacao = Character.isDigit(c);

				if (validacao==true) {
					break;

				}
				if (senha.length() -1==i){
					System.out.println("Favor inserir um número à sua senha.");
				}

			}

			for(int i=0; i<senha.length(); i++) {
				char c = senha.charAt(i);

				boolean validacao = Character.isUpperCase(c);

				if (validacao==true) {
					break;
				}
				if (senha.length() -1==i){
					System.out.println("Favor inserir uma letra maiúscula à sua senha.");
				}
			}

			for(int i=0; i<senha.length(); i++) {
				char c = senha.charAt(i);

				boolean validacao = Character.isLowerCase(c);

				if (validacao==true) {
					break;
				}
				if (senha.length() -1==i){
					System.out.println("Favor inserir uma letra minúscula à sua senha.");
				}
			}

			for(int i=0; i<senha.length(); i++) {
				char c = senha.charAt(i);

				boolean validacao = Character.isLetterOrDigit(c);

				if (validacao==false) {
					System.out.println("Sua senha é segura. ");
					break;
				}
				if (senha.length() -1==i){
					System.out.println("Favor inserir um caracter especial à sua senha. Caracteres permitidos: !@#$%^&*()-+");
				}
			}

		}
		sc.close();
	}
}