public class except {

    public static void main(String[] args) {
        int a = 76;
        int b = 0;
        int d[] = {2, 3, 4};
        // int d = a + b;
        System.out.println(d + "Hello");
        String c = null;
        try {
            System.out.println(c.length());
            System.out.println(d[5]);
            System.out.println("This is try block1 ");
            System.out.println("This is try block2 ");
            // int c = a / b;

            System.out.println("This is try block3 ");
        } catch (ArithmeticException i) {
            System.out.println("division by 0 error");
        } catch (ArrayIndexOutOfBoundsException j) {
            // System.out.println("Array error");
            System.out.println("Error " + j);
        } catch (Exception k) {
            System.out.println("This is new error");
        }
        // catch (Exception x) {
        // System.out.println("encountered  an error" + x+ "division by 0  error");
        // }
        // int d = a + b;
        // System.out.println(d);
        // System.out.println("Hello");
        // System.out.println("this part is woking fine");

    }
}
