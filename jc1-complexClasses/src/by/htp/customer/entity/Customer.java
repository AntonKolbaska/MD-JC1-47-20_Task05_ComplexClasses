package by.htp.customer.entity;

public class Customer {
	private int id;
	private String surName;
	private String firstName;
	private String lastName;
	private String adress;
	private int cardNumber;
	private int accountNumber;
	
	public Customer() {
		this.id = 00000000;
		this.surName = "default surname";
		this.firstName = "default firstname";
		this.lastName = "default lastname";
		this.adress = "default adress";
		this.cardNumber = 00000000;
		this.accountNumber = 00000000;
	}
	
	
	public Customer(int id, String surName, String firstName, String lastName, String adress, int cardNumber, int accountNumber) {
		this.id = id;
		this.surName = surName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return  "ID: " + id +  "\t|\tCustomer: " + surName + "\t" + firstName + "\t" + lastName +  "\t|\tAddres: = " + adress + "\t|\tCard number: = " + cardNumber
				+ "\t|\tAccount number: = " + accountNumber;
	}
	
	
	
}

