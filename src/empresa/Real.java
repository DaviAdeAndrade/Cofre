package empresa;

public class Real extends Moeda{


	public Real(double valor) {
		super(valor);

	}

	@Override
	void info() {
		super.info();
	}
	
	
	@Override
	double converterMoedas() {
		return valor;
	}	//Somente retorna o valor declarado pelo usuário, pois há variação.

	@Override
	public String toString() {
		return "Real: " + valor + "";
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
