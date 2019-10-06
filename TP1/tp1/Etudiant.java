package tp1;


/**
 * Classe permettant la représentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String prénom;
	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	private int matricule;
	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;
	
	public Date getDateNaissance() {
		return dateNaissance;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", prénom=" + prénom + ", matricule=" + matricule + ", dateNaissance="
				+ dateNaissance ;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.nom = args[0];
		etu.prénom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.année = Integer.parseInt(args[5]);
	}

}
