package principal;

public class Verificador {
	static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
		//VARIABLES CON LAS QUE ORDENAR COORDENADAS
		double x11,x12,x21,x22,y11,y12,y21,y22;
		//COORDENADAS X1
		if(r1.getCORNR1().getX()<r1.getCORNR2().getX()){
			x11=r1.getCORNR1().getX();
			x12=r1.getCORNR2().getX();
		}else{
			x11=r1.getCORNR2().getX();
			x12=r1.getCORNR1().getX();
		}
		//COORDENADAS X2
		if(r2.getCORNR1().getX()<r2.getCORNR2().getX()){
			x21=r2.getCORNR1().getX();
			x22=r2.getCORNR2().getX();
		}else{
			x21=r2.getCORNR2().getX();
			x22=r2.getCORNR1().getX();
		}
		//COORDENADAS Y1
		if(r1.getCORNR1().getY()<r1.getCORNR2().getY()){
			y11=r1.getCORNR1().getY();
			y12=r1.getCORNR2().getY();
		}else{
			y11=r1.getCORNR2().getY();
			y12=r1.getCORNR1().getY();
		}
		//COORDENADAS Y2
		if(r2.getCORNR1().getY()<r2.getCORNR2().getY()){
			y21=r2.getCORNR1().getY();
			y22=r2.getCORNR2().getY();
		}else{
			y21=r2.getCORNR2().getY();
			y22=r2.getCORNR1().getY();
		}

		//IF 1 JUNTOS X
                
		if(x21<x12 && x21>x11 && x22>x12){
			//IF DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//ELIF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					return false;
				}else if(y11==y22 && y21<y12){
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5
			}else if((y11==y21 && y12==y22)){
				return true;
			//ELIF 6 y 7 
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//IF 2 JUNTOS X       
		}else if(x22<x12 && x22>x11 && x21<x11){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//ELIF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2 
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4 
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5 
			}else if((y11==y21 && y12==y22)){
				return true;
				
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
				
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//IF 3 JUNTOS X
		}else if(x11>x21 && x12<x22){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//ELIF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3 
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5
			}else if((y11==y21 && y12==y22)){
				return true;
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9 
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//IF 4 JUNTOS X
		}else if(x11<x21 && x12>x22){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//ELIF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5
			}else if((y11==y21 && y12==y22)){
				return true;
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//IF 5 JUNTOS X IGUALES   
		}else if((x11==x21 && x12==x22)){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//ELIF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1 
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5		
			}else if((y11==y21 && y12==y22)){
				return true;					
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}	
		//IF 6 Y 7 JUNTOS X IZQ IGUAL
		}else if(x11==x21 && x12!=x22){
			//IF DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//IF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5
			}else if((y11==y21 && y12==y22)){
				return true;
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//IF 8 Y 9 JUNTOS X ES IGUAL
		}else if(x12==x22 && x11!=x21){
			//IF DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//IF JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//ELIF 1
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//ELIF 2
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//ELIF 3
			}else if(y11>y21 && y12<y22){
				return true;
			//ELIF 4
			}else if(y11<y21 && y12>y22){
				return true;
			//ELIF 5
			}else if((y11==y21 && y12==y22)){
				return true;
			//ELIF 6 y 7
			}else if(y11==y21 && y12!=y22){
				return true;
			//ELIF 8 y 9
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		}else{
                    return false;
		}

	}
	static boolean esDisjunto(Rectangulo r1, Rectangulo r2){
		double x11,x12,x21,x22;
		double y11,y12,y21,y22;
		//COORDENADAS X1
		if(r1.getCORNR1().getX()<r1.getCORNR2().getX()){
			x11=r1.getCORNR1().getX();
			x12=r1.getCORNR2().getX();
		}else{
			x11=r1.getCORNR2().getX();
			x12=r1.getCORNR1().getX();
		}
		//COORDENADAS X2
		if(r2.getCORNR1().getX()<r2.getCORNR2().getX()){
			x21=r2.getCORNR1().getX();
			x22=r2.getCORNR2().getX();
		}else{
			x21=r2.getCORNR2().getX();
			x22=r2.getCORNR1().getX();
		}
		//COORDENADAS Y1               
		if(r1.getCORNR1().getY()<r1.getCORNR2().getY()){
			y11=r1.getCORNR1().getY();
			y12=r1.getCORNR2().getY();
		}else{
			y11=r1.getCORNR2().getY();
			y12=r1.getCORNR1().getY();
		}
		//COORDENADAS Y2
		if(r2.getCORNR1().getY()<r2.getCORNR2().getY()){
			y21=r2.getCORNR1().getY();
			y22=r2.getCORNR2().getY();
		}else{
			y21=r2.getCORNR2().getY();
			y22=r2.getCORNR1().getY();
		}       
		if( (x12<x21 || x22<x11) || (y12<y21 || y22<y11)){
                    return true;
		}else{
                    return false;
		}
	}

	static boolean esJunto(Rectangulo r1, Rectangulo r2){
		double x11,x12,x21,x22;
		double y11,y12,y21,y22;

		//COORDENADAS X1
		if(r1.getCORNR1().getX()<r1.getCORNR2().getX()){
			x11=r1.getCORNR1().getX();
			x12=r1.getCORNR2().getX();
		}else{
			x11=r1.getCORNR2().getX();
			x12=r1.getCORNR1().getX();
		}
		//COORDENADAS X2
		if(r2.getCORNR1().getX()<r2.getCORNR2().getX()){
			x21=r2.getCORNR1().getX();
			x22=r2.getCORNR2().getX();
		}else{
			x21=r2.getCORNR2().getX();
			x22=r2.getCORNR1().getX();
		}
		//COORDENADAS Y1
		if(r1.getCORNR1().getY()<r1.getCORNR2().getY()){
			y11=r1.getCORNR1().getY();
			y12=r1.getCORNR2().getY();
		}else{
			y11=r1.getCORNR2().getY();
			y12=r1.getCORNR1().getY();
		}
		//COORDENADAS Y2
		if(r2.getCORNR1().getY()<r2.getCORNR2().getY()){
			y21=r2.getCORNR1().getY();
			y22=r2.getCORNR2().getY();
		}else{
			y21=r2.getCORNR2().getY();
			y22=r2.getCORNR1().getY();
		}
		//CASO JUNTOS X
		if(x12==x21 || x22==x11){
			if(x12==x21 && x11<x22){
				return true;
			}else if(x11==x22 && x21<x12){
				return true;
			}else{
				return false;
			}
		//CASO JUNTOS Y
		}else if(y12==y21 || y22==y11){
			if(y12==y21 && y11<y22){
				return true;
			}else if(y11==y22 && y21<y12){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
}