/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Util.MathUtil;
import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Calculator {
    public static void main(String[] args) {
        
        calculate();        
//        double r = topla(3.5, 2.5);
//        System.out.println("r="+r);+++
//        
//        double m = cixma(40,10);
//        System.out.println("m="+m);
//        
//        double v = vurma(10,2);
//        System.out.println("v="+v);
//        
//        double b = bolme(25,5);
//        System.out.println("b="+b);
        
        
        
    }
    
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("a-ni daxil edin:");
        double a = sc.nextDouble();
        
        System.out.println("b-ni daxil edin: ");
        double b = sc.nextDouble();
        
        System.out.println("Emeliyyat secin: (+)1  (-)2  (*)3  (/)4");
        int operation = sc.nextInt();
        
        double result = 0;
        
        if (operation==1) {
            result = MathUtil.topla(a,b);
        }
        else if(operation==2){
            result = MathUtil.cixma(a,b);
        }
        else if(operation==3){
            result = MathUtil.vurma(a,b);
        }
        else if(operation==4){
            result = MathUtil.bolme(a,b);
        }
        else{
            System.out.println("Operation is invalid");
        }
        System.out.println("result = "+result);
    }
    
    
}
