import java.util.Scanner;
	public class masukandata {
		public static void main(String[]args){
		String nama;
		String Npm;
		int nilaitugas1;
		int nilaitugas2;
		float nilairatarata;
		float nilairata;
		Scanner masuk = new Scanner(System.in);
		System.out.println ("masukkan nama =");
		nama = masuk.nextLine();
		System.out.println ("masukan Npm =");
		Npm = masuk.nextLine();
		System.out.println ("masukan nilai tugas1 =");
		nilaitugas1 = masuk.nextInt();
		System.out.println ("masukan nilai tugas2 =");
		nilaitugas2 = masuk.nextInt();
		System.out.println ("masukan nilai rata-rata =");
		nilairata = nilaitugas1 + nilaitugas2;
		nilairatarata = nilairata/2;
		System.out.println (nama);
		System.out.println (Npm);
		System.out.println (nilairatarata);
	}
}
