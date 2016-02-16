package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {
	private String nome;
	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	private double metriQuadriDistrutti;
	
	public AeroPorto(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}
	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
	}
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	public void setDimensioneSqMetersNonDistrutta(double dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters - metriQuadriDistrutti;
	}
	public double getMetriQuadriDistrutti() {
		return metriQuadriDistrutti;
	}
	public void setMetriQuadriDistrutti(double metriQuadriDistrutti) {
		this.metriQuadriDistrutti = metriQuadriDistrutti;
	}
	public void addMetriQuadriDistrutti(double mqd){
	       if(mqd < dimensioneSqMetersNonDistrutta)
	           dimensioneSqMetersNonDistrutta -= mqd;
	       else
	           dimensioneSqMetersNonDistrutta = 0;
	   }
	   
	}
	
	

