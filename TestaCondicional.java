
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos!");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Apesar de n�o ser maior, pode entrar");
			}else {
				System.out.println("Infelizmente n�o entra!");
			}

		}
	}

}
