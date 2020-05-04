package fr.unilim.iut.spaceinvader;
public class SpaceInvaders {
	private static final char MARQUE_FIN_LIGNE = '\n';
	private static final char MARQUE_VIDE = '.';
	private static final char MARQUE_VAISSEAU = 'V';
	int longueur;
    int hauteur;
    Vaisseau vaisseau;

    public SpaceInvaders(int longueur, int hauteur) {
	   this.longueur = longueur;
	   this.hauteur = hauteur;
   }

    @Override
	public String toString() {
		return recupererEspaceJeuDansChaineASCII();
	}

	public String recupererEspaceJeuDansChaineASCII() {
		StringBuilder espaceDeJeu = new StringBuilder();
		for (int y = 0; y < hauteur; y++) {
			for (int x = 0; x < longueur; x++) {
				if (vaisseau!=null && vaisseau.occupeLaPosition(x, y))
					espaceDeJeu.append(MARQUE_VAISSEAU);
				else
					espaceDeJeu.append(MARQUE_VIDE);
			}
			espaceDeJeu.append(MARQUE_FIN_LIGNE);
		}
		return espaceDeJeu.toString();
	}

	public void positionnerUnNouveauVaisseau(int x, int y) {
		
		if (   estDansEspaceJeu(x, y)  )
			throw new fr.unilim.iut.spaceinvader.utils.HorsEspaceJeuException("Vous êtes en dehors de l'espace jeu");
	
		vaisseau = new Vaisseau(x, y); 

	}
public void positionnerUnNouveauVaisseau(int longueur, int hauteur,int x, int y) {
		
		if (   estDansEspaceJeu(x, y)  )
			throw new fr.unilim.iut.spaceinvader.utils.HorsEspaceJeuException("Vous êtes en dehors de l'espace jeu");
	
		vaisseau = new Vaisseau(x, y); 

	}

	private boolean estDansEspaceJeu(int x, int y) {
	return !(((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur)));
	}
	public void deplacerVaisseauVersLaDroite() {
        if (vaisseau.getX()< (longueur-1)) vaisseau.seDeplacerVersLaDroite();
	}
	public void deplacerVaisseauVersLaGauche() {
        if (vaisseau.getX()< (longueur-1)) vaisseau.seDeplacerVersLaGauche();
	}
}