package tsppso;

import java.io.FileInputStream;
import java.util.Scanner;



public class Run {
	 public static void main(String[] args) throws Exception {       
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Fill CITY_COUNT UNDER (CITY_COUNT is x)");
		 System.out.print("Number City: ");
		 int x = scan.nextInt();
		 TSP tsp = new TSP(x);
		 tsp.TARGET = 1250;	// number for algorithm to find
		 try {
      		String url = "C:\\Users\\Admin\\Desktop\\tspcode.txt";
             FileInputStream fileinputstream =  new FileInputStream(url);
             Scanner scan2 = new Scanner(fileinputstream);	         
	         int i = 0; 
     while (scan2.hasNextLine()) {
     	 String line = scan2.nextLine();
         String[] line_array = line.split(" ");
         tsp.XLocations[i] = Integer.parseInt(line_array[0]);
         tsp.YLocations[i] = Integer.parseInt(line_array[1]);	          
                       i++;
     }
      	}catch (Exception e)
         {
             System.out.println("Error : "+e.getMessage() +" !");
         }

	        tsp.initializeMap();
	        tsp.PSO();
	        tsp.printBestSolution();
	        
}
}
