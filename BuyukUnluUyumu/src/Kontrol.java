import java.util.ArrayList;
import java.util.Scanner;

public class Kontrol {

	public static void main(String[] args) {
		
	    System.out.println("Bir s�zc�k giriniz!");	
		Scanner scanner = new Scanner(System.in);
		String sozcuk = scanner.nextLine();
		scanner.close();
		
		uyumluMuYazdir(sozcuk);
	}
	
	public static void uyumluMuYazdir(String sozcuk){
		
		String kalinHarfler = "AIOUa�ou";
		String inceHarfler = "E���ei��";
		
		boolean kalinHarfVarMi = false;
		boolean inceHarfVarMi = false;
		
		int unluHarfSayisi=0;	
		
		if(sozcuk.matches("[a-zA-Z����������������]+")){ 
			
			for(int i=0; i<sozcuk.length(); i++){
				char c=sozcuk.charAt(i);
				if (inceHarfler.indexOf(c)!=-1){ 
					inceHarfVarMi=true;
					unluHarfSayisi++;
				}
				else if (kalinHarfler.indexOf(c)!=-1){
					kalinHarfVarMi=true;
					unluHarfSayisi++;
				}
			}		
			
				int durum = (unluHarfSayisi>=2) ? 
						( inceHarfVarMi ? (kalinHarfVarMi ? 1 : 2) : 3 ) : 4;

				switch (durum) {  
				  case 1:
				    System.out.println("'" +sozcuk+"'" + " b�y�k �nl� uyumuna uymuyor :/");
				    break;
				  case 2:
				    System.out.println(sozcuk + " b�y�k �nl� uyumuna uyuyor :)");
				    break;
				  case 3:
				    System.out.println(sozcuk + " b�y�k �nl� uyumuna uyuyor :)");
				    break;
				  case 4:
				    System.out.println("En az iki heceli bir s�zc�k giriniz!");
				    break;
				  }		    
			}				
		else System.out.println("Bir s�zc�k giriniz!");	
	}
}




	

