import java.util.Scanner;
public class outputArray{
	public static void main(String [] args){
		int angka[] = new int[10];
		int i,banyak;
		int jumlah;
		jumlah=0;
			Scanner input = new Scanner(System.in);
			System.out.print("MasukkanBanyakangka = ");
			banyak = input.nextInt();
			
			for(i=0;i<banyak;i++){
				System.out.print("MasukkanAngka = ");
				angka[i] = input.nextInt();
				jumlah = jumlah + angka[i];
			}
			System.out.println("Jumlahnyaadalah " + jumlah);
				if(jumlah%2==0){
					System.out.println("\nJumlahtermasukbilangangenap");
				}
				else System.out.println("\nJumlahtermasukbilanganganjil");
	}
}
