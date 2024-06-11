class addi extends Sub{
    public int add(int a, int b){
        return a+b;
    }
}

class Sub extends Div{
    public int sub(int a, int b){
        return a-b;
}
}

class Div{
    public int div(int a, int b){
        return a / b;
}
}


public class app {

    public static void main(String[] args) {
        addi obj = new addi();
        int res = obj.add(2,4);
        int res1 = obj.sub(8, 3);
        int res2 = obj.div(44, 5);

        System.out.println("Add : "+res);
        System.out.println("Sub : " +res1);
        System.out.println("Div : " +res2);
    }
    
}
