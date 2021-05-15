package inheritanceExample;

public class InstructorManager extends UserManager{

	@Override
	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli e�itmen sisteme kay�t edildi");
	}
	
	@Override
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli e�itmen sisteme giri� yapt�.");
	}
	
	@Override
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli e�itmen sistemden ��k�� yapt�.");
	}
	
	public void getInstructor(Instructor instructor){
		System.out.println("E�itmenin : \n �sim - Soyisim : "+instructor.getFirstName()+" "+instructor.getLastName()+
				"\n Email : "+instructor.getEmail()+"\n E�itmen Numaras� : "+instructor.getInstructerNumber()+"\nE�itmenin verdi�i ders say�s� : "+instructor.getCountOfLessons());
	}
	
	public void getLessons(Instructor instructor) {
	System.out.println(""+instructor.getInstructerNumber()+" numaral� e�itmenin verdi�i dersler listelendi.");	
	}
	
	
}
