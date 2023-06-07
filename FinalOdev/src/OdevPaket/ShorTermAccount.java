package OdevPaket;

public class ShorTermAccount extends Account{
	public ShorTermAccount(int ID,int Balance) {
		super.setID(ID);
		super.setBalance(Balance);
	}

	
	@Override
	public void HesapTuru() {
		System.out.println("Yıllık %17 faiz verir ve en az 1000 TL bakiye olması gerekir");
		
	}
}
	


