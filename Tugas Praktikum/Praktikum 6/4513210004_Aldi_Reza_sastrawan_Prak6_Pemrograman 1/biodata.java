class biodata { //nama kelas
//deklarasi variabel
	String Nama; //mendeklarasikan variabel Nama yang bertipe data string
	String Umur; //mendeklarasikan variabel Umur yang bertipe data string
	String NPM; //mendeklarasikan variabel NPM yang bertipe data string
	String jurusan; //mendeklarasikan variabel jurusan yang bertipe data string
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama
	}
	public void setNama(String x){ //deklarasi set untuk atribut Nama
		this.Nama=x;
	}
	
	public String getUmur(){ //inisialisasi nilai Umur
		return Umur; //mengembalikan nilai Umur
	}
	public void setUmur(String a){ //deklarasi set untuk atribut Umur
		this.Umur=a;
	}
	
	public String getNPM(){ //inisialisasi nilai NPM
		return NPM; //mengembalikan nilai NPM
	}
	public void setNPM(String b){ //deklarasi set untuk atribut NPM
		this.NPM=b;
	}
	
	public String getjurusan(){ //inisialisasi nilai jurusan
		return jurusan; //mengembalikan nilai jurusan
	}
	public void setjurusan(String j){ //deklarasi set untuk atribut jurusan
		this.jurusan=j;
	}
	public static void main(String [] args){
		biodata hammy = new biodata();
		hammy.setNama("Aldi Reza Sastrawan"); //mengisi nilai setter Nama 
		System.out.print("Nama orang : "); //output kalimat
		System.out.print(hammy.getNama()); //memanggil setter Nama dengan getter
		
		hammy.setUmur("20tahun"); //mengisi nilai setter Umur
		System.out.print("\nUmurnya adalah : "); //output kalimat
		System.out.print(hammy.getUmur()); //memanggil setter Umur dengan getter
		
		hammy.setNPM("4513210004"); //mengisi nilai setter NPM
		System.out.print("\nNPMnya adalah : "); //output kalimat
		System.out.print(hammy.getNPM()); //memanggil setter NPM dengan getter
		
		hammy.setjurusan("TEKNIK INFORMATIKA"); //mengisi nilai setter jurusan
		System.out.print("\njurusannya adalah : "); //output kalimat
		System.out.print(hammy.getjurusan()); //memanggil setter jurusan dengan getter
	}
}
