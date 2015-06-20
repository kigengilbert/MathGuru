/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced;

/**
 *
 * @author Whizz
 */
public class Calculation {
    
    
    public static double circleArea(double radius){
        
    return (Math.PI*Math.pow(radius,2));
    }
    
    public static double cylinderVolume(double radius, double height){
    
        return(Math.PI*Math.pow(radius, 2)*height);
    }
    public static double volumeSphere(double radius){
    
     return((4/3)*Math.PI*Math.pow(radius,3));
    }
    
    
}
