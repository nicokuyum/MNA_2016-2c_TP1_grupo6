package itba;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;


public class Output {
	
	public static void complexCollection(Collection<Complex> list){
		try(PrintWriter out = new PrintWriter("output.txt")) {
			for(Complex c: list){
				out.write(Operations.truncateDouble(c.r,5) + "\t" + Operations.truncateDouble(c.i,5) + "\n");
			}
			out.close();
		}catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public static void times(int n, long milis, int iters){
		if(n == 5){
			try{
				PrintWriter pw = new PrintWriter("times2.txt");
				pw.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("times.txt", true)))) {
			out.write(n + "\t" + milis + "\t" + iters +  "\n");
			out.close();
		}catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
