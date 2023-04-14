package Endpoints;

public class endpoints {

	public enum loginendpoints{
		login("user/v1/auth");
		
		private String endPoints;
		
	loginendpoints(String endPoints){
		this.endPoints = endPoints;
	}
	}
}
