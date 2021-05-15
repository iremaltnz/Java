package inheritanceExample;

public class UserManager {

	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullanýcý sisteme kayýt edildi.");
	}
	
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullanýcý sisteme giriþ yaptý.");
	}
	
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli kullanýcý sistemden çýkýþ yaptý.");
	}
	
	public void getUser(User user) {
		System.out.println("Ýsim-Soyisim : "+user.getFirstName()+" "+user.getLastName()+" email : "+user.getEmail());
	}
}
