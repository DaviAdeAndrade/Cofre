package empresa;


public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}


	@Override
	void info() {
		super.info();
	}
	

	@Override
	double converterMoedas() {
		double totalEuro = valor * 5;  //variação do euro em 05/11/2022
		return totalEuro;
	}	// Valor da moeda que será declarada pelo usuário mais a variação dela.


	@Override
	public String toString() {
		return "Euro: " + valor + "";
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
