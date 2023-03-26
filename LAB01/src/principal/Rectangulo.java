package principal;
    
public class Rectangulo {
    private Coordenada CORNR1;
    private Coordenada CORNR2;
        
    // CONSTRUCTOR, SETTERS Y GETTERS  
    public Rectangulo(Coordenada CORNR1, Coordenada CORNR2) {
	this.CORNR1=CORNR1;
	this.CORNR2=CORNR2;
    }
    public Rectangulo() {
	this.CORNR1 = new Coordenada();
	this.CORNR2 = new Coordenada();
    }
	
    public void setCORNR1(Coordenada coo){
    	this.CORNR1=coo;
    }
    public void setCORNR2(Coordenada coo){
	this.CORNR2=coo;
    }
    public Coordenada getCORNR1(){
    	return CORNR1;
    }
    public Coordenada getCORNR2(){
	return CORNR2;
    }
    @Override
    public String toString() {
	return "("+CORNR1+", "+CORNR2+")";
    }
	
    //METODO PARA CALCULAR EL AREA
    double calculoArea(){
        Rectangulo rect = new Rectangulo(CORNR1,CORNR2);
        double x11,x12,y11,y12;
                
	//ORDENAMOS COORDENADAS X1
        if(rect.getCORNR1().getX()<rect.getCORNR2().getX()){
            x11=rect.getCORNR1().getX();
            x12=rect.getCORNR2().getX();
        }else{
            x11=rect.getCORNR2().getX();
            x12=rect.getCORNR1().getX();
        }
                
        //ORDENAMOS COORDENADAS Y1
        if(rect.getCORNR1().getY()<rect.getCORNR2().getY()){
            y11=rect.getCORNR1().getY();
            y12=rect.getCORNR2().getY();
        }else{
            y11=rect.getCORNR2().getY();
            y12=rect.getCORNR1().getY();
        }
        return Math.abs((x12-x11)*(y12-y11));
    }
}