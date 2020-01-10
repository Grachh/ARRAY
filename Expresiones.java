
public class Expresiones {

	
	

	
	// METODO O PROGRAMA PRINCIPAL
	public static void main(String[] args) {

		//  DECLARACIONES DE CONSTANTES  ------------------------------------ 

	
		int x1 = LibRdm.intRdm(2, 16);
		double x2 = LibRdm.doubleRdm(2, 16);
		boolean x3 = LibRdm.boolRdm();
		char x4 = LibRdm.charRdm();
		String x5 = LibRdm.strRdm(16);
		Fecha x6 = LibRdm.fRdm();
		Horario x7 = LibRdm.hRdm();
		Reloj x8 = LibRdm.rRdm();
		


		int[] col1 = LibRdm.colIntRdm(23);
		double[] col2 = LibRdm.colDoubleRdm(12);
		boolean[] col3 = LibRdm.colBooleanRdm(23);
		char[] col4 = LibRdm.colCharRdm(12);
		String[] col5 = LibRdm.colStrRdm(23);
		Fecha[] col6 = LibRdm.colFRdm(23);
		Horario[] col7 = LibRdm.colHRdm(23);
		Reloj[] col8 = LibRdm.colRRdm(23);
		
		
 	    System.out.println (x1);
 	    System.out.println (x2);
 	    System.out.println (x3);
 	    System.out.println (x4);
 	    System.out.println (x5);
 	    System.out.println (x6);
 	    System.out.println (x7);
 	    System.out.println (x8);
 	    
	    System.out.println (LibRdm.toString(col1));
	    System.out.println (LibRdm.toString(col2));
	    System.out.println (LibRdm.toString(col3));
	    System.out.println (LibRdm.toString(col4));
	    System.out.println (LibRdm.toString(col5));
	    System.out.println (LibRdm.toString(col6));
	    System.out.println (LibRdm.toString(col7));
	    System.out.println (LibRdm.toString(col8));
	}
}
