package model;

public class Patient {
	private String name;
	private String desease;
	
	private Patient previousPatient;
	private Patient nextPatient;
	
	public Patient(String name, String desease) {
		this.name = name;
		this.desease = desease;
	}

	public String getName() {
		return name;
	}

	public String getDesease() {
		return desease;
	}

	public Patient getPreviousPatient() {
		return previousPatient;
	}

	public Patient getNextPatient() {
		return nextPatient;
	}

	public void setPreviousPatient(Patient previousPatient) {
		this.previousPatient = previousPatient;
	}

	public void setNextPatient(Patient nextPatient) {
		this.nextPatient = nextPatient;
	}
}
