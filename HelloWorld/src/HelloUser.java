
public class HelloUser {

	private String _name;
	public HelloUser(String name){
		_name = name;
	}
	
	public void greetUser(){
		System.out.println("Hello " + _name + "!");
	}
}
