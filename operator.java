public class operator {
    public static void main(String[] args) {    

        // Arithmetic Operators  
        System.out.println("Arithmetic Operators");
        int a = 23;
        int b = 44;      
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators 
        System.out.println("Unary Operators"); 
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);

        // Assignment Operator
        System.out.println("Assignment Operator");

        int f = 7;
        System.out.println(f += 3);
        System.out.println(f -= 2);
        System.out.println(f *= 4);
        System.out.println(f /= 3);
        System.out.println(f %= 2);
        
        // Logical Operators
        System.out.println("Logical Operators");

        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Ternary operator
        System.out.println("Ternary operator");

        int aa = 20, bb = 10, cc = 30, result;

        // result holds max of three
        // numbers
        result
            = ((aa > bb) ? (aa > cc) ? aa : cc : (bb > cc) ? bb : cc);
        System.out.println("Max of three numbers = "
                           + result);
    }
}
