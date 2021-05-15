package inheritanceExample;

public class StudentManager extends UserManager {

	@Override
	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli öðrenci sisteme kayýt edildi");
	}
	
	@Override
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli öðrenci sisteme giriþ yaptý.");
	}
	
	@Override
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli öðrenci sistemden çýkýþ yaptý.");
	}
	

	public void getStudent(Student student) {
		System.out.println("Öðrenci Hakkýnda : \n Ýsim-Soyisim : "+student.getFirstName()+" "+student.getLastName()+
				"\nEmail : "+student.getEmail()+"\nBölüm : "+student.getDepartment()+"\nSýnýf: "+student.getLevelInformation()+"\nDanýþmaný : "+student.getAdvisor());
	}
	
	public void getNoteInformation(Student student) {
		System.out.println("Not bilgisi listelendi.");
	}
	
	public void getTranscript(Student student) {
		System.out.println("Transkript bilgisi listelendi.");
	}
	
	public void getLessons(Student student) {
		System.out.println(""+student.getStudentNumber()+" numaralý öðrencinin aldýðý dersler listelendi.");
	}
	
    public void getExamDates(Student student) {
    	System.out.println(""+student.getStudentNumber()+" numaralý öðrencinin sýnav tarihleri listelendi.");
    }
}
