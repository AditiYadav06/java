/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditi Yadav
 */
public class maximum_from_array{
public static void main(String args[]){
        int temp;
        int a [] = new int [args.length];
        System.out.println("Element entered as command line arguments are:");
        for(int i=0;i<args.length;i++){
               a[i]=Integer.parseInt(args [i]);
               System.out.println(+a[i]);
        }
        for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++)
                {
                        if(a[i] < a[j]){
                                temp =a[i];
                                a[i]=a[j];
                                a[j]=temp;                        
                        }
                }
        }
        System.out.println("Maximum number is");
        {
                System.out.println(a[0]);
        }
       
}
}
