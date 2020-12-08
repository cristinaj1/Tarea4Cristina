package cris.tarea4cristinaj;

public class Prueba {

	public static void main(String[] args) {
		Galletas g = new Galletas();
		Galletas choco = new Galletas("chocolate", 3, 5.5);
		
		System.out.println(choco.toString());
		System.out.println(g.toString());
	}

}
