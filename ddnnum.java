enum student {
    name,
    age,
    gender,
    address,
}

// enum marks{
//     maths,
//     physics,
//     chemistry,
//     biology,
// }


// public void show(){
//     System.out.println("Hello World");
// }

// public String display(){
//     return "Hello World";
// }


public class ddnnum{
    public static void main(String[] args) {
        student obj[] = student.values();
        System.out.println(obj);

        // for (int i =0; i<=obj.length;i++){
        //     System.out.println(obj[i]);
        // }
        for(student s: student.values()){
            System.out.println(s);
        }
    }

}