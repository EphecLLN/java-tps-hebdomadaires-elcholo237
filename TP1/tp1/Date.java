/**
 * 
 */
package tp1;



/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	private int jour;
	public int getJour() {
		return jour;
	}



	public void setJour(int jour) {
		this.jour = jour;
	}



	private int mois;
	public int getMois() {
		return mois;
	}



	public void setMois(int mois) {
		this.mois = mois;
	}



	private int année;
	
	
	
	public int getAnnée() {
		return année;
	}



	public void setAnnée(int année) {
		this.année = année;
	}



	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.année = Integer.parseInt(args[2]);
	}



	@Override
	public String toString() {
		return "jour=" + jour + ", mois=" + mois + ", année=" + année ;
	}
}
