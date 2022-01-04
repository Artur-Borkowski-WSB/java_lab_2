import java.util.*;

public class Main {

	public static void wypisz(ArrayList<String> x) {
		for (String el : x) {
			System.out.println(el);
		}
		System.out.println("Wielkość listy: " + x.size() + "\n");
	}

	public static void main(String[] args) {

		/* ćw_6 Listy */

		/* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
						Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
						elementów i elementami mają być nazwy zwierząt.
						b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
						-- podpowiedź: for(String zmienna : List<String>)
						c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
						następnie wyświetlić listę i wielkość listy,
						d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
						elementów listy
			*/

		System.out.println("Zad1\nPodaj 5 zwierząt:");
		ArrayList<String> lista1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			lista1.add(scan.next());
		}
		wypisz(lista1);
		lista1.remove(lista1.size() - 1);
		lista1.remove(lista1.size() - 1);
		lista1.add("Kot");
		lista1.add("Pies");
		lista1.add("Kangur");
		wypisz(lista1);
		Collections.sort(lista1, Collections.reverseOrder());
		wypisz(lista1);
		 /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
						niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
						 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
		 */
		System.out.println("Zad2\nPodaj 10 liczb:");
		Set<Integer> lista2 = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			lista2.add(scan.nextInt());
		}
		System.out.println(lista2);
		for (Integer el : lista2) {
			System.out.println(el);
		}
	}
}
