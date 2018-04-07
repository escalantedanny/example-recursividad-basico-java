/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;


public class Recursividad {


    public static void main(String[] args) {
        
        //le  introducimos a realizar la suma recursiva
        int n = 9;
        //asignamos el valor de la suma recursiva a resultadoSuma
        int resultadoSuma = recursividadNumero(n);
        
        //asignamos el valor del factorial de un numero a factorialNumero
        int factorialNumero = factorialNumero(n);
        
        //montramos por consola los resultados
        System.out.println("la suma recursiva de "+n+" es: "+resultadoSuma);
        System.out.println("el factorial de "+n+" es: "+factorialNumero);
        
        
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
    
    //--------------------------------------------------------------------------
    // ejemplo de cursividad en este caso la suma recursiva
    //--------------------------------------------------------------------------    
    
    //realizamos una suma recursiva para trabajar la recursividad en java
    public static int recursividadNumero(int numero){
       
        //inicializamos el resultado
        int res =0;
        
        //(caso base)  o condicion para que rompa la recursividad
        if(numero == 1){
            //para romper la recursividad cuando llegue a 1
            return 1;
        }else{
            //resultado de la recursividad del numero enviado por parametros
            res = numero + recursividadNumero(numero-1);
        }
        
        //devolucion del resultado
        return res;
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
    
    //--------------------------------------------------------------------------
    // otro ejempo re cursividad en este caso la factorial de un numero
    //--------------------------------------------------------------------------
        public static int factorialNumero(int numero){
       
        //inicializamos el resultado
        int res =0;
        
        //(caso base)  o condicion para que rompa la recursividad
        if(numero == 1){
            //para romper la recursividad cuando llegue a 1
            return 1;
        }else{
            //resultado de la recursividad del numero enviado por parametros
            res = numero * factorialNumero(numero-1);
        }
        
        //devolucion del resultado
        return res;
    }
    //--------------------------------------------------------------------------
    // otro ejempo re cursividad en este caso la factorial de un numero
    //--------------------------------------------------------------------------
        
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
}
