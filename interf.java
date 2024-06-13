class adit {
    
        String name = "mukesh";
        private int age = 12;
        public int salary = 120000;
        public void patna(){
            System.out.println("Age is : " + (age*2));
        }}
    

public class interf {
    public static void main(String[] args) {
        adit a = new adit();
        System.out.println(a.name);
        a.patna();
    }
}







// abstract class adit {

//     public abstract void patna();
//     public  void dehradun(){
//         System.out.println("Dehradun is a city in Uttrakhand");
//     }

// }

// class  nsti extends adit {
//     public void patna(){}
// }

// public  class interf {

//     public static void main(String[] args) {
        
//         nsti a = new nsti();
//         a.dehradun();

// }

// }





// interface maternal {
//     void car();
//     void saving();
// }


// interface paternal {
//     void house();
//     void income();
//     void car();
// }


// class child implements  paternal, maternal{
//     public void house(){

// }
//     public void car (){

//     }
// }

// public class interf {

//     public static void main(String[] args) {
//         // maternal child;

//         c = new child()
//         c.car();
//         c.house();
//         c.saving();

// }
// }
