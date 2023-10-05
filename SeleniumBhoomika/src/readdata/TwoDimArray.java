package readdata;

public class TwoDimArray {

	public static void main(String[] args) {
		String [] ref1 = {"Preethika","Anitha","Ashwani"};
		String [] ref2 = {"Jyothi","Abhyanka","Jabeen"};
		String [] ref3 = {"Subirtha","Anusha","Sri Marg"};
		String [] ref4 = {"Akem","Falguni","Heena"};
		String [] ref5 = {"Anikaran","Sowmya","Michael","Mohammad"};
		
		String[][] ref = {ref1,ref2,ref3,ref4,ref5};
		
		System.out.println(ref[4][1]);  
		
		String [][] reff = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
		
		System.out.println(reff[0][2]);
		
		
		}
}
