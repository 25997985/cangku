public class 车 {
    public static void main(String args[])
    {
Vehicles A=new Vehicles("luo","red");
A.showInfo();
A.run();
Car B=new Car("luo","red",4);
B.showCar();
B.run();
Truck C=new Truck("luo","red",1000);
C.showTruck();
C.run();

    }
}


class Vehicles
{
    protected String brand;
    protected String color;
    public void run ()
    {
        System.out.println("我已经开动了");
    }
    public  void showInfo()
    {
        System.out.println("车的颜色是"+color+"  "+"车的商标是"+brand);
    }
    public Vehicles(String brand,String color)
    {
        this.brand=brand;
        this.color=color;
    }

}

class Car extends Vehicles
{
    private int seats;
    public void showCar()
    {
        System.out.println(brand+"  "+color+"  "+seats);
    }

    public Car(String brand, String color,int seats) {
        super(brand, color);
        this.seats=seats;
    }
}

class Truck extends Vehicles
{
    private  int load ;
    public void showTruck()
    {
        System.out.println(brand+"  "+color+"  "+load);
    }
    public Truck(String brand,String color,int load)
    {
        super(brand,color);
        this.load=load;
    }
}