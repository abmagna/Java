
public class TesteIR {
	public static void main(String[] args) {
		double salario = 0.0;
		
		if (salario>=1900 && salario<=2800) {
			System.out.println("O IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
			
		}else {
			if (salario >2800 && salario <= 3751) {
				System.out.println("O IR � de 15% e pode deduzir R$ 350");
			}if (salario >3751 && salario<= 4664.0){
				System.out.println("O IR � de 22.5% e pode deduzir R$ 636");
			}if (salario < 1900) {
				System.out.println("N�o declara!");
			}
		}
			

	}
}

/*
 * if(salario >= 1900.0 && salario <= 2800.0) {
 * System.out.println("A sua aliquota � de 7%");
 * System.out.println("Voc� pode deduzir at� R$ 142"); } 
 * 
 * else if(salario >=2800.01 && salario <= 3751.0) {
 * System.out.println("A sua aliquota � de 15%");
 * System.out.println("Voc� pode deduzir at� R$ 350"); } 
 * 
 * else if(salario >=3751.01 && salario <= 4664.0) {
 * System.out.println("A sua aliquota � de 22.5%");
 * System.out.println("Voc� pode deduzir at� R$ 636"); }
 */