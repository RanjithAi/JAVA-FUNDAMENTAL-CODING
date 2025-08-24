import java.util.Scanner;
class q9{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean rain = obj.nextBoolean();
        String result = rain?"Take an umbrella":"Enjoy the sunlight";
        System.out.println(result); 

    }
}