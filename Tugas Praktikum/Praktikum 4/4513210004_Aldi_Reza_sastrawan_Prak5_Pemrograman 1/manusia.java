public class manusia{
public String nama;
	public static void main(String[]args){	//main method
		manusia orang = new manusia();		//menciptakan objek orang
		orang.setNama("Aldi");
		System.out.println ("Namaku adalah="+orang.getNama());
	}	
	public void setNama(String namaku){		//method berparamenter
		this.nama=namaku;
	}
	public String getNama(){
		return this.nama;
	}
}
