package homework2;

public class StudentManager {

	public void addStudent(Student student) {
		System.out.println("��renci Eklendi." + "\nId: " + student.id + "\n��renci Ad� Soyad�: " + student.firstName + " " + student.lastName);
	}

	public void updateStudent(Student student) {
		System.out.println("��renci G�ncellendi." + "\nId: " + student.id + "\n��renci Ad� Soyad�: " + student.firstName + " " + student.lastName);
	}

	public void deleteStudent(Student student) {
		System.out.println("��renci Silindi." + "\nId: " + student.id + "\n��renci Ad� Soyad�: " + student.firstName + " " + student.lastName);
	}
}
