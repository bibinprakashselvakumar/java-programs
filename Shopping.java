import java.util.Scanner;

class Person {
    String name,address;
    double phnum;
    Scanner input=new Scanner(System.in);
    public Person(String name)
    {
        this.name=name;
    }
    public void setDetails()
    {
        System.out.println("Enter address:");
        address=input.nextLine();
        System.out.println("Enter phone number:");
        phnum=input.nextDouble();
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public double getPhnum()
    {
        return phnum;
    }

}

class Customer extends Person{
    int custnum;
    //boolean interest;
    Scanner input=new Scanner(System.in);
    public Customer(int custnum,String s)
    {   super(s);
        this.custnum=custnum;
    }
    public int getCustnum(){
        return custnum;
    }
    public boolean interest()
    {
        System.out.println("Enter your interest:\n1.YES\n2.NO");
        int ch=input.nextInt();
        if(ch==1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

class PreferedCustomer extends Customer{
    int amount,discount;
    Scanner input=new Scanner(System.in);
    public PreferedCustomer(int x,String s)
    {
            super(x,s);
    }
    public void setAmount()
    {
        System.out.println("Enter the price of your purchases:");
        amount=input.nextInt();
    }
    public int getAmount()
    {
        return amount;
    }
    public int getDiscount()
    {
        if(amount>=500&&amount<1000)
        {
            return 5;
        }
        else if(amount>=1000&&amount<1500)
        {
            return 6;
        }
        else if(amount>=1500)
        {
            return 7;
        }
        else
        {
            return 8;
        }
    }
    public String toString()
    {
        return String.format("Name: %s\t\nAddress: %s\t\nPhone Number: %.0f\t\nCustomer Number: %d\t\nDiscount percentage: %d", getName() ,getAddress(), getPhnum(), getCustnum(), getDiscount());
    }

}

public class Shopping{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        PreferedCustomer c=new PreferedCustomer(1,"BIBIN");
        c.setDetails();
        if(c.interest()== true){
            System.out.println("Your name is considered into mailing list");
        }
        else{
            System.out.println("Your name will not be considered into mailing list");
        }
        c.setAmount();
        System.out.println(c.toString());
    }
}
