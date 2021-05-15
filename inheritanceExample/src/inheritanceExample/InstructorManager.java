package inheritanceExample;

public class InstructorManager extends UserManager{

	@Override
	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli eðitmen sisteme kayýt edildi");
	}
	
	@Override
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli eðitmen sisteme giriþ yaptý.");
	}
	
	@Override
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli eðitmen sistemden çýkýþ yaptý.");
	}
	
	public void getInstructor(Instructor instructor){
		System.out.println("Eðitmenin : \n Ýsim - Soyisim : "+instructor.getFirstName()+" "+instructor.getLastName()+
				"\n Email : "+instructor.getEmail()+"\n Eðitmen Numarasý : "+instructor.getInstructerNumber()+"\nEðitmenin verdiði ders sayýsý : "+instructor.getCountOfLessons());
	}
	
	public void getLessons(Instructor instructor) {
	System.out.println(""+instructor.getInstructerNumber()+" numaralý eðitmenin verdiði dersler listelendi.");	
	}
	
	
}
