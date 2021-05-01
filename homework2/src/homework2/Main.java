package homework2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", "", "Engin Demiroğ");
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "", "Engin Demiroğ");
		Course course3 = new Course(3, "Programlamaya Giriş İçin Temel Kurs", "", "Engin Demiroğ");
		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {

			System.out.println("Kurs Adı : " + course.name + "\n" + "Eğitmen Adı : " + course.instructor);
			System.out.println("******************************************************************");

		}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		System.out.println("******************************************************************");

		Student student1 = new Student(1, "Dilara", "Özkaynak", "dilaraaozk@gmail.com", "123");
		
		Student[] students = { student1 };	
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		System.out.println("******************************************************************");
	}

}
