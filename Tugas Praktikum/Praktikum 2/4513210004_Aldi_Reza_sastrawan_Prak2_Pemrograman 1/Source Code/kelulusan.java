import java.util.Scanner;

public class kelulusan{
	public static void main(String[]args){
		int nilai; 
		Scanner input = new Scanner (System.in);
		System.out.print("\nMasukkan Nilai :");
		nilai = input.nextInt();
		if ((nilai<49 && nilai>0)){
			System.out.println("Nilai Anda Jelek !");
		}	
		else if (nilai == 50){
			System.out.println("Sedang");
		}
		else if ((nilai>51 && nilai<100)){
		System.out.println("Selamat anda lulus");
		}
		else {
		System.out.println("Ga usah kuliah");
		}
		System.out.println ("keluar");
	}
}	