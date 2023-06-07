package OdevPaket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
	private ArrayList<Account> accounts;
	private Scanner scan;
	private Account account;
	private LocalDate date;
	private DateTimeFormatter dateTimeFormatter;
	public Bank() {
		accounts = new ArrayList <Account>();
	}
	public void getAccount() {
		for(Account account:accounts) {
			System.out.println("ID="+account.getID()+"BAKİYE="+account.getBalance());
		}
	}
	public void getDate() {
		date = LocalDate.now();
		dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(date.format(dateTimeFormatter).toString());
	}
	public void deposit(int ID,int cash) {
		for(Account account: accounts) {
			if(ID==account.getID()) {
				account.deposit(ID, cash);
				System.out.println(account.getID()+"nolu hesaba"+cash+"TL yatırıldı");
			}
			else {
				System.out.println("işleminizi gözden geçiriniz");
			}
		}
	}
	public void Withdraw(int ID , int cash) {
		for(Account account :accounts) {
			if(ID== account.getID()) {
				if (cash<= account.getBalance()) {
					account.withdraw(ID, cash);
					System.out.println(account.getID()+"ID hesabından"+cash+"TL para çekildi");
				}
				else {
					System.out.println("bakiye durumunuzu kontrol ediniz");
				}
			}			
		}
	}
	public void hesapOlustur(int secim) {
		Scanner scan= new Scanner(System.in);
		int ID;
		int Balance;
		if(secim==1) {
			System.out.println("Kısa Vadeli Hesap");
			System.out.println("ID numaranızı giriniz");
			ID=scan.nextInt();
			System.out.println("Başlangıç bakiyenizi giriniz");
			Balance=scan.nextInt();
			if(Balance>=1000) {
				ShorTermAccount account = new ShorTermAccount(ID,Balance);
				accounts.add(account);			
				System.out.println("Hesap oluşturuldu..("+date.now()+")");
				System.out.println("###################################");
			}
			else {
				System.out.println("Bakiyeniz 1000 TL den fazla olmalı");
			}
			}
			else if(secim==2) {
				System.out.println("Uzun Vadeli Hesap");
				System.out.println("ID numaranızı giriniz");
				ID=scan.nextInt();
				System.out.println("Başlangıç bakiyenizi giriniz");
				Balance=scan.nextInt();
				if(Balance>=1500) {
					LongTermAccount account = new LongTermAccount(ID,Balance);
					accounts.add(account);
					System.out.println("Hesap oluşturuldu..("+date.now()+")");
					System.out.println("###################################");
				}
				else {
					System.out.println("Bakiyeniz 1500 TL den fazla olmalı");
				}
		}
			else if(secim==3) {
				System.out.println("Ozel Hesap");
				System.out.println("ID numaranızı giriniz");
				ID=scan.nextInt();
				System.out.println("Başlangıç bakiyenizi giriniz");
				Balance=scan.nextInt();
				if(Balance>=1000) {
					int lucky=Balance /2000;
					SpecialAccount account = new SpecialAccount(ID,Balance,lucky);
					accounts.add(account);
					
					System.out.println("Hesap oluşturuldu..("+date.now()+")");
					System.out.println("###################################");
				}
				else {
					System.out.println("Bakiyeniz 1000 TL den fazla olmalı");
				}
		}
			else if(secim==4) {
				System.out.println("Current Hesap");
				System.out.println("ID numaranızı giriniz");
				ID=scan.nextInt();
				System.out.println("Başlangıç bakiyenizi giriniz");
				Balance=scan.nextInt();
				CurrentAccount account = new CurrentAccount(ID,Balance);
				accounts.add(account);
				
				System.out.println("Hesap oluşturuldu..("+date.now()+")");
				System.out.println("###################################");		
		}
	}
	public void sortition() {
		int specialsId []= new int [10] ;
		int specialsLucky[] = new int [10]  ;
		int BigLucky=0;
		int k =0;
		int z=0;
		System.out.println("----SPECİAL ACCOUNTS----");
		for(Account account:accounts) {
			if(account.getLucky()>=1) {
				specialsId[k]=account.getID();
				specialsLucky[k]=account.getLucky();
				System.out.println("ID="+account.getID()+"  Bakiye="+account.getBalance()+"  şans="+account.getLucky());	
				k++;
				
			}	
			
		}
		int a=k;
		Scanner scan=new Scanner(System.in);
		System.out.println("şans oyununu başlatmak için 1 yazınız");
		int evet=scan.nextInt();
		if(evet==1) {
		for(int n =0;n<a;n++) {
			if( BigLucky <=specialsLucky[n]) {
				BigLucky=specialsLucky[n];
				z=n;
			}	
		}
		System.out.println("kazanan hesabın ID="+specialsId[z]+" Kupon puanı="+BigLucky);
		}
		else {
				System.out.println("işleminizi gözden geçiriniz");
		}
	}
	
}
