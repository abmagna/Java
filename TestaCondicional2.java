
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas= 2;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >=2;
		
		// ||- ou      && - e 
		if (idade >= 18 && acompanhado) {
			System.out.println("Voce pode entrar!");
			System.out.println("Seja bem vindo");
		} else {

			System.out.println("Infelizmente não entra!");
		}

	}
}

