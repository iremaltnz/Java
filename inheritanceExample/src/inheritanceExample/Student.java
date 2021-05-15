package inheritanceExample;

public class Student extends User {

	private int studentNumber;
	private int levelInformation;
	private String advisor;
	
	public Student(){
		
	}

	public Student(int studentNumber, int levelInformation, String advisor) {
		
		this.studentNumber = studentNumber;
		this.levelInformation = levelInformation;
		this.advisor = advisor;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getLevelInformation() {
		return levelInformation;
	}

	public void setLevelInformation(int levelInformation) {
		this.levelInformation = levelInformation;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
	
	
}
