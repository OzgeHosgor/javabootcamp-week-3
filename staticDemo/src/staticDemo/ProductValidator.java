package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static Yapıcı blog çalıştı");
	}
	
	
	public ProductValidator() {
		System.out.println("Yapıcı blog çalıştı");
	}
		
	public static boolean isValid(Product product) {
	if(product.price>0 && !product.name.isEmpty()) {
		return true;
	}else {
		return false;
	}
}
	
	public void bisey() {
		
	}
	public static class Baskabirclass {
		public static void Sil() {
			
			
		}
	
	}
}