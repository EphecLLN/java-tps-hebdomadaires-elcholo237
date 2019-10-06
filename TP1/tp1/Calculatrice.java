package tp1;

/**
 * Cette classe modÃ©lise une calculatrice simplifiÃ©e avec une valeur courante et trois opÃ©rations. 
 * @author vvandens
 *
 */
public class Calculatrice {
	
	public double getValeurCourante() {
		return valeurCourante;
	}
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	private double valeurCourante; // Stocke la valeur affichÃ©e sur l'Ã©cran de la calculatrice
	
	@Override
	public String toString() {
		return "valeurCourante=" + valeurCourante;
	}
	/**
	 * Additionne un nombre Ã  la valeur courante
	 * @param n le nombre Ã  ajouter Ã  la valeur courante de la calculatrice
	 */
	void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre Ã  la valeur courante
	 * @param n le nombre Ã  soustraire Ã  la valeur courante de la calculatrice
	 */
	void soustrait(double n) {
		valeurCourante-=n;
	}
	/**
	 * ElÃ¨ve la valeur courante au carrÃ©
	 */
	void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	 * MÃ©thode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.ajoute(5);
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
	}

}
