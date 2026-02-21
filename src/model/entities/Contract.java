package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalAmount;
	private List <Installment> installment = new ArrayList<>();
	
	
	public Contract(Integer number, LocalDate date, Double totalAmount) {
	
		this.number = number;
		this.date = date;
		this.totalAmount = totalAmount;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public List<Installment> getInstallment() {
		return installment;
	}



	
	

}
