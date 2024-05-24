class Loop {

    public static void main(String[] args) {
        // Airthmetic Operations(+,-,*,%,/)
        // Assignment Operators(++,--,*=,%=,/=)
        // Comparision Operator(==,!=,>,<,<=,>=)
        // Logical Operators(&&,⠟⠞⠵⠟⠟⠵⠺⠵⠟⠺⠺⠟⠺⠞⠵⠞⠟⠟⠵⠵⠞⠟⠞⠵⠺⠵⠞⠺⠟⠞⠞⠺⠺⠵⠵⠞⠺⠟⠞⠺⠞⠵⠞⠵⠞⠞⠵⠟⠟⠺⠵⠞⠞⠺⠞⠺⠺⠞⠞⠺⠺⠞⠟⠺⠺⠞⠟⠺⠞⠺⠵⠵⠞⠺⠺⠟⠞⠞⠞⠞⠞⠵⠵⠺⠺⠵⠵⠺⠵⠵⠺⠵⠞⠺⠟⠵⠞⠟⠞⠺⠟⠵⠞⠺⠞⠞⠟⠵⠵⠺⠵⠞⠞⠞⠞⠟⠵⠺⠺⠵⠞⠟⠟⠺⠵⠞⠞⠵⠞⠟⠞⠞⠞⠵⠞⠵⠵⠟⠞⠺⠵⠞⠵⠺⠵⠟⠺⠞⠞⠵⠺⠺⠺⠺⠵⠺⠵⠞⠞⠟⠞⠟⠟⠵⠞⠞⠟⠞⠺⠟⠺⠞⠟⠵⠵⠵⠺⠞⠟⠺⠟⠺⠟⠟⠞⠺⠟⠵⠺⠵⠵⠞⠺⠟⠟⠟⠟⠟⠞⠺⠞⠟⠵⠵⠟⠞⠵⠺⠺⠺⠺⠵⠵⠟⠞⠞⠞⠺⠞⠟⠺⠺⠞⠵⠞⠟⠺⠟⠞⠟⠞⠞⠵⠟⠺⠺⠞⠟⠺⠺⠟⠟⠺⠺⠞⠺⠵⠟⠟⠞⠵⠟⠵⠟⠺⠟⠞⠵⠟⠵⠵⠞⠞⠟⠺⠵⠵⠞⠵⠞⠞⠟⠵⠵⠵⠞⠵⠞⠵⠺⠵⠟⠵⠵⠞⠺⠟⠺⠞⠺⠞⠵⠞⠟⠞⠺⠵⠺⠟⠞⠵⠺⠵⠺⠟⠺⠟⠞⠟⠟⠟⠞⠺⠟⠺⠟⠟⠟⠟⠺⠞⠵⠵⠺⠺⠵⠟⠞⠺⠵⠟⠞⠞⠞⠺⠺⠺⠟⠵⠟⠵⠺⠟⠺⠵⠺⠞⠞⠞⠟⠵⠺⠵⠟⠵⠞⠞⠟⠞⠵⠺⠞⠟⠞⠵⠺⠵⠵⠺⠵⠵⠟⠺⠵⠟⠵⠟⠺⠵⠞⠵⠵⠺⠵⠵⠺⠺⠟⠟⠞⠵⠟⠵⠵⠵⠵⠵⠵⠞⠵⠟⠵⠟⠞⠟⠵⠞⠞⠞⠟⠟⠟⠺⠵⠵⠵⠺⠺⠵⠵⠵⠵⠞⠟⠵⠵⠞⠞⠟⠞⠵⠵⠞⠞⠞⠞⠵⠵⠵⠺⠞⠺⠺⠟⠵⠟⠟⠟⠞⠺⠟⠺⠟⠞⠟⠟⠞⠵⠞⠵⠺⠟⠟⠞⠞⠺⠞⠞⠺⠟⠟⠵⠵⠟⠵⠟⠵⠞⠺⠵⠞⠵⠵⠞⠵⠞⠺⠵⠟⠺⠺⠵⠟⠟⠵⠵⠞⠞⠵⠞⠵⠺⠺⠺⠵⠟⠞⠞⠵⠵⠺⠟⠵⠞⠟⠟⠺⠵⠟⠟⠟⠞⠺⠟⠺⠵⠺⠟⠟⠺⠺⠟⠵⠞⠟⠟⠟⠟⠟⠵⠵⠺⠺⠵⠵⠞⠟⠟⠟⠞⠟⠞⠵⠞⠞⠟⠺⠞⠞⠞⠺⠟⠵⠞⠞⠵⠟⠵⠺⠺⠟⠺⠞⠞⠵⠞⠞⠺⠵⠟⠞⠟⠟⠟⠞⠟⠵⠺⠟⠞⠺⠺⠵⠺⠟⠺⠺⠞⠞⠺⠺⠞⠞⠵⠟⠺⠺⠺⠟⠵⠟⠺⠵⠺⠺⠟⠟⠺⠺⠟⠞⠟⠵⠺⠵⠟⠵⠺⠵⠟⠵⠞⠟⠺⠺⠵⠵⠺⠟⠞⠺⠟⠞⠵⠵⠺⠵⠵⠺⠞⠵⠺⠞⠞⠞⠺⠺⠵⠺⠞⠺⠵⠟⠺⠺⠺⠺⠟⠵⠵⠞⠞⠟⠺⠞⠺⠞⠞⠟⠵⠺⠺⠟⠺⠞⠵⠞⠟⠺⠵⠞⠵⠺⠟⠞⠟⠞⠟⠵⠟⠵⠺⠵⠺⠟⠞⠵⠞⠟⠞⠞⠞⠞⠞⠺⠺⠺⠺⠵⠵⠞⠟⠺⠺⠵⠵⠟⠞⠺⠵⠵⠺⠞⠺⠟⠺⠞⠵⠞⠞⠵⠞⠺⠵⠺⠞⠺⠞⠵⠞⠵⠟⠵⠞⠺⠵⠟⠺⠞⠺⠟⠞⠺⠵⠟⠞⠺⠟⠟⠺⠟⠵⠞⠺⠟⠞⠟⠺⠺⠟⠵⠵⠵⠵⠟⠺⠺⠟⠺⠞⠺⠟⠞⠺⠞⠞⠞⠞⠞⠺⠵⠵⠟⠟⠵⠵⠞⠟⠟⠞⠵⠟⠺⠟⠞⠟⠞⠺⠞⠞⠟⠟⠵⠞⠵⠵⠵⠺⠟⠵⠞⠵⠵⠵⠵⠵⠟⠟⠵⠵⠟⠺⠟⠞⠺⠞⠵⠟⠺⠞⠵⠟⠞⠟⠞⠟⠟⠟⠞⠟⠟⠟⠟⠵ tea =="yes")
        // if (voter == "true" ⠞⠵⠞⠞⠵⠵⠺⠵⠵⠞⠵⠺⠟⠞⠺⠞⠺⠺⠺⠞⠺⠞⠺⠟⠞⠺⠟⠞⠵⠞⠞⠺⠟⠺⠵⠺⠺⠟⠞⠵⠟⠵⠟⠵⠞⠟⠵⠵⠵⠞⠺⠵⠺⠟⠵⠟⠞⠺⠵⠵⠞⠟⠵⠟⠺⠟⠺⠟⠺⠟⠺⠺⠟⠵⠞⠟⠵⠺⠵⠵⠵⠺⠞⠵⠵⠞⠟⠵⠞⠵⠺⠟⠟⠞⠺⠺⠟⠟⠞⠟⠞⠺⠞⠞⠟⠞⠺⠞⠟⠺⠵⠺⠞⠞⠵⠵⠞⠞⠞⠵⠞⠞⠟⠵⠺⠞⠞⠵⠞⠞⠟⠵⠟⠺⠟⠵⠺⠵⠵⠵⠟⠺⠞⠵⠺⠺⠞⠺⠵⠞⠟⠞⠺⠺⠵⠵⠟⠞⠵⠞⠺⠞⠺⠵⠟⠺⠺⠞⠟⠟⠟⠵⠞⠞⠵⠵⠺⠺⠟⠟⠵⠞⠞⠵ passw == "123e") {
        //     System.err.println("eligible");
        // } else {
        //     System.err.println("Not Eligible");
        // }
        // if (marks >= 40 && marks <= 100) {
        //     System.err.println("Pass");
        // } else {
        //     System.err.println("Fail"); 
        // }
        // result = ;
        // System.err.println(result);
        // if (a != b) {
        //     System.err.println("Equal");
        // } else {
        //     System.err.println("Not Equal");
        // }
        // result = a + b + c + d;
        // result = a - b * c / d;
        // result = d % c;
        // result = 25 % 7;
        // System.err.println(result);
        // a++;
        // b--;
        // System.err.println(a);
        // System.err.println(b--);
        // System.err.println(b);
        // a++;
        // System.err.println(a++);
        // System.err.println(a);
        // ++a;
        // System.err.println(++a);
        // System.err.println(--a);
        // a += 5;
        // System.err.println(a);
        // a -= 5;
        // System.err.println(a);
        // a *= 5;
        // System.err.println(a);
        // d %= 7;
        // System.err.println(d);
        // int a = 10;
        // int b = 20;
        // System.err.println(a);
        // System.err.println(b);
        // int a, b, c;
        // a = b = c = 19;
        // System.err.println(a);
        // System.err.println(b);
        // System.err.println(c);
        // int a, b, c;
        // a = 56;
        // b = 76;
        // c = 89;
        // System.err.println(a);
        // System.err.println(b);
        // System.err.println(c);
        int marks = 37;
        System.err.println((marks >= 40) ? "pass" : "false");

        int mn = 21;
        if (mn > 44) {
            System.out.println("sum");
        } 
        else {
            System.out.println("not sum");
        }
    
        // Loop 
        for (int i=0;i<=10;i++)
        {
          System.out.println(i);
        }
    

        
    }
}