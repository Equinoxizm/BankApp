package OdevPaket;

import java.util.ArrayList;

public abstract class Account {
	private int ID;
	private int Balance=0;
	private int lucky;
	
	
	public void setLucky(int lucky) {
		this.lucky=lucky;
	}
	public int getLucky() {
		return lucky;
	}
	public void deposit(int ID,int cash) {
		Balance+=cash;
	}
	public void withdraw(int ID,int cash) {
		Balance-=cash;
	}
	public void setBalance(int Balance) {
		this.Balance=Balance;
	}
	public int getBalance() {
		return Balance;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public int getID() {
		return ID;
	}
	
	
	public abstract void HesapTuru();
}
