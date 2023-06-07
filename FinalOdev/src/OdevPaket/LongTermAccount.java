package OdevPaket;

public class LongTermAccount extends Account {
	public LongTermAccount(int ID,int Balance) {
		super.setID(ID);
		super.setBalance(Balance);
	}

	
	@Override
	public void HesapTuru() {
		System.out.println("Yıllık %24 faiz verir ve en az 1500 TL bakiye olması gerekir");
		
	}
}
