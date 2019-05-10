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
        System.out.println(arrFCFS[i].toString());
        }
        // FCFS end
        
        //Shortest Job First
        String[] arrSjob;
        arrSjob = new String[6];
        arrSjob[0]= "A10";
        arrSjob[1] = "B5";
        arrSjob[2] = "C3";
        arrSjob[3] = "D2";
        arrSjob[4] = "E7";
        arrSjob[5] = "F9";
        
        System.out.println("Initial processes in CPU:");
        for(int i=0; i < arrFCFS.length; i++)
        {
        System.out.println(arrSjob[i].toString());
        }
        
        
    }
    
}
