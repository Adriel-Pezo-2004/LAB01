package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
                //PRUEBA 1  
		Coordenada coo1 = new Coordenada(1.5,0.3);
		Coordenada coo2 = new Coordenada(7.6,2.2);
		Rectangulo r1 = new Rectangulo(coo1,coo2);
		Coordenada coo3 = new Coordenada(4,4.2);
		Coordenada coo4 = new Coordenada(9.4,-2.5);
		Rectangulo r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
                rectanguloSobre(r1, r2);	
		//PRUEBA 2
		coo1 = new Coordenada(20.5,-1.1);
		coo2 = new Coordenada(33.3,3.6);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(10.3,-5.2);
		coo4 = new Coordenada(20.5,8.6);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
                rectanguloSobre(r1, r2);
		//PRUEBA 3
		coo1 = new Coordenada(4,0);
		coo2 = new Coordenada(9,5);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(0,6);
		coo4 = new Coordenada(5,11);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
                rectanguloSobre(r1, r2);
		//CASO DE PRUEBA SI 2 RECTANGULOS SE ENCUENTRAN                       
		coo1 = new Coordenada(-2,-2);
		coo2 = new Coordenada(3,5);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(3,5);
		coo4 = new Coordenada(4,4);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
                rectanguloSobre(r1, r2);
                
		Scanner entradaporteclado = new Scanner(System.in);
		int n;
		System.out.println("********************************************");
		System.out.print("INGRESE CUANTOS RECTÁNGULOS VA A INGRESAR: ");
		n = entradaporteclado.nextInt();
		System.out.println("********************************************");
		ContainerRect container = new ContainerRect(n);
		//INGRESO DEL N. DE RECTANGULOS
		for(int i=1;i<=n;i++){
                        //COORDENADAS DEL RECTANGULO
			double x1,x2,y1,y2;
			System.out.print("INGRESE ESQUINA DEL RECTÁNGULO "+i+" :   ");
			x1 = entradaporteclado.nextDouble();
			y1 = entradaporteclado.nextDouble();
			System.out.print("INGRESE LA OTRA ESQUINA DEL RECTÁNGULOS"+i+" :   ");
			x2 = entradaporteclado.nextDouble();
			y2 = entradaporteclado.nextDouble();
			System.out.println("********************************************");
			container.addRectagulo(new Rectangulo(new Coordenada(x1,y1),new Coordenada(x2,y2)));
		}
		entradaporteclado.close();
                //MOSTRAR EL CONTENEDOR
		System.out.println(container);
	}
	//METODO PARA MOSTRAR SI ENCUENTRAN 2 RECTANGULOS CON CLASE VERIFICAR    
	public static void MostrarRectangulos(Rectangulo r1,Rectangulo r2){
		System.out.println("********************************************");
		System.out.println("RECTÁNGULO A = "+r1);
		System.out.println("RECTÁNGULO B = "+r2);
		if(Verificador.esJunto(r1, r2)==true){
			System.out.println("RECTÁNGULOS A y B SE JUNTAN");	
		}else if(Verificador.esDisjunto(r1, r2)==true){
			System.out.println("RECTÁNGULOS A Y B SON DISJUNTOS");
			
		}else if(Verificador.esSobrePos(r1, r2)==true){
			System.out.println("RECTÁNGULOS A Y B SE SOBREPONEN");
			System.out.println("AREA DE SOBREPOSICIÓN: "+
			rectanguloSobre(r1, r2).calculoArea());
		}
		
	}

	public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2){	
		double x11,x12,x21,x22,y11,y12,y21,y22,X11=0,X12=0,Y11=0,Y12=0;	
		Coordenada Coordenada1Sob, Coordenada2Sob;
		Rectangulo RecSob;
                //DEVOLVER RECTÁNGULO 
		if(r1.getCORNR1().getX()<r1.getCORNR2().getX()){
			x11=r1.getCORNR1().getX();
			x12=r1.getCORNR2().getX();
		}else{
			x11=r1.getCORNR2().getX();
			x12=r1.getCORNR1().getX();
		}
                
		if(r2.getCORNR1().getX()<r2.getCORNR2().getX()){
			x21=r2.getCORNR1().getX();
			x22=r2.getCORNR2().getX();
		}else{
			x21=r2.getCORNR2().getX();
			x22=r2.getCORNR1().getX();
		}
                
		if(r1.getCORNR1().getY()<r1.getCORNR2().getY()){
			y11=r1.getCORNR1().getY();
			y12=r1.getCORNR2().getY();
		}else{
			y11=r1.getCORNR2().getY();
			y12=r1.getCORNR1().getY();
		}
                                
		if(r2.getCORNR1().getY()<r2.getCORNR2().getY()){
			y21=r2.getCORNR1().getY();
			y22=r2.getCORNR2().getY();
		}else{
			y21=r2.getCORNR2().getY();
			y22=r2.getCORNR1().getY();
		}
		//SACANDO X
		//IF 1 JUNTOS X
		if(x21<x12 && x21>x11 && x22>x12){
			X11 = x21;
			X12 = x12;        
		//IF 2 JUNTOS X
		}else if(x22<x12 && x22>x11 && x21<x11){
			X11 = x11;
			X12 = x22;     
		//IF 3 JUNTOS X
		}else if(x11>x21 && x12<x22){
			X11 = x11;
			X12 = x12;                       
		//IF 4 JUNTOS X                
		}else if(x11<x21 && x12>x22){
			X11 = x21;
			X12 = x22;             
		//IF 5 JUNTOS X          
		}else if((x11==x21 && x12==x22)){
			X11 = x11;
			X12 = x12;
		}else if(x11==x21 && x12!=x22){
			X11 = x11;
			//IF 6 JUNTOS X
			if(x12<x22){
				X12 = x12;
			//IF 7 JUNTOS X
			}else{
				X12 = x22;
			}
		}else if(x12==x22 && x11!=x21){
			X12 = x12;
			//IF 8 JUNTOS X
			//1<2
			if(x22<x11){
				X11 = x11;
			//IF 9 JUNTOS X
			//2<1
			}else{
				X11 = x21;
			}
		}
                //SACANDO Y
		//IF 1 JUNTOS X
		if(y21<y12 && y21>y11 && y22>y12){
			Y11 = y21;
			Y12 = y12;               
		//IF 2 JUNTOS X
		}else if(y22<y12 && y22>y11 && y21<y11){
			Y11 = y11;
			Y12 = y22;           
		//IF 3 JUNTOS X  
		}else if(y11>y21 && y12<y22){
			Y11 = y11;
			Y12 = y12;                
		//IF 4 JUNTOS X   
		}else if(y11<y21 && y12>y22){
			Y11 = y21;
			Y12 = y22; 
		//IF 5 JUNTOS X
		}else if((y11==y21 && y12==y22)){
			Y11 = y11;
			Y12 = y12;
		}else if(y11==y21 && y12!=y22){
			Y11 = y11;
			//IF 6 JUNTOS X
			//1<2
			if(y12<y22){
				Y12 = y12;
			//IF 7 JUNTOS X
			//2<1
			}else{
				Y12 = y22;
			}   
		}else if(y12==y22 && y11!=y21){
			Y12 = y12;
			//IF 8 JUNTOS X
			if(y22<y11){
				Y11 = y11;
			//IF 9 JUNTOS X
			}else{
				Y11 = y21;
			}
		}
		Coordenada1Sob = new Coordenada(X11,Y11);
		Coordenada2Sob = new Coordenada(X12,Y12);
		RecSob = new Rectangulo(Coordenada1Sob,Coordenada2Sob);	
		return RecSob;
	}
}