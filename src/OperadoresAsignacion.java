public class OperadoresAsignacion {
     public static void main(String args[]) {
         int a = 3, b = 2;
         int c = a + 5 - b;
         // == compara que dos valores sean iguales
         System.out.println("c = " + c);
         
         a += 1; // a = a + 1
         System.out.println("a = " + a);
         
         a += 3; // a = a + 3
         System.out.println("a = " + a);
         
         a -= 2; // a = a - 2
         System.out.println("a = " + a);

         a *= 2; // a = a * 2 
         System.out.println("a = " + a);
         
         a /= 2; // a = a / 2 
         System.out.println("a = " + a);
         
         a %= 2; // a = a % 2 
         System.out.println("a = " + a);
     }
}
