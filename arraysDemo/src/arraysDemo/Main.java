package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci_1="Engin";
		String ogrenci_2="Derin";
		String ogrenci_3="Salih";
		String ogrenci_4="Ahmet";
		
		System.out.println(ogrenci_1);
		System.out.println(ogrenci_2);
		System.out.println(ogrenci_3);
		System.out.println(ogrenci_4);
		
		System.out.println("---------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	
	}

}
