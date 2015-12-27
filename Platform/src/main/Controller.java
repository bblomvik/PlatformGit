package main;

public class Controller {
	
	
	public Controller(){	
		
		
	}
	
	/**
	 * Send startCommand to Serial Device, might be an Arduino or something like that.
	 */
	public void startMotors(){		
		System.out.println("startMotors called, sendCommand to ARDUINO");		
	}
	
	/**
	 * Send stopCommand to Serial Device
	 */
	public void stopMotors(){
		System.out.println("StopMotor(), send STOP to Arduino");		
	}

}
