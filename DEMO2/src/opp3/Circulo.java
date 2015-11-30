package opp3;


public class Circulo {
	
	private static int control;
	private String getRadio;

	private void setRadio(int i) {
		// TODO Auto-generated method stub
		
	Circulo cr1= new Circulo();
	cr1.setRadio(10);
	
	Circulo cr2=cr1;
	
	//Circulo cr3=cr2;
	
	Circulo cr3=new Circulo();
	cr3=cr1;
	cr3.setRadio(45);
	
	System.out.println("Radio cr1" +cr1.getRadio);
	System.out.println(" Radio cr2" +cr2.getRadio);
	System.out.println("Radio cr3"+ cr3.getRadio);
	
	int i1=12;
	int j=17;
	int z=20;
	
	j=i1;
	i=100;
	
	System.out.println("i"+i);
	System.out.println("j"+j);
	System.out.println("z"+z);
	
	Circulo.control++;
	System.out.println("Control:"+Circulo.control);
	Circulo.mostrar();
	Circulo.mostrar();
	
	System.out.println("cr1.control");
	System.out.println("cr2.control");
	System.out.println("cr3.control");

	
	
}

private static void mostrar() {
	// TODO Auto-generated method stub
	
}
}
