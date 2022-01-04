public class Main {

	public static void main(String[] args) {

		/* cw.4  */

		/* zad.1 napisać 3 pętle for i użyc:
		a) w pierwszej pętli break
		b) w drugiej pętli continue
		c) w trzeciej pętli return
		*/
		System.out.println("a)");
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			if (i == 10) break;
			// liczby od 0 do 10
		}
		System.out.println("\nb)");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) continue;
			System.out.println(i);
			// liczby parzyste od 0 do 100
		}
		System.out.println("\nc)");
		for (int i = 0; ; i++) {
			if (i > 100) return;
			System.out.println(i);
			// return zamiast 2 parametru for
		}
	}
}
