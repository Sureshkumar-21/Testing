package org.phone;

public class InternalStorage {

	private void processorName() {
	System.out.println("Mediatech");
	}
	
	private void ramSize() {
		System.out.println("6gb");

	}
	
	public static void main(String[] args) {
		InternalStorage n=new InternalStorage ();
		n.ramSize();
		ExternalStorage m=new ExternalStorage ();
		m.size();
		
	}
}
