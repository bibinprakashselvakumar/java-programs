import java.util.Scanner;

public class Car {
    private int yearmodel , speed;
    private String make;

    Car(int yearmodel, String make) {
        this.yearmodel = yearmodel;
        this.make = make;
        speed = 0;
    }

    public  int getspeed() {
        return speed;
    }

    public String getmake() {
        return make;
    }

    public int getyearmodel() {
        return yearmodel;
    }

    public int accelerate() {
        speed = speed+5;
        return speed;
    }

    public int brake() {
        speed = speed -5;
        return speed;
    }
public static  void main(String[] args){
        Car c = new Car(2018,"BMW");
        Scanner inp = new Scanner(System.in);
        int s,ym,a,choice;
        boolean option = true;
        String m;
        ym=c.getyearmodel();
        m=c.getmake();
        System.out.println("Car info:");
    System.out.println("Make :" + m);
    System.out.println("Year model: " + ym);
    while(option){
        System.out.println("Enter your choice\n1.Accelerate\n2.Brake\n3.Exit");
        choice = inp.nextInt();
        switch(choice){
            case 1:
                c.accelerate();
                System.out.println("Speed increase " + c.getspeed() + " Km/h");
                break;
            case 2:
                if(c.getspeed() == 0){
                    System.out.println("Car is already stopped");
                }
                else {
                    c.brake();
                    if (c.getspeed() == 0) {
                        System.out.println("Car stopped");
                    } else {
                        System.out.println("Speed decrease " + c.getspeed() + " Km/h");
                    }
                }
                break;
            case 3:
                option=false;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }


}


}
