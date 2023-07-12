import java.util.Locale;

public class testes {

	public static void main(String[] args) {
		
		//Parte 1
		int y = 7;
		double x = 7.77777;
		
		//Parte 2
		String nome = "Débora";
		int idade = 20;
		double renda = 4000.0;
		//Para String tem que usar aspas "" no texto.
		
		//Parte 1
		System.out.println(y);
		//Como chamar uma variável
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		//%n serve como quebra de linha nesses casos.
		//Lidar com números com ponto flutuante.
		//O f no "printf" é de formatação, que serve para
		//"limitar" as casas depois do ponto.
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		//Como mudar o separador (ponto e vírgula)
		//para padrão dos EUA.
		
		System.out.println("Resultado = " + x + " metros");
		//Concatenar elementos em mesmo comando de
		//escrita.
		
		System.out.printf("Resultado = %.2f metros%n", x);
		//Concatenar elementos em um mesmo comando de
		//escrita usando printf.
		
		
		//Parte 2
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		//Concatenar vários elementos em um mesmo comando
		//de escrita.
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		}

}