
public class KopruDeseniTest {

	public static void main(String[] args) {
		Arac arac1 = new Araba(new YeniArac(), new EskiArac());
		arac1.purchase();
		
		Bisiklet arac2 = new Bisiklet(new YeniArac(), new EskiArac());
		arac2.purchase();

	}

}
