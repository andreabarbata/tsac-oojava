package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	   
	   private AeroPorto p;
	   
	   public Gioco(AeroPorto p) {
	       super();
	       this.p = p;
	   }

	   public AeroPorto getP() {
	       return p;
	   }

	   public void setP(AeroPorto p) {
	       this.p = p;
	   }
	   
	   
	   public void attacco(Invasore[] inv){
	       int pf = 0;
	       for (int i = 0; i < inv.length; i++) {
	           pf += inv[i].potenzaFuoco();
	       }
	      
	       p.addMetriQuadriDistrutti(pf * 2.5);
	       System.out.println(pf * 2.5);	       
	   }
	   
	   

	   public boolean portoDistrutto() {
	
		   if((p.getDimensioneSqMeters() - p.getMetriQuadriDistrutti()) > 0){
			   return false;
		   }
		   else{
			   return true;
		   }	
}
}


