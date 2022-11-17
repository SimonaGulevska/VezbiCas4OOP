package fikt.oop.inki895.zad2;

public class Main {

	public static void main(String[] args) {
		Restoran r1=new Restoran();
		r1.setImeNaRestoranot("Aurum Kitchen & Bar");
        r1.setLokacija("Партизнаска 17");
        r1.setTelefon("047/612-500");
        r1.setBrNaSedishta(143);
        System.out.println("Име на ресторанот: "+r1.getImeNaRestoranot()+ ", локација: "+r1.getLokacija()+", контакт телефон за резервации:"+r1.getTelefon()+". Овој ресторан има капацитет од: "+r1.getBrNaSedishta()+" седишта.");
	}
}
