import java.util.Scanner;
public class nilai{ 
	public static void main(String[]args){
	int nilai;
		Scanner masuk=new Scanner(System.in);
		System.out.print("Masukkan nilai= ");
		nilai=masuk.nextInt();
		if(nilai==10){
			System.out.println("Sepuluh");
		}
		else if(nilai==20){
		System.out.println("Dua Puluh");
		}
		else if((nilai!=10) &&(nilai!=20)){
		System.out.println("Bukan 10 & 20");
		}
		else System.out.println("nilai tak terdefinisi");
	}
}
