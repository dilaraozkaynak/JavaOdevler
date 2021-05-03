package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " " + "isimli kullan�c� eklendi.");
		
		System.out.println("------------------------------------------");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " " + user.lastName + " " + "isimli kullan�c� g�ncellendi.");
		
		System.out.println("------------------------------------------");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName + " " + user.lastName + " " + "isimli kullan�c� silindi.");
		System.out.println("------------------------------------------");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void addComment(User user) {
		System.out.println(user.firstName + " "  + user.lastName + " yorum ekledi.");
		System.out.println("------------------------------------------");
	}
	
	public void updateComment(User user) {
		System.out.println(user.firstName + " "  + user.lastName + " yorumunu g�ncelledi.");
		System.out.println("------------------------------------------");
	}
	
	public void deleteComment(User user) {
		System.out.println(user.firstName + " " + user.lastName + " yorumunu sildi.");
		System.out.println("------------------------------------------");
	}
}
