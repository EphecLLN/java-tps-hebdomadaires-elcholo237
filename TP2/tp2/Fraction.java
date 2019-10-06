package tp2;

public class Fraction {
	private double numerateur;
	public double getNumerateur() {
		return numerateur;
	}
	public Fraction(double num,double den) {
		numerateur=num;
		if(den!=0)
		denominateur=den;
		else 
			System.out.println("Denominateur non nul");
	}
	public void setNumerateur(double numerateur) {
		this.numerateur = numerateur;
	}
	private double denominateur;
	public double getDenominateur() {
		return denominateur;
	}
	public void setDenominateur(double denominateur) {
		if(denominateur!=0)
		this.denominateur = denominateur;
	}
	
    @Override
	public String toString() {
		return "Fraction =" + getNumerateur() + "/" + getDenominateur();
	}
	public double getValeurReelle() {
    	double ValeurReelle = getNumerateur()/getDenominateur();
    	return ValeurReelle;
    }
}
