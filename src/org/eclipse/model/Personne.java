package org.eclipse.model;

public class Personne {
	private int num;
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	private static int nbrPersonnes;
	
	{
		Personne.nbrPersonnes++;
	}
	
	public Personne( ) {
		
	}
	
	public Personne(int num, String nom, String prenom) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}



	public Personne(int num, String nom, String prenom, Adresse adresse) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}



	public void setNum(int value) {
		if (value > 0) {
			num = value;
		} else {
			num = 0;
		}
	}
	
	public int getNum() {
		return num;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	

}
