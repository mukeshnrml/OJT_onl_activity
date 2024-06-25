// interface A{
//    void show();
// }

// // class B implements  A{
// //     public void a(){
// //         System.out.println("a");
// //     }
// // }

// public class inte {
//     public static void main(String[] args) {
//         // B obj = new B();
//         // obj.show();

//         A obj = new A(){
//             public void show(){
//                 System.out.println("interface");
//             }
//         }
        
//     }
// }


@FunctionalInterface
interface  A {
    int add (int a, int b);
}


public class inte {

    public static void main(String[] args) {
        A obj = (int a, int b) -> a+b;
        A obj1 = (int a, int b) -> a-b;

        int res = obj.add(20,40);      
        System.out.println(res);
     

    }
}

