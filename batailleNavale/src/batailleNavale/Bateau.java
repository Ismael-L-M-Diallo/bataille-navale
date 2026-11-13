package batailleNavale;

public class Bateau {
	private int taille;
	private boolean estCoule;
	
	public void setTaille(int x) {
		this.taille=x;
	}
	
	public int getTaille(){
		return taille;
	}
	
	public boolean isEstCoule(){return this.estCoule;}
	
	
	public void setEstCoule(boolean estCoule) {this.estCoule = estCoule;}

}
