import java.util.Scanner;
public class kelulusan3{ 
	public static void main(String[]args){
	int nilai;
		Scanner masuk=new Scanner(System.in);
		System.out.print("Masukkan nilai= ");
		nilai=masuk.nextInt();
		if(nilai<50){
			System.out.println("Jelek");
		}
		else if(nilai==50){
		System.out.println("standart");
		}
		else if((nilai>50) &&(nilai<=99)){
		System.out.println("Lulus");
		}
		else if(nilai==100){
		System.out.println("Comlude");
		}
		else System.out.println("nilai tak terdefinisi");
	}
}
