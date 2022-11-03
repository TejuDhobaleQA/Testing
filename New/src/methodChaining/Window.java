package methodChaining;

public class Window {
	
	public WebDriver a() {
		WebDriver a=new Option();
		return a;
		
	}
	public static void main(String[] args) {
		Window a=new Window();
		a.a().a().a();
	}
}
