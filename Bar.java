public class Bar {

	private int id;
	private String nombre;
	private String direccion;
	private ArrayList<Pintxo> pintxos;
	private ArrayList<Pote> potes;

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

	public void setDireccion (String direccionIntroducido) {
		this.direccion = direccionIntroducido;
	}

	public String getDireccion () {
		return this.direccion;
	}

	public void setPintxos (ArrayList<Pintxo> pintxosIntroducido) {
		this.pintxos = pintxosIntroducido;
	}

	public ArrayList<Pintxo> getPintxos () {
		return this.pintxos;
	}

	public void setPotes (ArrayList<Pote> potesIntroducido) {
		this.potes = potesIntroducido;
	}

	public ArrayList<Pote> getPotes () {
		return this.potes;
	}
}