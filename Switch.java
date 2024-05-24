class Switch {

    




    public static void main(String[] args) {
        String marks = "E";
        switch (marks) {
            case "A":
                System.out.println("fail");
                break;
            case "B":
                System.out.println("pass");
                break;
            case "C":
                System.out.println("pass third");
                break;
            case "D":
                System.out.println("pass forth");
                break;
            case "E":
                System.out.println("pass fifth");
                break;
            default:
                System.out.println("Invalid marks ");
        }
    }
} 
    

