package OdevPaket;
import java.util.Scanner;
public class MainSınıf {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scan = new Scanner(System.in);
		int secim;
		System.out.println("1. Create_S_ID_balance:");//Kısa vadeli hesap açar. (hesap no=ID, başlangıç parası =balance)
		System.out.println("2. Create_L_ID_balance:");//Uzun vadeli hesap açar. (hesap no=ID, başlangıç parası =balance)
		System.out.println("3. Create_O_ID_balance:");//Özel hesap açar. (hesap no=ID, başlangıç parası = balance)
		System.out.println("4. Create_C_ID_balance:");//Cari hesap açar. (hesap no=ID, başlangıç parası = balance)
		System.out.println("5. Increase_ID_cash:");//ID’ye ait hesaba “cash” kadar para ekler.
		System.out.println("6. Decrease_ID_cash:");//ID’ye ait hesaptan “cash” kadar para çeker.
		System.out.println("7. Set_dd_mm_yy:");//Sistemin şu anki tarihini düzenler.
		System.out.println("8. ShowAccount:");//Tüm hesapların ID’sini ve yaptığı son 5 işlemi gösterir.
		System.out.println("9. ShowIDs:");//Sistemdeki tüm hesap numaralarını listeler.
		System.out.println("10. Sortition:");//Özel hesaplar için kura çeker ve sonucu gösterir.
		System.out.println("Çıkış yapmak için 11'i seçiniz");
		do {
			System.out.println("lütfen bir işlem seçiniz");
			secim=scan.nextInt();
			if(1==secim || secim==2 || secim==3 || secim==4 ) {
				bank.hesapOlustur(secim);
				
			}
			else if(secim==5) {
				System.out.println("para yatırmak istediğiniz hesap ID=");
				int ıdNo=scan.nextInt();
				System.out.println("para yatırmak istediğiniz miktar=");
				int cash = scan.nextInt();
				bank.deposit(ıdNo, cash);
				System.out.println("###################################");
				}
			else if(secim==6) {
				System.out.println("para çekmek istediğiniz hesap ID=");
				int ıdNo=scan.nextInt();
				System.out.println("çekmek istediğiniz para miktarı=");
				int cash=scan.nextInt();
				bank.Withdraw(ıdNo, cash);
				System.out.println("###################################");
			}
			else if(secim==7) {
				
			}
			else if(secim==8) {
				bank.getAccount();
				System.out.println("###################################");
			}
			else if(secim==9) {
				bank.getAccount();
				System.out.println("###################################");
			}
			else if(secim==10) {
				bank.sortition();
				System.out.println("###################################");
			}
			else {
					System.out.println("lütfen işleminizi kontrol ediniz");
					System.out.println("###################################");
			}
			
		}while(secim!=11);
	}

}
