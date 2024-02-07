package j12_다형성.OTT;

public class OTTMiddleware {
	
	private Ott ott;

	public OTTMiddleware(Ott ott) {
		this.ott = ott;
	}
	
	public void watchDrama() {
		ott.drama();
	}

	public void watchMovie() {
		ott.movie();
	}
	
	public void watchAni() {
		ott.animation();
	}
	
	public void runAddOns() {
		if(ott instanceof Netflix) {
			((Netflix)ott).sale();
		} else if (ott instanceof Watcha) {
			((Watcha)ott).bundle();
		} else if (ott instanceof Tving) {
			((Tving)ott).freetier();
		}
	}
	

}
