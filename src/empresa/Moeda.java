package empresa;

import java.util.Objects;

abstract class Moeda{
    double valor;

    public Moeda(double valor) {
		super();
		this.valor = valor;
	}

	void info() { 
        System.out.println("Ultimo valor adicionado: " + valor);
    }
	
	
    abstract double converterMoedas();

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return valor == other.valor;
	}
    


}
