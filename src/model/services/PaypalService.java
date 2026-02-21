package model.services;

public class PaypalService implements OnlinePaymentServices {

	
	private double feePercentagem = 0.02;
	private double interest = 0.01;
	
	
	
	@Override
	public double paymentFee(double amount) {
		return amount * feePercentagem;
	}

	@Override
	public double interest(double amount, int months) {
		
		return amount * months * interest;
	}

}
