package poo;

public class Module {
	private String name;
	private int creditPoints;
	private String assessment;
	
	public Module(String name, int creditPoints, String assessment) {
		this.name = name;
		this.creditPoints = creditPoints;
		this.assessment = assessment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

	public String getAssessment() {
		return assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	
	
	
	

}
