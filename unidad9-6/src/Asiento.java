
public class Asiento {

	protected char letra;
	protected int numero;
	protected boolean ocupado;
	
	public Asiento(char letra, int numero, boolean ocupado) {
		this.letra = letra;
		this.numero = numero;
		this.ocupado = ocupado;
	}

	public char getLetra() {
		return letra;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
}
