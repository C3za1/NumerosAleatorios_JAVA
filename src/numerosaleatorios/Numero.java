
package numerosaleatorios;

import java.util.Random;


public class Numero 
{
    Random n1=new Random();
    
    
    
    public int Crear_Numero()
    {
        int numero=1+(n1.nextInt(10)+1);//el 20 controla el rango de nunmeros de los que apracera
        return numero;   
    }
}
