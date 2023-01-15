package ch06;

public class ShopService {

	/* ShopService객체룰 싱글톤으로 만들고 싶습니다.
	 * ShopServiceExample클래스에서 ShopService의 getInstance()메소드로 
	 * ShopService 클래스를 작성해보세요 */
	
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	public static ShopService getInstance() {
		return shopservice;
	}
	


}
