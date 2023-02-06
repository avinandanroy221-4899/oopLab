/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

class box{
    double height  ;
    double width;
    double depth;
    
 
    double volume(){
        return height*width*depth;
    } 
    
    
    double setdem(double h , double w , double d){
        height = h ;
        width = w;
        depth = d;
    }
    

}

public class Mavenproject1{
    public static void main(){
        box mybox1 = new box();
        box mybox2 = new box();
        
        mybox1.setdem(10,10,10);
        mybox2.setdem(20,20,20);
        
        double  vol = mybox1.volume();
        
        System.out.println(vol);
        
       
        
        double vole = mybox2.volume();
                
        System.out.println(vole);
        
    }

}