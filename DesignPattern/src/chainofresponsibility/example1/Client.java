package chainofresponsibility.example1;

public class Client {
	
	public static void main(String[] args){
		ProjectManager projectManager = new ProjectManager();
		DepManager depManager = new DepManager();
		GeneralManager generalManager = new GeneralManager();
		
		projectManager.setSuccessor(depManager);
		depManager.setSuccessor(generalManager);
		
		String str = projectManager.handlerRequest(500);
		
		System.out.println(str);
	}
}
