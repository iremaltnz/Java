package inheritanceExample;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
        student.setFirstName("İrem");
        student.setLastName("Altnz");
        student.setEmail("irem@gmail.com");
        student.setIdentityNumber("11111");
        student.setAdvisor("Ahmet Altnz");
        student.setStudentNumber(123123);
        student.setDepartment("Bilgisayar Mühendisliği");
        student.setLevelInformation(3);
        
        Instructor instructor=new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Ayça");
        instructor.setLastName("Bybr");
        instructor.setIdentityNumber("222222");
        instructor.setEmail("ayça@hotmail.com");
        instructor.setDepartment("Makina Mühendisliği");
        instructor.setInstructerNumber(456456);
        instructor.setCountOfLessons(3);
        
        User user=new User();
        user.setId(1);
        user.setFirstName("Seyda");
        user.setLastName("Unv");
        user.setEmail("seyda@gmail.com");
        user.setIdentityNumber("5555");
        user.setDepartment("Elektronik Mühendisliği");
        
        UserManager userManager=new UserManager();
        userManager.register(user);
        userManager.login(user);
        userManager.getUser(user);
        
        System.out.println("--------------------");
        
        StudentManager studentManager = new StudentManager();
        studentManager.register(student);
        studentManager.login(student);
        studentManager.getStudent(student);
        studentManager.getLessons(student);
        studentManager.getExamDates(student);
        studentManager.getTranscript(student);
        studentManager.getNoteInformation(student);
        
        System.out.println("--------------------");
        
        InstructorManager instructorManager= new InstructorManager();
        instructorManager.register(instructor);
        instructorManager.login(instructor);
        instructorManager.getInstructor(instructor);
        instructorManager.getLessons(instructor);
        
        
        
	}

}
