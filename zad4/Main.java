package fikt.oop.inki895.zad4;

public class Main {

	public static void main(String[] args) {
		Avtomobil a1= new Avtomobil("Cadillac", "CTV-5", 2074.112, "црвена");
        System.out.println("Марка на автомобилот: "+a1.getMarka());
        System.out.println("Модел на автомобилот: "+a1.getModel());
        System.out.println("Почетни километри: "+a1.getPominatiKm()+" km");
        System.out.println("Боја на автомобилот: "+a1.getBoja());
        System.out.println("Километри после множењето(пресметката): " + a1.presmetka(7)+" km");
	}
}
