package fikt.oop.inki895.zad2;

public class Restoran {
	private String imeNaRestoranot;
	private String lokacija;
	private String telefon;
	private int brNaSedishta;
	
	public String getImeNaRestoranot() {
		return imeNaRestoranot;
	}
	public String getLokacija() {
		return lokacija;
	}
	public String getTelefon(){
		return telefon;
	}
	public int getBrNaSedishta() {
		return brNaSedishta;
	}
	public void setImeNaRestoranot(String imeNaRestoranot) {
		this.imeNaRestoranot=imeNaRestoranot;
	}
	public void setLokacija(String lokacija) {
		this.lokacija=lokacija;
	}
	public void setTelefon(String telefon) {
		this.telefon=telefon;
	}
	public void setBrNaSedishta(int brNaSedishta) {
		this.brNaSedishta=brNaSedishta;
	}
}