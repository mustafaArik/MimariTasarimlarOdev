
public class Bisiklet extends Arac{

	public Bisiklet(AracTipi tip1, AracTipi tip2) {
		super(tip1, tip2);
	}

	@Override
	public void purchase() {
		System.out.println("Bisiklet");
		tip1.book();
		tip2.book();
		
	}

}
