package itba;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int n = 109; // Size of matrix (nxn)
		int x = 3; // Amount of 1's
		
		//Create the matrix
		Matrix m = new GRCARMatrix(n,x);
		m.print(); /* Display the matrix */
		
		//Start timer
		long start = System.currentTimeMillis();
		
		//Get the QR step for eigenvalues accurate to 10^-6
		Matrix res = Operations.calculateQR2iter(m);
		
		//Print computational time
		System.out.println("Time: " + ((double)(System.currentTimeMillis()-start))/1000);

		//Calculate the eigenvalues of the resultant matrix
		Set<Complex> l = Operations.getValues(res);
		
		//Print eigenvalues
		for(Complex c :l){
			System.out.println(c);
		}
		
		//Save them to output.txt
		Output.complexCollection(l);
	}
	
	

}
