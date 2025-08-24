import java.util.Scanner;
class q6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income>7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Not eligible for scholarship");
        }
    }
}