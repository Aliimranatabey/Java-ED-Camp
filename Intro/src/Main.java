
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String ortakMetin="İlginizi Çekebilir";
		System.out.println(ortakMetin);
		
		int vade=12;
		double dolarDun=18.14;
		double dolarBugun=18.10;
		boolean dolarDustuMu=false;
		String okYonu="";
		
		if(dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}else if(dolarBugun>dolarDun){
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else{
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		//Array
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		System.out.println(krediler[0]); 
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
