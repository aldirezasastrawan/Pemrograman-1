class orang{
	String Nama;
	public String getNama(){
		return Nama;
	}
	public void setNama(String x){
		this.Nama=x;
	}
	public static void main(String[] args){
	orang orangpertama= new orang();
	orangpertama.setNama("Aldi Reza Sastrawan");
	System.out.print("Your Name is :");
	System.out.print(orangpertama.getNama());
	}
}
