public class Pote {

	private int id;
	private String nombre;
	private int tipo;

	//1: Basico 2: Selecto
	//1: Agua, zurito, vino del año
	//2: Caña, refrescos, vino crianza
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

	public void setTipo (int tipoIntroducido) {
		this.tipo = tipoIntroducido;
	}

	public int getTipo () {
		return this.tipo;
	}
}