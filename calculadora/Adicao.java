/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto;

import java.util.Scanner;

/**
 *
 * @author livia
 */
public class Adicao {
 
	public void soma() {
        Scanner input = new Scanner(System.in);
		double n1;
		double n2;
		double resultado;
                
		System.out.println("Digite o 1� numero: \n");
			n1 = input.nextDouble();
		System.out.println("Digite o 2� numero: \n ");
			n2 = input.nextDouble();
			resultado = n1 + n2;
			System.out.println("Resultado da soma: " + resultado);
		/*			*/
		
}
}
