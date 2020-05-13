package rontes;

public class consola {
	String Ps5;
	String Switch;
	
	
	public consola (String Ps5, String Switch) {
		
		this.Ps5 = Ps5;
		this.Switch = Switch;
	}


	public String getPs5() {
		return Ps5;
	}


	public void setPs5(String ps5) {
		Ps5 = ps5;
	}


	public String getSwitch() {
		return Switch;
	}


	public void setSwitch(String switch1) {
		Switch = switch1;
	}
	
	public void eligePs5(String eligePs5) {
		ps5 Ps5 = new ps5(eligePs5);
		
	}
	
	public void eligeSwitch(String eligeSwitch) {
		switch1 Switch = new switch1(eligeSwitch);
		
	}

}
