package br.edu.infnet.prjatm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo");
		System.out.print("Por favor entre com seu número conta: ");
		int c = sc.nextInt();
		
		System.out.printf("Sua conta é " + c );
	} 

}
