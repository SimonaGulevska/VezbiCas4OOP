package fikt.oop.inki895.zad4;

public class Avtomobil {
	private String marka;
	private String model;
	private double pominatiKm;
	private String boja;
	
	public Avtomobil(String marka,String model,double pominatiKm,String boja) {
		this.marka=marka;
		this.model=model;
		this.pominatiKm=pominatiKm;
		this.boja=boja;
	}
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public double getPominatiKm() {
		return pominatiKm;
	}
	public String getBoja() {
		return boja;
	}
	public void setMarka(String marka) {
        this.marka = marka;
    }
	public void setModel(String model) {
        this.model = model;
    }
	public void setPominatiKm(double pominatiKm) {
        this.pominatiKm = pominatiKm;
    }
	public double presmetka (double pomnoziKm) {
        double vkupnoKm;
        vkupnoKm=pominatiKm*pomnoziKm;
        return vkupnoKm;
    }
}
