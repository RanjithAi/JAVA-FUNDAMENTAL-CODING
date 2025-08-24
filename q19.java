import java.util.Scanner;
class q19{
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int[] marks = new int[size];
      for (int i =0;i<size;i++)
      {
        marks[i]=scan.nextInt();
      }
      int middleindex = size/2;
      int middlenumber = marks[middleindex];

      System.out.println(middlenumber);
    }
}