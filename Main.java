import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int userSum=0;
    int userNum=0; 

    while (userNum != -1)
    {
      userNum = sc.nextInt();
      if (userNum != -1)
      {
        userSum += userNum;
      }
    }
    System.out.println(userSum);
  }
}
