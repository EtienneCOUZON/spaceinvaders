package fr.unilim.iut.spaceinvader;

public class Vaisseau {
	int x;
	int y;
	int longueur;
	int hauteur;
	public Vaisseau(int x, int y) {
		this.x = x;
		this.y = y;
		this.longueur=1;
		this.hauteur=1;
	}
	 public Vaisseau(int longueur, int hauteur, int x, int y) {
		   this.longueur=longueur;
		   this.hauteur=hauteur;
		   this.x = x;
		   this.y = y;
	    }
	public boolean occupeLaPosition(int x, int y) {
		return (this.x==x) && (this.y==y);
	}
	public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
 }
	public void seDeplacerVersLaGauche() {
	      this.x = this.x -1;
}
	
	public int getX() {
        return this.x;
	}

}
