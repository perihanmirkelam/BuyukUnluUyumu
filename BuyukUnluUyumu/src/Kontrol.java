import java.util.Scanner;
public class Kontrol {	
public static void main(String[] args) {			
  System.out.println("Bir sözcük giriniz:");			
  Scanner scanner = new Scanner(System.in);		
  String sozcuk = scanner.nextLine();		
  scanner.close();				
  uyumluMuYazdir(sozcuk);	
}		
public static void uyumluMuYazdir(String sozcuk){				
  String kalinHarfler = "AIOUaıou";		
  String inceHarfler = "EİÖÜeiöü";								
  int inceHarfSayisi=0, kalinHarfSayisi=0;
  if(sozcuk.matches("[a-zA-ZÂâÎîİıÇçŞşÜüÖöĞğ]+")){ 						
    for(int i=0; i<sozcuk.length(); i++){								
      if (inceHarfler.indexOf(sozcuk.charAt(i))!=-1) unluHarfSayisi++;								
      else if (kalinHarfler.indexOf(sozcuk.charAt(i))!=-1) unluHarfSayisi++;							
    }									
    int durum = (kalinHarfler+inceHarfler>=2) ? 						
                ( (inceHarfler>0) ? ( (kalinHarfler>0) ? 1 : 2 ) : 2 ) : 3;				
    switch (durum) {  				
      case 1:				
        System.out.println("'" + sozcuk + "'" + " büyük ünlü uyumuna uymuyor :/");				
        break;				
      case 2:				
        System.out.println("'" + sozcuk + "'" + " büyük ünlü uyumuna uyuyor :)");				
        break;				
      case 3:				
        System.out.println("En az iki heceli bir sözcük giriniz!");				
        break;				
      } 		    			
    }						
  else System.out.println("Harflerden oluşan ve yalnızca bir adet sözcük giriniz!");		
}
}
