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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Scheduling_practicals {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Integer> t2 = new ArrayList<>();
   LinkedList<String> list = new java.util.LinkedList<>();
    boolean check = false;
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
 
  //Round Robin
 
  //initial input
 list.add("A1");
 list.add("A2");
 list.add("A3");
 list.add("A4");
 list.add("A5");
 list.add("A6");
 list.add("B1");
 list.add("B2");
 list.add("B3");
 list.add("B4");
 list.add("B5");
list.add("C1");
list.add("C2");
list.add("C3");
 t2.add(6);
 t2.add(5);
 t2.add(3);
 
 while(t2.size()!= 0)
 {
        System.out.println(list.getFirst()+" "); //print first value
       
      list.removeFirst();  //removes first value
     t2.set(0, t2.get(0) -1);                        //set the new length
      if(t2.get(0) == 0)                        //removal condition
      {
      t2.remove(0); 
      check = true;
      }
      else                            // if not the last element remove another
      {
      System.out.println(list.getFirst()+" ");
      list.removeFirst();
      t2.set(0, t2.get(0) -1);  
      if(t2.get(0) == 0)
      {
      t2.remove(0);
      check = true;
      }
      }
      if(check == false)//move to back
      {
       for(int i =0; i< t2.get(0);i++)
    {
    list.add(list.getFirst());
    list.removeFirst();
    }
    t2.add(t2.get(0));
    t2.remove(0);
      }
 } 
 }
 
 
    }
  
    


