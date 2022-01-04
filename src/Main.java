import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void z1b(int[] x) {
		System.out.println("Zad1");
		int y = 40;
		for (int i = 0; i < x.length; i++) {
			x[i] = y;
			y--;
		}
		z1c(x);
	}

	public static void z1c(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static void z2b(String[] x) {
		System.out.println("\nZad2\nPodaj tekst:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			x[i] = scan.next();
		}
		z2c(x);
	}

	public static void z2c(String[] x) {
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}
	}

	public static void z3(String imie) {
		System.out.println(imie);
	}

	public static void z3(String imie, String nazwisko) {
		System.out.println(imie + " " + nazwisko);
	}

	public static void z3(String imie, String nazwisko, int wiek) {
		System.out.println(imie + " " + nazwisko + ", " + wiek + " lat");
	}

	public static int z4(int x, int y) {
		return x + y;
	}

	public static int z4(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		/* ćwiczenie 5 Metody */

		/* zad.1
		a) stworzyć tablicę typu int[20],
		b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
		c) napisać metodę, która wypisze otrzymane wartości,
		d) wstawić wywołanie metody do metody main
		*/

		int[] z1a = new int[20];
		z1b(z1a);


		/* zad.2
		a) stworzyc tablicę typu String[6],
		b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
				(użyć do tego pętli i klasy Scanner),
		c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
		*/

		String[] z2a = new String[6];
		z2b(z2a);

		/* zad.3
		a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
				wyświetla w konsoli string który ma być waszym imieniem,
		b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
				wasze imie i nazwisko,
		c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
				nazwisko i wiek (int), a następnie wszystko wyświetli,
		*/

		System.out.println("\nZad3");
		z3("Artur");
		z3("Artur", "Borkowski");
		z3("Artur", "Borkowski", 21);

		/* zad.4
		a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
				coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
		b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
				którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
		c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
		*/
		System.out.println("\nZad4");
		int z4a = z4(5, 10);
		int z4b = z4(5, 10, 20);
		System.out.println("wynik: " + (z4(5, 10) + z4(5, 10, 20)));
	}
}
