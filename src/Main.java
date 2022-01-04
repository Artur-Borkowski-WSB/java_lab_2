import java.util.Scanner;

public class Main {

	private static int[] tablica;

	public static void main(String[] args) {

		/* ćwiczenie 3 switch case */

		/* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
			i za pomocą switch case default ma określić czy:
			a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Zad1\nPodaj liczbę:");
		int a = scan.nextInt();
		System.out.println("\na)");
		switch (a % 2) {
			case 0:
				System.out.println("Parzysta");
				break;
			default:
				System.out.println("Nieparzysta");
				break;
		}

		// b) program który określi czy liczba jest podzielna przez 7
		System.out.println("\nb)");
		switch (a % 7) {
			case 0:
				System.out.println("Podzielna przez 7");
				break;
			default:
				System.out.println("Niepodzielna przez 7");
				break;
		}
		/* zad.2
			 a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
				"ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
			 b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
		 */
		System.out.println("\nZad2");
		String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
		int o = 0;
		int p = 0;
		int x = 0;
		int z = 0;
		int q = 0;
		int inne = 0;
		for (char litera : wyraz.toCharArray()) {
			switch (litera) {
				case 'o':
					o++;
					break;
				case 'p':
					p++;
					break;
				case 'x':
					x++;
					break;
				case 'z':
					z++;
					break;
				case 'q':
					q++;
					break;
				default:
					inne++;
					break;
			}
		}
		System.out.println("Ilość o: " + o);
		System.out.println("Ilość p: " + p);
		System.out.println("Ilość x: " + x);
		System.out.println("Ilość z: " + z);
		System.out.println("Ilość q: " + q);
		System.out.println("Ilość innych liter: " + inne);
	}
}
