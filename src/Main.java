public class Main {

	public static void main(String[] args) {

		/* cw.1 pętle while */

		/* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
			Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
			to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
		*/
		// numer albumu: 57647
		System.out.println("Zad1");
		int liczba = 1000, podzielnik = 47;

		do {
			if (liczba % podzielnik == 0) {
				System.out.println("liczba " + liczba + " podzielna przez " + podzielnik);
			}
			liczba--;
		} while (liczba >= 0);

		/* zad 2
		a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
			przeiterować tablicę po elementach i wyswietlić, użyć pętli while */
		System.out.println("\nZad2\na)");
		int[] tabInt = {1, 2, 3, 4, 5};
		int i = 0;
		while (i < tabInt.length) {
			System.out.println(tabInt[i]);
			i++;
		}

		//	b) jak wyżej tylko dla tablicy typu double[],
		System.out.println("\nb)");
		double[] tabDbl = {1.2, 2.34, 3.456, 4.5678, 5.678910};
		int j = 0;
		while (j < tabInt.length) {
			System.out.println(tabDbl[j]);
			j++;
		}

		//	c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
		System.out.println("\nc)");
		String[] tabStr = {"Jeden", "Dwa", "Trzy", "Cztery", "Pięć"};
		int k = tabStr.length - 1;
		while (k >= 0) {
			System.out.println(tabStr[k]);
			k--;
		}

		// zad.3
		// a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)

		// while (true) == pętla nieskończona

		// b) a jak gdy damy false --> while(false)

		// while (false) == nigdy się nie wykona (unreachable statement)

	}
}
