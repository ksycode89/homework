package Morning;

public interface InterfaceSale {
	
	//인터페이스에 상수 만들땐 대문자로//
	public static final double ONLINE_PAYMENT_RATIO  =0.05;
	public static final double OFFLINE_PAYMENT_RATIO =0.03;
	
	
	
	public int online(int price);
	public int offline(int price);
	public void showInfo();
			
}
