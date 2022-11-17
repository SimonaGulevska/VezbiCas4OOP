package fikt.oop.inki895.zad1;

public class Main {

	public static void main(String[] args) {
		Covek c1=new Covek();
        c1.setIme("Симона");
        c1.setPrezime("Гулевска");
        c1.setMaticenBroj("1609002415001");
        System.out.println("Име на човекот: " + c1.getIme());
        System.out.println("Презиме на човекот: " + c1.getPrezime());
        System.out.println("Матичен број на човекот: " + c1.getMaticenBroj());
	}
}
