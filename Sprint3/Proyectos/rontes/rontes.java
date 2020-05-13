package rontes;

public class rontes {

	String Noticias;
	String Moviles;
	String Pc;
	String Consola;
	
	public rontes (String Noticias,String Moviles, String Consola, String Pc) {
		
		this.Noticias = Noticias;
		this.Moviles = Moviles;
		this.Pc = Pc;
		this.Consola = Consola;
	}


	
	public String getNoticias() {
		return Noticias;
	}



	public void setNoticias(String noticias) {
		Noticias = noticias;
	}



	public String getMoviles() {
		return Moviles;
	}



	public void setMoviles(String moviles) {
		Moviles = moviles;
	}



	public String getPc() {
		return Pc;
	}



	public void setPc(String pc) {
		Pc = pc;
	}



	public String getConsola() {
		return Consola;
	}



	public void setConsola(String consola) {
		Consola = consola;
	}



	public void navegaNoticias(String entraNoticias) {
		noticias Noticias = new noticias(entraNoticias);
		
	}
	
	public void navegaMoviles(String entraMoviles) {
		moviles Moviles = new moviles (entraMoviles, entraMoviles);
		
	}
	
	public void navegaPc(String entraPc) {
		pc Pc = new pc(entraPc);
		
	}
	
	public void navegaConsola(String entraConsola) {
		consola Consola = new consola(entraConsola, entraConsola);
		
	}
	
	
}
