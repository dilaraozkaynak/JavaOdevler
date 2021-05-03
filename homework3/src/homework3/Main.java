package homework3;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		User user1 = new User(1,"Dilara","Özkaynak","dilaraaozk@gmail.com","123");
		
		
		userManager.add(user1);
		userManager.update(user1);
		userManager.delete(user1);
		userManager.addComment(user1);
		userManager.updateComment(user1);
		userManager.deleteComment(user1);
		
		User user2 =new User(2,"Ayşe", "Yılmaz" ,"ayseyilmaz@gmail.com", "123");
		
		User[] users = {user1,user2};
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework();
		instructorManager.inspectionOpen();
		instructorManager.inspectionClose();
		
		StudentManager studentManager = new StudentManager();
		studentManager.inspectionComplete(user1);
		
		
	}

}
