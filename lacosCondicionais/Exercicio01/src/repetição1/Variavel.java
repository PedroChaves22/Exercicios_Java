package repeti��o1;

import java.util.Scanner;

public class Variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, maiorNumero;
		
		System.out.println("Digite um n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
		num3 = entrada.nextInt();
		
		maiorNumero = num1;
		
		 if (maiorNumero> num2) {
	            if (maiorNumero > num3) {
	                System.out.printf("O maior � " + num1);
	        } else{
	                System.out.printf("o maior � " + num2);
	            }  
	        }else{
	            System.out.printf("o maior � " + num3);  
	        }
	     }
		
		
		
			
		
             
				
				
	}


