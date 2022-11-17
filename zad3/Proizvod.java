package fikt.oop.inki895.zad3;

public class Proizvod {
	private String imeNaProizvodot;
	private int cena;
	private String proizvoditel;
	private double tezina;
	
	public Proizvod() {
		imeNaProizvodot="Toblerone";
        cena=74;
        proizvoditel=" Mondelez International";
        tezina=36.5;
	}
	public String getImeNaProizvodot() {
		return imeNaProizvodot;
	}
	public int getCena() {
		return cena;
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public double getTezina() {
		return tezina;
	}
	public void setImeNaProizvodot(String imeNaProizvodot) {
		this.imeNaProizvodot=imeNaProizvodot;
	}
	public void setCena(int cena) {
		this.cena=cena;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel=proizvoditel;
	}
	public void setTezina(double tezina) {
		this.tezina=tezina;
	}
}
