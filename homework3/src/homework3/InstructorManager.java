package homework3;

public class InstructorManager extends UserManager{
	public void addHomework() {
		System.out.println("Sisteme Ödev Eklendi!");
		System.out.println("------------------------------------------");
	}
	
	public void inspectionOpen() {
		System.out.println("Yoklama Açýldý!");
		System.out.println("------------------------------------------");
	}
	
	public void inspectionClose() {
		System.out.println("Yoklama Kapandý!");
		System.out.println("------------------------------------------");
	}
}
