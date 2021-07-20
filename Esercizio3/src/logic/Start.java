package logic;
public class Start {
	public static void main(String[] args) {
		Calculations c = new Calculations();
		System.out.println("Somma: " + c.sum(2, 3));
		System.out.println("Sottrazione: " + c.subtraction(6, 3));
		System.out.println("Divisione: " + c.division(6, 3));
		System.out.println("RadiceQ: " + c.radiceQuadrata(9));
		System.out.println("Logaritmo: " + c.log(222.7));
	}

}
