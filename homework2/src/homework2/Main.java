package homework2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", "", "Engin Demiro�");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)", "", "Engin Demiro�");
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", "", "Engin Demiro�");
		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {

			System.out.println("Kurs Ad� : " + course.name + "\n" + "E�itmen Ad� : " + course.instructor);
			System.out.println("******************************************************************");

		}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		System.out.println("******************************************************************");

		Student student1 = new Student(1, "Dilara", "�zkaynak", "dilaraaozk@gmail.com", "123");
		
		Student[] students = { student1 };	
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		System.out.println("******************************************************************");
	}

}
