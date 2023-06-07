package OdevPaket;

public class SpecialAccount extends Account{
	


	public SpecialAccount(int ID,int Balance,int lucky) {
		super.setID(ID);
		super.setBalance(Balance);
		super.setLucky(lucky);
	}
	
	
	@Override
	public void HesapTuru() {
		System.out.println("bu tür hesap yıllık %12 faiz verir ve en az hesap açtığındakı kadar para hesapta bakiye olması gerekiyor.");
		
	}


	
}
