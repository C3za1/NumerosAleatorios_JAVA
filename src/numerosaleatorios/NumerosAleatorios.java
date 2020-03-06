
package numerosaleatorios;


public class NumerosAleatorios 
{

    
    public static void main(String[] args) 
    {
       //declaracion de variables
        int n1;   
     
        Numero n2= new Numero  (); 
    
        n1=n2.Crear_Numero();
        for (int i = 1; i <= 5; i++) //el <=5 son el numero de veces que te imprimira hnumeros aleatorios
        {
            n1=n2.Crear_Numero();
         
          System.out.println("El numero generado es "+n1);      
        }   
    }
    
}
