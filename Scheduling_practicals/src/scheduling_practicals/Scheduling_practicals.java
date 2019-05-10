/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduling_practicals;

/**
 *
 * @author Hein
 */

import java.util.Arrays;

public class Scheduling_practicals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //First come first serve
        String[] arrFCFS;
        arrFCFS = new String[6];
        
        arrFCFS[0] = "A1";
        arrFCFS[1]="A2";
        arrFCFS[2]= "B1";
        arrFCFS[3] = "B2";
        arrFCFS[4] = "C1";
        arrFCFS[5] = "C2";
        
        for(int i=0; i < arrFCFS.length; i++)
        {
        System.out.println(arrFCFS[i]);
        }
        // FCFS end
        
        //Shortest Job First
        
        String[] arrSjob;
        arrSjob = new String[6];
        int[] arrSorted = new int[6];
        arrSjob[0]= "A10";
        arrSjob[1] = "B5";
        arrSjob[2] = "C3";
        arrSjob[3] = "D2";
        arrSjob[4] = "E7";
        arrSjob[5] = "F9";
        
        System.out.println("Initial processes in CPU:");
        for(int i=0; i < arrSjob.length; i++)
        {
        System.out.println(arrSjob[i]);
        }
        
        // retrieve process lengths
        for(int k = 0; k < arrSjob.length;k++)
        {
        arrSorted[k] = Integer.parseInt(arrSjob[k].substring(1, arrSjob[k].length()));
        }
        
        //sort process lengths
        int n = arrSorted.length;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (arrSorted[j - 1] > arrSorted[j]) {
                temp = arrSorted[j - 1];
                arrSorted[j - 1] = arrSorted[j];
                arrSorted[j] = temp;
            }

        }
    }
      
    String temp1;
    for(int i = 0; i < n; i++)
    {
        for(int k=0; k <n; k++)
        {
        if(Integer.parseInt(arrSjob[i].substring(1, arrSjob[i].length())) == arrSorted[k] )
        {
        temp1 = arrSjob[k];
        arrSjob[k] =arrSjob[i];
        arrSjob[i] = temp1;
        
        }
        
        }
    }
  System.out.println("Execution order with shortest job first");
 System.out.println(Arrays.toString(arrSjob));
    }
}

