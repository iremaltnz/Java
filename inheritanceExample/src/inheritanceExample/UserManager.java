package inheritanceExample;

public class UserManager {

	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullan�c� sisteme kay�t edildi.");
	}
	
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullan�c� sisteme giri� yapt�.");
	}
	
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullan�c� sistemden ��k�� yapt�.");
	}
	
	public void getUser(User user) {
		System.out.println("�sim-Soyisim : "+user.getFirstName()+" "+user.getLastName()+" email : "+user.getEmail());
	}
}
