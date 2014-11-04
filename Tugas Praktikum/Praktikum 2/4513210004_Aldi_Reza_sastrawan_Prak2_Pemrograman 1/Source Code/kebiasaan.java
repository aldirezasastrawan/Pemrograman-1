import java.util.Scanner;
public class kebiasaan{ 
	public static void main(String[]args){
	int pilih;
		Scanner masuk=new Scanner(System.in);
		System.out.print("Pilihan : \n");
		System.out.print("1. Makan \n");
		System.out.print("2. Mandi \n");
		System.out.print("3. Tidur \n");
		System.out.print("4. Jalan - Jalan \n");
		System.out.print("Masukan Pilihan Anda = \n");
		pilih=masuk.nextInt();
		switch(pilih){
		case 1: System.out.print("Saya Suka Makan");
		break;
		case 2: System.out.print("Saya Suka Mandi");
		break;
		case 3: System.out.print("Saya Suka Tidur");
		break;
		case 4: System.out.print("Saya Suka Jalan - jalan");
		break;
		default: System.out.print("Menu Tidak Ada");
		}	
	}
}
