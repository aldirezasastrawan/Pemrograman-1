import java.util.Scanner;
	public class masukan {
		public static void main(String[]args){
		int angkapertama;
		int angkakedua;
		Scanner masuk = new Scanner(System.in);
		System.out.println ("masukkan angka pertama =");
		angkapertama = masuk.nextInt();
		System.out.println ("masukkan angka kedua =");
		angkakedua = masuk.nextInt();
		System.out.println (angkapertama);
		System.out.println (angkakedua);
	}
}
