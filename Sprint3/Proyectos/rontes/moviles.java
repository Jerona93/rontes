package rontes;

public class moviles {

	String iOs;
	String Android;
	
	
	public moviles (String iOs, String Android) {
		
		this.iOs = iOs;
		this.Android = Android;
	}


	public String getiOs() {
		return iOs;
	}


	public void setiOs(String iOs) {
		this.iOs = iOs;
	}


	public String getAndroid() {
		return Android;
	}


	public void setAndroid(String android) {
		Android = android;
	}


	public void eligeiOs(String eligeiOs) {
		iOs iOs = new iOs(eligeiOs);
		
	}
	
	public void eligeAndroid(String eligeAndroid) {
		Android Android = new Android(eligeAndroid);
		
	}

}
