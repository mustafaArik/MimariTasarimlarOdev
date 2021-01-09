
public class Araba extends Arac{

	public Araba(AracTipi tip1, AracTipi tip2) {
		super(tip1, tip2);
	}

	@Override
	public void purchase() {
		System.out.println("Araba");
		tip1.book();
		tip2.book();		
	}	

}
