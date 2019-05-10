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
    
    //Multiple Queue Input
     LinkedList<String> Qlist1 = new java.util.LinkedList<>();
   LinkedList<String> Qlist2 = new java.util.LinkedList<>();
   LinkedList<String> Qlist3 = new java.util.LinkedList<>();
    ArrayList<Integer> t3 = new ArrayList<>();
    ArrayList<Integer> t1 = new ArrayList<>();
     boolean Pause= false;
    
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
 System.out.println("Round Robin method:");
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
 System.out.println("Initial processes in CPU: ");
 System.out.println(list);
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
 
 //Mulitple Queues
 System.out.println("Multiple Queues:");
 System.out.println("Processes and length: ");
 System.out.println("A5,B6,C3,D4,E3,F2");
 
 Qlist1.add("A1");
 Qlist1.add("B1");
 Qlist1.add("C1");
 Qlist1.add("F1");
 
 Qlist2.add("A2");
 Qlist2.add("A3");
 t1.add(2);
 Qlist2.add("B2");
 Qlist2.add("B3");
 t1.add(2);
 Qlist2.add("C2");
 Qlist2.add("C3");
 t1.add(2);
 Qlist2.add("D2");
 Qlist2.add("D3");
 t1.add(2);
 Qlist2.add("E2");
 Qlist2.add("E3");
 t1.add(2);
 Qlist2.add("F2");
 t1.add(1);
 
 Qlist3.add("A4");
 Qlist3.add("A5");
 t3.add(2);
 Qlist3.add("B4");
 Qlist3.add("B5");
 Qlist3.add("B6");
 t3.add(3);
 Qlist3.add("D4");
t3.add(1);

  while(Pause == false)
                {
                if(!Qlist1.isEmpty())
                {
                System.out.println(Qlist1.getFirst()+"   ");
                Qlist1.removeFirst();
                }
                else if(!Qlist2.isEmpty())
                {
                    
                    if(t1.get(0)==2)
                    {
                System.out.println(Qlist2.getFirst()+"  ");
    
                Qlist2.removeFirst();
                System.out.println(Qlist2.getFirst()+"  ");
                
                Qlist2.removeFirst();
                t1.remove(0);
                    }
                    else
                    {
                   System.out.println(Qlist2.getFirst()+"   ");
              
                Qlist2.removeFirst();
                    }
    
                }
                else if(!Qlist3.isEmpty())
                {
                    
                     
                 if(t3.get(0)>= 3)
                 {
                  System.out.println(Qlist3.getFirst()+"   ");
                  
                Qlist3.removeFirst();
                System.out.println(Qlist3.getFirst()+"  ");
                
                Qlist3.removeFirst();
                System.out.println(Qlist3.getFirst()+"  ");
                
                Qlist3.removeFirst();
                t3.set(0, (t3.get(0) -3));
                if( t3.get(0) == 0)
                {
                t3.remove(0);       
                }
                else                                                                   
                 {
                for(int i =0; i< t3.get(0);i++)
    {
    Qlist3.add(Qlist3.getFirst());
   Qlist3.removeFirst();
    }
    t3.add(t3.get(0));
    t3.remove(0);
                 }
                 }
                 else if(t3.get(0) == 2)
                 {
                   
                 System.out.println(Qlist3.getFirst()+"  ");
                
                Qlist3.removeFirst();
               System.out.println(Qlist3.getFirst()+"  ");
               
                Qlist3.removeFirst();  
                t3.remove(0);       
                 }
                 else
                 {
                  System.out.println(Qlist3.getFirst()+"   ");
                  
                Qlist3.removeFirst();
                 t3.remove(0);  
                 }
                }
                else
                {
               System.out.println("\n done");
                }
                if(Qlist1.isEmpty() && Qlist2.isEmpty() && Qlist3.isEmpty())
                {
                    Pause = true;
                }
                }
 
 
 
 
 
 
 }
    }
  
    


