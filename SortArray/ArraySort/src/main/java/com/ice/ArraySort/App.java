package com.ice.ArraySort;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Random;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);
	  
	public static void main(String[] args) {
	
		int[] randomNumOdd = new int[101];
		int[] randomNum = new int[101];
		
		Random ran = new Random();
		int i = 0;
    	int q = 0;
    	int j = 0;
        BasicConfigurator.configure();

		System.out.println(" ");
		logger.info(" Even Array");
		while(i < 100) {
    		int answer = ran.nextInt(100) + 1;
			i++;

				if(answer % 2 == 0) {
					randomNum[i] = answer;
			         logger.info(j + " = " + randomNum[i] + ", ");
						j++;
		        }
				else if(answer % 2 > 0) {
					randomNumOdd[q] = answer;
			    	q++;
		        }
		    }		
		int a = 0;
		System.out.println(" ");
		logger.info(" Odd Array");
		for (int e = 0; e <= (q - 1); e++) {
	         logger.info( a + " = " + randomNumOdd[e] + ", ");
	 		a++;
		}
	}
}
