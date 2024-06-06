package bouteille;

public class Bouteille {

	// attributes

	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDeContenu;

	// access/modifier

	// constructor

	// constructeur par default

	public Bouteille() {
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDeContenu = "H2O";

	}

	// Constructeur classique

	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu = _typeDeContenu;
	}

	// Constructeur par recopie ou de clonage

	public Bouteille(Bouteille _bouteilleARecopier) {

		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;
	}

	public float donneContenanceEnCL() {

		float result;
		result = this.contenuEnL * 100;

		return result;
	}

	// Methods

}
