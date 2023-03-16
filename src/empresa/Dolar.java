
package empresa;


public class Dolar extends Moeda{


	public Dolar(double valor) {
		super(valor);
	}


	@Override
	void info() {
		super.info();
	}
	

	@Override
	double converterMoedas() {
		double totalDolar = valor * 5; //variação do dolar em 05/11/2022
		return totalDolar;
	}	// Valor da moeda que será declarada pelo usuário mais a variação dela.


	@Override
	public String toString() {
		return "Dolar: " + valor + "";
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}




}
