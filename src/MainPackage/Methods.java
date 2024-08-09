/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author aytaj.veyisli
 */
public class Methods {
    public static void main(String[] args) {
       //foo();
       //String str = foo2();
       // System.out.println(str);
       
       boolean b = foo3();
        System.out.println(foo3());
        if (b==true) {
            System.out.println(foo2());
            
        }
    }
    
    public static void foo() {
        System.out.println("foo is called");
    }
    
    
     
    public static String foo2() {
        System.out.println("foo2 is called");
        
        return "foo2 done";
     }
    
    
    public static boolean foo3() {
        System.out.println("foo3 is called");
        
        return true;
    }
}
