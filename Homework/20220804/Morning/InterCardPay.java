package Morning;

public class InterCardPay implements InterfaceSale {
//필드
	private double cardRatio;
	
//생성자
	public InterCardPay() {super();}
	public InterCardPay(double cardRatio) {
		super();
		this.cardRatio = cardRatio;
	}
//getter setter	
public double getCardRatio() {
		return cardRatio;
	}
	public void setCardRatio(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	//메서드	
	@Override
	public int online(int price) {
		int OnPay =(int) (price-price*(ONLINE_PAYMENT_RATIO+cardRatio));
		 
					
		return OnPay;
	}

	@Override
	public int offline(int price) {
		int OffPay =(int) (price-price*(OFFLINE_PAYMENT_RATIO+cardRatio));
		
		return OffPay;
	}

	@Override
	public void showInfo() {
		System.out.println("간편 결제 시 할인정보 : ");
		System.out.println("온라인 결제 시 총 할인율 : "+(ONLINE_PAYMENT_RATIO+cardRatio));
		System.out.println("오프라인 결제 시 총 할인율  : "+(OFFLINE_PAYMENT_RATIO+cardRatio));
		
	}

}
