public class Ejecutar {

    public static void main(String[] args) {
       

       int[] a = {5, 16, 8, 9, 10, 25, 19, 3, 6, 22, 2 };

       for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]);
       }

       int suma = 0;
         for (int i = 0; i < a.length; i++) {
            suma += a[i];
         }
         System.out.println("La suma de los elementos del arreglo a: " + suma);


         int[] b = new int[11];

         int min = 1;
         int max = 100;

         for (int i = 0; i < a.length; i++) {
             b[i] = (int) (Math.random() * (max - min + 1) + min);
         }   
    }             

}