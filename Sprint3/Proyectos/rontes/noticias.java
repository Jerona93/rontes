package rontes;

public class noticias {
	
		String Videojuegos;
		
		public noticias (String videojuegos) {
			
			this.Videojuegos = videojuegos;
		}

		public String getVideojuegos() {
			return Videojuegos;
		}

		public void setVideojuegos(String videojuegos) {
			Videojuegos = videojuegos;
		}
		
		public void buscaVideojuegos(String buscaVideojuegos) {
			videojuegos videojuegos = new videojuegos(buscaVideojuegos);
			
		}
}