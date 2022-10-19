package overriding;

public class Main {
	public static void main(String [] args) {
		BaseKrediManager[] krediManager=new BaseKrediManager[] 
				{new OgretmenKrediManager(),new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager2:krediManager) {
			System.out.println(krediManager2.hesapla(1000));
		}
		
	}

}