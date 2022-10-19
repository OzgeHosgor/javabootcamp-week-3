package polymorphismDemo;

public class CustomerManager {
	private BaseLoger loger;
	
	public CustomerManager(BaseLoger loger) {
		this.loger=loger;
	}
	
public void add() {
	System.out.println("Müşteri eklendi");
	this.loger.log("Log mesajı");
	
	}
}
