/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

import static java.util.stream.DoubleStream.generate;

/**
 *
 * @author Ana Godínez
 */
public class ImplArrayManipulator {
    
    
    int num;
    int cantRep ;
    int set[][];
    int i;
    
    public void Generator(int num, int cantRep, int set){
        //if(num = 1){
        System.out.println(num);
    
        //else{
          for(i = 0; i<num -1 ; i += 1 )
              System.out.println(num);
            
          }
        
    }
    
       //procedure generate(n : integer, A : array of any):
    //if n = 1 then
          //output(A)
    //else
       // for i := 0; i < n - 1; i += 1 do
            //generate(n - 1, A)
            //if n is even then
            //    swap(A[i], A[n-1])
           // else
              //  swap(A[0], A[n-1])
         //   end if
       // end for
     //   generate(n - 1, A)
   // end if
    
    
    
