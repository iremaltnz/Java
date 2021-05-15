package inheritanceExample;

public class StudentManager extends UserManager {

	@Override
	public void register(User user) {
		System.out.println(""+user.getFirstName()+" isimli ��renci sisteme kay�t edildi");
	}
	
	@Override
	public void login(User user) {
		System.out.println(""+user.getFirstName()+" isimli ��renci sisteme giri� yapt�.");
	}
	
	@Override
	public void signOut(User user) {
		System.out.println(""+user.getFirstName()+" isimli ��renci sistemden ��k�� yapt�.");
	}
	

	public void getStudent(Student student) {
		System.out.println("��renci Hakk�nda : \n �sim-Soyisim : "+student.getFirstName()+" "+student.getLastName()+
				"\nEmail : "+student.getEmail()+"\nB�l�m : "+student.getDepartment()+"\nS�n�f: "+student.getLevelInformation()+"\nDan��man� : "+student.getAdvisor());
	}
	
	public void getNoteInformation(Student student) {
		System.out.println("Not bilgisi listelendi.");
	}
	
	public void getTranscript(Student student) {
		System.out.println("Transkript bilgisi listelendi.");
	}
	
	public void getLessons(Student student) {
		System.out.println(""+student.getStudentNumber()+" numaral� ��rencinin ald��� dersler listelendi.");
	}
	
    public void getExamDates(Student student) {
    	System.out.println(""+student.getStudentNumber()+" numaral� ��rencinin s�nav tarihleri listelendi.");
    }
}
