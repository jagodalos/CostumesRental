package model;

import java.time.LocalDate;

public class SingleLog {

	final private Costume costume;
	final private Customer customer;
	final private LocalDate date;

	public SingleLog(Costume costume, Customer customer, LocalDate date) {
		super();
		this.costume = costume;
		this.customer = customer;
		this.date = date;
	}

	public Costume getCostume() {
		return costume;
	}

	public Customer getCustomer() {
		return customer;
	}

	public LocalDate getDate() {
		return date;
	}
}
