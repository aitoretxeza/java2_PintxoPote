public class Pintxo {

	private int id;
	private String nombre;
	private String[] ingredientes;
	private int tipo;

	//1: Basico 2:Selecto
	//1: Tortilla patata, ...
	//2: Foie,...
	//métodos getter y setter

	public void setId (int idIntroducido) {
		this.id = idIntroducido;
	}

	public int getId () {
		return this.id;
	}

	public void setNombre (String nombreIntroducido) {
		this.nombre = nombreIntroducido;
	}

	public String getNombre () {
		return this.nombre;
	}

	public void setIngredientes (String[] ingredientesIntroducido) {
		this.ingredientes = ingredientesIntroducido;
	}

	public String[] getIngredientes () {
		return this.ingredientes;
	}

	public void setTipo (int tipoIntroducido) {
		this.tipo = tipoIntroducido;
	}

	public int getTipo () {
		return this.tipo;
	}
}
