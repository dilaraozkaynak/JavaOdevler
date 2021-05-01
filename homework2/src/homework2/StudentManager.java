package homework2;

public class StudentManager {

	public void addStudent(Student student) {
		System.out.println("Öğrenci Eklendi." + "\nId: " + student.id + "\nÖğrenci Adı Soyadı: " + student.firstName + " " + student.lastName);
	}

	public void updateStudent(Student student) {
		System.out.println("Öğrenci Güncellendi." + "\nId: " + student.id + "\nÖğrenci Adı Soyadı: " + student.firstName + " " + student.lastName);
	}

	public void deleteStudent(Student student) {
		System.out.println("Öğrenci Silindi." + "\nId: " + student.id + "\nÖğrenci Adı Soyadı: " + student.firstName + " " + student.lastName);
	}
}
