package empresa;

import java.util.ArrayList;

public class Cofrinho {
		// As moedas serão armazenas nessa lista "listaMoedas".
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	
	public Cofrinho(ArrayList<Moeda> listaMoedas) {
		super();
		this.listaMoedas = listaMoedas;
	}

	public Cofrinho() {}

	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	} // Está função utilizará um método de Array para adicionar uma novo item ao Array "listaMoedas".
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}	// Está função utilizará um método de Array para remover um item do Array "listaMoedas".
	
	public void listagemMoedas() {
		for (Moeda m : listaMoedas) {
			System.out.println(m);
		}
	} // Ao executar essa função, será executado um loop que para cada item no Array, gerará uma impressão do item no console.
	
	public void totalConvertido() {
		double valorTotal = 0;
		for(Moeda m : listaMoedas) {
			valorTotal += m.converterMoedas();
		}
		System.out.println("Valor total em reais: " + valorTotal);
	}	//Ao executar essa função, para cada item na lista será criado uma variavel que armazena o valor do item atual mais o valor dela convertido em real.


	
}
