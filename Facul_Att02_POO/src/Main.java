import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// atividade 013
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor !");
		int var01;
		var01 = sc.nextInt();
		System.out.println("Seu valor é" + var01);
		
		// atividade 014
		
		int var02;
		var02 = sc.nextInt();
		
		System.out.println("Se valor é " + var02*2);
		
		// ativadade 015
		
		System.out.println("Digite dois valores");
		int var03, var04;
		var03 = sc.nextInt();
		var04 = sc.nextInt();
		System.out.println("Seu resultado é " + (var03 + var04));
		
		// ativadade 016
		
		System.out.println("Digite os valores da base do quandrado: ");
		int base;
		int altura;
		base = sc.nextInt();
		altura = sc.nextInt();
		int resultado = base * altura;
		System.out.println("Seu resultado é: " + resultado);
		
		// atividade 017
		
		System.out.println("Digite os valores da base do quandrado: ");
		int base2;
		int altura2;
		base2 = sc.nextInt();
		altura2 = sc.nextInt();
		int resultado2 = base2 * altura2 /2;
		System.out.println("Seu resultado é: " + resultado2);
		
		// atividade 018
		
		System.out.println("Digite dois valores: ");
		int var05;
		int var06;
		var05 = sc.nextInt();
		var06 = sc.nextInt();
		
		if(var05 != var06)
		{
			System.out.println("São diferentes !");
		}
		else
		{
			System.out.println("São iguais !");
		}
		
		// atividade 019
		
		System.out.println("Digite uma valor ");
		int var07;
		var07 = sc.nextInt();
		int resultado3 = var07 / 2;
		
		if(resultado3 != 0)
		{
			System.out.println("Seu valor é impar!");
		}
		else
		{
			System.out.println("Seu valor é par!");
		}
		
		// ativadade 020
		
		System.out.println("Digite o valor: ");
		int var08;
		int var09;
		var08 = sc.nextInt();
		var09 = sc.nextInt();
		
		if(var08 > var09)
		{
			System.out.println("Primeiro valor é maior!");
		}
		else
		{
			System.out.println("Segundo valor é maior!");
		}
		
		// Atividade 021
		
		System.out.println("Digite suas notas");
		double nota1, nota2, nota3;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		double resultado4 = nota1 + nota2 + nota3 / 3;
		
		if(resultado4 <= 3)
		{
			System.out.println("Reprovado!");
		}
		else if(resultado >= 7)
		{
			System.out.println("Aprovado");
		}
		
		// Atividade 022
		
		System.out.println("Digite uma angulo:");
		int ang;
		ang = sc.nextInt();
		
		if(ang >= 0 && ang <= 90)	
		{
			System.out.println("Primeiro quadrante");
		}
		else if(ang >= 90 && ang <= 180)
		{
			System.out.println("Segundo quadrante");
		}
		else if(ang >= 180 && ang <= 270)
		{
			System.out.println("Terceiro quadrante");
		}
		else 
		{
			System.out.println("Quarto quadrante");
		}
		
		// Atividade 023
		
		System.out.println("Entre com o valor");
		int x;
		int y;
		x = sc.nextInt();
		y = sc.nextInt();
		int ang2 = x + y;
		
		if(ang2 >= 0 && ang2 <= 90)	
		{
			System.out.println("Primeiro quadrante");
		}
		else if(ang2 >= 90 && ang2 <= 180)
		{
			System.out.println("Segundo quadrante");
		}
		else if(ang2 >= 180 && ang2 <= 270)
		{
			System.out.println("Terceiro quadrante");
		}
		else 
		{
			System.out.println("Quarto quadrante");
		}
		
		sc.close();
	}

}
