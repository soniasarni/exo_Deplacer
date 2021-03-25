package exo_sedeplacer;

public class Point {
int abscisse;
int ordonnee;
public Point(int abscisse, int ordonnee) {
	super();
	this.abscisse = abscisse;
	this.ordonnee = ordonnee;
}
@Override
public String toString() {
	return "Point dont abscisse est :" + abscisse + ", et l'ordonnee est : " + ordonnee + "";
}
public void  afficher() {
	System.out.println("les coordonnées du point sont: ("+abscisse+" , "+ordonnee+  ")");
}
public void deplacer(int dx,int dy) {
	abscisse+=dx;
	ordonnee+=dy;
}
public double distanceAorigine() {
	
	return Math.sqrt(abscisse*abscisse+ ordonnee*ordonnee );
	
}
public double distancepointB(Point B) {
	
	return Math.sqrt((abscisse-B.abscisse)*(abscisse-B.abscisse)+(B.ordonnee-ordonnee)*(B.ordonnee-ordonnee));
}

}
