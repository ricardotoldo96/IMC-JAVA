package empresa;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int peso;
		double altura;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu peso");
		peso = teclado.nextInt();
		
		System.out.println("Digite o valor da sua altura (em metros)");
		altura = teclado.nextDouble();
		
		resultado = peso/(altura*altura);
		
		if (resultado < 18.5) {
			System.out.println("Você está abaixo do peso normal");
		}
		if (resultado >18.5 && resultado < 24.9){
			System.out.println("Você está com o peso normal");
		}
		if (resultado > 24.9 && resultado < 29.9){
			System.out.println("Você está com excesso de peso");
		}
		if (resultado > 29.9 && resultado < 34.9){
			System.out.println("Você está com obesidade I");
		}
		if (resultado > 34.9 && resultado < 39.9){
			System.out.println("Você está obesidade II");
		}
		if (resultado > 40){
			System.out.println("Você está com obesidade III");
		}
	}

}
