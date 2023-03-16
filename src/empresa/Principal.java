package empresa;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Menu");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Total Convertido");
		System.out.println("0 - Encerrar");
		opcao = teclado.nextInt();
		
		int tipoMoeda;
		double valor;
		Moeda moeda = null;
			// No loop abaixo faremos a validação da escolha do usuário.
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				tipoMoeda = 0;
					//No loop abaixo será escolhido a moeda que o usuário deseja armazenar.
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				System.out.println("Qual valor?");
				valor = teclado.nextDouble();
				
				//Dependendo da escolha do usuário, as condições abaixo farão a criação de um novo endereço memória.
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					moeda = new Euro(valor);
				}
				cofrinho.adicionar(moeda);
				//Adicionar Moedas.
				
				break;
			case 2:
					// Esta case é destinada à escolha da moeda que o usuário deseja remover da lista.
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				System.out.println("Qual valor?");
				valor = teclado.nextDouble();
				
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
				}
				if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
				}
				if(tipoMoeda == 3) {
					moeda = new Euro(valor);
				}
				cofrinho.remover(moeda);
				//Remover moeda selecionada
				
				break;
			case 3:
				
				cofrinho.listagemMoedas();
				//Listar moedas armazenadas
				
				break;
			case 4:
				
				cofrinho.totalConvertido();
				//Valor total em Reais
				
				break;
			default:
				System.out.println("Opcao invalida");	
			}
			
			System.out.println("Menu");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Total Convertido");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();
		} // Terminando a execução do código as opções serão novamente mostradas ao usuário e caso ele deseje encerra, será finaliza a operação.
		
		System.out.println("Encerrando programa");
	}
}