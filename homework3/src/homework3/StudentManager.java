package homework3;

public class StudentManager extends UserManager{
	public void inspectionComplete(User user) {
		System.out.println(user.firstName + " " + user.lastName + " " + "yoklaman�z al�nm��t�r, iyi dersler");
		System.out.println("------------------------------------------");
	}
}
