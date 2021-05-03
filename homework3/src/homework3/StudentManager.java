package homework3;

public class StudentManager extends UserManager{
	public void inspectionComplete(User user) {
		System.out.println(user.firstName + " " + user.lastName + " " + "yoklamanýz alýnmýþtýr, iyi dersler");
		System.out.println("------------------------------------------");
	}
}
