package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore {
	private String id;
	private String modello;
	private int stazza;
	private int armaH;
	private int armaK;
	
	
	//METHODS
	public UBoot(){
		
	}
	
	@Override
	public int potenzaFuoco() {
		return ((20*this.armaH)+(30*this.armaK));		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getArmaH() {
		return armaH;
	}

	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}

	public int getArmaK() {
		return armaK;
	}

	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}


	
}