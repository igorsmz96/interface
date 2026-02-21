package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractServices {
	
	private OnlinePaymentServices onlinePaymentServices;

	public ContractServices(OnlinePaymentServices onlinePaymentServices) {
		
		this.onlinePaymentServices = onlinePaymentServices;
	}
	
	// metodo pra calcular as parcelas
	
	public void processContract(Contract contract, int months) {
		
		double valorParcela = contract.getTotalAmount() / months;
		
		for (int i =1; i<=months ; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentServices.interest(valorParcela,i);
			double paymentFee = onlinePaymentServices.paymentFee(valorParcela);
			
			double total = valorParcela + interest + paymentFee;
			
			contract.getInstallment().add(new Installment(dueDate, total));
		}
	}
	
	
	
	

}
