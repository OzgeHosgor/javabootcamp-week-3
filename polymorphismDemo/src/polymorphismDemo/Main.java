package polymorphismDemo;

import java.lang.System.Logger;

public class Main {
	public static void main(String[] args) {
		//BaseLoger[] logers = new BaseLoger [] {new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
		//for (BaseLoger loger:logers) {
		//	loger.Log("Log mesajı");
		// }
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	}
}
