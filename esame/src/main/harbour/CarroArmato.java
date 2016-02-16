package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore {
	private String id;
	private String modello;
	private int stazza;
	private int missili;
	
	
	//METHODS
	public CarroArmato(){
		
	}
	
	@Override
	public int potenzaFuoco() {
		return (this.stazza * this.missili*30/100);
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

	public double getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getMissili() {
		return missili;
	}

	public void setMissili(int missili) {
		this.missili = missili;
	}

	
	
}
