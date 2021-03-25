package exo_sedeplacer;

public class Main {

	public static void main(String[] args) {
		
Point A= new Point(1, 1);
Point B= new Point(5, 8);
A.afficher();
A.deplacer(3, 5);
A.afficher();
A.distanceAorigine();
double dist=A.distanceAorigine();
System.out.println(dist);
A.distancepointB(B);
double x=A.distancepointB(B);
System.out.println(x);
	}

}
