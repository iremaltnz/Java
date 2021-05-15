package inheritanceExample;

public class Instructor extends User {

	private int instructerNumber;
	private int countOfLessons;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructerNumber, int countOfLessons) {
		super();
		this.instructerNumber = instructerNumber;
		this.countOfLessons = countOfLessons;
	}
	
	public int getInstructerNumber() {
		return instructerNumber;
	}
	
	public void setInstructerNumber(int instructerNumber) {
		this.instructerNumber = instructerNumber;
	}
	
	public int getCountOfLessons() {
		return countOfLessons;
	}
	
	public void setCountOfLessons(int countOfLessons) {
		this.countOfLessons = countOfLessons;
	}
	
	
}
