package fikt.oop.inki895.zad3;

public class Main {

	public static void main(String[] args) {
	Proizvod p1=new Proizvod();
	//PECATENJE NA VREDNOSTITE ZADADENI SO STATICEN KONSTRUKTOR
	System.out.println("Име на производот: "+p1.getImeNaProizvodot()+", цена: "+p1.getCena()+" денари. Производител: "+p1.getProizvoditel()+" и тежина на едно парче од производот: "+p1.getTezina()+" g.");
	//PROMENA NA VREDNOSTITE NA ATRIBUTITE SO SET METODITE
	p1.setImeNaProizvodot("Milka Caramel");
	p1.setCena(50);
	p1.setProizvoditel("Mondelez International");
	p1.setTezina(50.53);
	//PECATENJE SO GET METODITE
	System.out.println("Име на производот: "+p1.getImeNaProizvodot()+", цена: "+p1.getCena()+" денари. Производител: "+p1.getProizvoditel()+" и тежина на едно парче од производот: "+p1.getTezina()+" g.");
	}
}
