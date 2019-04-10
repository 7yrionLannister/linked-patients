package model;

public class Hospital {
	private Patient firstPatient;
	
	public Hospital() {
		
	}
	
	public void addPatient(String n, String d) {
		Patient newPatient = new Patient(n, d);
		if(firstPatient == null) {
			firstPatient = newPatient;
		}
		else {
			Patient current = firstPatient;
			while(current.getNextPatient() != null) {
				current = current.getNextPatient();
			}
			current.setNextPatient(newPatient);
			newPatient.setPreviousPatient(current);
		}
	}
	
	public Patient searchPatient(String n) {
		Patient match = null;
		if(firstPatient != null) {
			Patient current = firstPatient;
			String name = current.getName();
			while(!name.equals(n) && current.getNextPatient() != null) {
				current = current.getNextPatient();
				name = current.getName();
			}
			if(current.getName().equals(n)) {
				match = current;
			}
		}
		return match;
	}
	
	public Patient searchPatient2(String n) {
		Patient match = null;
		Patient current = firstPatient;
		while(current!=null && match==null) {
			if(current.getName().equals(n)) {
				match = current;
			}
			current = current.getNextPatient();
		}
		return match;
	}
	
	public void deletePatient(String n) {
		Patient match = searchPatient2(n);
		
		if(match != null) {
			Patient next = match.getNextPatient();
			Patient previous = match.getPreviousPatient();
			
			if(next != null) {
				next.setPreviousPatient(previous);
			}
			
			if(previous != null) {
				previous.setNextPatient(next);
			} else {
				firstPatient = next;
			}
			/*ESTO NO SE HACE
			if(previous == null) {
				firstPatient = firstPatient.getNextPatient();
				if(firstPatient != null) {
					firstPatient.setPreviousPatient(null);
				}
			}
			else if(next == null) {
				previous.setNextPatient(null);
			}
			else {
				previous.setNextPatient(next);
				next.setPreviousPatient(previous);
				match.setNextPatient(null);
				match.setPreviousPatient(null);
			}*/
		}
	}
	
	public void invertirLista() {
		
	}
	
	public String patiensInString() {
		String list = "[";
		Patient current = firstPatient;
		while(current != null) {
			list += "(" + current.getName() + "), ";
			current = current.getNextPatient();
		}
		list += "]";
		return list;
	}
}
