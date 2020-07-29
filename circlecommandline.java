/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditi Yadav
 */
 class circlecommandline {
     public static void main (String [] args){
         double result,radius;
         radius=Double.parseDouble(args[0]);
         System.out.println("RADIUS="+radius);
         result= 3.14*radius*radius;
         System.out.println("AREA="+result);

         
     }
    
}
