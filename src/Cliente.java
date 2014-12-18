public class Cliente {

	private int id;
	private String nombre; //Guardar Nombre Apellidos
	private Cartilla cartilla;

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

	public void setCartilla (Cartilla cartillaIntroducido) {
		this.cartilla = cartillaIntroducido;
	}

	public Cartilla getCartilla () {
		return this.cartilla;
	}
}