package OdevPaket;

public class CurrentAccount extends Account{
	public CurrentAccount(int ID,int Balance) {
		super.setID(ID);
		super.setBalance(Balance);
	}

	
	@Override
	public void HesapTuru() {
		System.out.println("bu hesap faizsizdir ve hesapta para olma zorunluluğu yoktur.");
		
	}
}
