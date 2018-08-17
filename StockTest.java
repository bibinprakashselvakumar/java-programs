import java.util.Scanner;


public class StockTest{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        double p;
        String n;
        Stock []A=new Stock[5];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter price");
            p=input.nextDouble();
            input.nextLine();
            System.out.println("Enter name");
            n=input.nextLine();
            A[i]=new Stock(p,n);

        }
        for(int i=0;i<2;i++)
        {
            System.out.println(A[i].toString());
        }
    }
}