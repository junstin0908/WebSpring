package burger_v01;



public class Order {

	private BugerMenu bugerMenu;
	
	public BugerMenu getBugerMenu() {
		return bugerMenu;
	}

	public void showorder() {
		String sBuger2 = bugerMenu.getsBuger();
		System.out.println(sBuger2);
	}
	
	
}
