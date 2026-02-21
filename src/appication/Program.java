package appication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractServices;
import model.services.PaypalService;

public class Program {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Number");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Date");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		
		System.out.println("Valor do contrato");
		double amount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, amount);
		
		System.out.println("Entre com o numero de parcelas:");
		
		int n = sc.nextInt();
		
		ContractServices contractServices = new ContractServices(new PaypalService());
		
		
		contractServices.processContract(contract, n);
		
		for(Installment x : contract.getInstallment()) {
			
			System.out.println(x);
		}
		
		
		
		
		sc.close();
	}

}
