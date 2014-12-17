public class PintxoPote {

	private Pintxo pintxo;
	private Pote pote;
	private double precio;

	//métodos getter y setter

	public void setPintxo (Pintxo pintxoIntroducido) {
		this.pintxo = pintxoIntroducido;
	}

	public Pintxo getPintxo () {
		return this.pintxo;
	}

	public void setPote (Pote poteIntroducido) {
		this.pote = poteIntroducido;
	}

	public Pote getPote () {
		return this.pote;
	}

	public void setPrecio (double precioIntroducido) {
		this.precio = precioIntroducido;
	}

	public double getPrecio () {
		return this.precio;
	}
} 
