import java.util.Scanner;
	public class masukannama {
		public static void main(String[]args){
		String namapertama;
		String namakedua;
		String Npmpertama;
		String Npmkedua;
		Scanner masuk = new Scanner(System.in);
		System.out.println ("masukkan nama pertama =");
		namapertama = masuk.nextLine();
		System.out.println ("masukan Npm pertama =");
		Npmpertama = masuk.nextLine();
		System.out.println ("masukkan nama kedua =");
		namakedua = masuk.nextLine();
		System.out.println ("masukan Npm kedua =");
		Npmkedua = masuk.nextLine();
		System.out.println (namapertama);
		System.out.println (namakedua);
		System.out.println (Npmpertama);
		System.out.println (Npmkedua);
	}
}
