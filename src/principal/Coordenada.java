package principal;

public class Coordenada {
    
	private double x;
	private double y;
	
	public Coordenada( ){
		this.x=0;
		this.y=0;
	}	
	public Coordenada(double x, double y){
		this.x=x;
		this.y=y;
	}
	public Coordenada(Coordenada c){
		this.x=c.x;
		this.y=c.y;
	}
        
	public void setX(double x) {
		this.x=x;
	}
	public double getX(){
		return x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double getY(){
		return y;
	}
	
	//MÉTODO DE INSTANCIA PARA LA DISTANCIA EUCLÍDEA
	public double distancia(Coordenada c){
            return Math.sqrt(Math.pow(c.getX()-x,2)+ Math.pow(c.getY()-y,2));
	}
	
	//MÉTODO DE CLASE PARA LA DISTANCIA EUCLÍDEA
	static double distancia(Coordenada c1, Coordenada c2){
            return Math.sqrt(Math.pow(c1.getX()-c2.getX(),2)+ Math.pow(c1.getY()-c2.getY(),2));
        }
	
	//METODO DE RETORNO DE INFORMACIÓN
        @Override
        public String toString(){
            return "["+x+", "+y+"]";
        }	
}