package Morning;

public class InterSimplePay implements InterfaceSale {
	// 필드//
	private double simplePaymentRatio;

	// 생성자//
	public InterSimplePay() {
		super();
	}

	public InterSimplePay(double simplePaymentRatio) {
		super();
		this.simplePaymentRatio = simplePaymentRatio;
	}

	// getter setter//
	public double getSimplePaymentRatio() {
		return simplePaymentRatio;
	}

	public void setSimplePaymentRatio(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	// 메서드//
	@Override
	public int online(int price) {
		int OnPay =(int) (price-price*((ONLINE_PAYMENT_RATIO)+simplePaymentRatio));

		return OnPay;

	}

	@Override
	public int offline(int price) {
		int OffPay =(int) (price-price*((OFFLINE_PAYMENT_RATIO)+simplePaymentRatio));
		return OffPay;
	}

	@Override
	public void showInfo() {
		System.out.println("간편 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : "+(ONLINE_PAYMENT_RATIO+simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율  : "+(OFFLINE_PAYMENT_RATIO+simplePaymentRatio));
	}

}
