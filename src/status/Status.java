/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;


import status.Status.Response;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */


public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
    Response print = Response.One;
    switch(print)
        {
    
        case Zero:
            System.out.println("REJECTED");
        break;
        
        case One:
            System.out.println("PENDING");
        break;
        
        case Two:
        System.out.println("PROCESSING");
        break;
        
        case Three: 
            System.out.println("APPROVED");
        break;
        }
    
    System.out.println(print);
    }
    
    enum Response {
    Zero,
    One,
    Two,
    Three
  }
    
    
}
