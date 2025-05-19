package examples.practice.inheritance;

import java.awt.font.TextHitInfo;

class Bike{
    public int gear;
    public int speed;
    public Bike(int newGear, int newSpeed){
        this.gear = newGear;
        this.speed = newSpeed;
    }
    public void decreaseSpeed(int decrement){
        speed -= decrement;
        System.out.println("Speed decreased by :"+ decrement+" New Speed :"+ speed);
    }
    public void increaseSpeed(int increment){
        speed += increment;
        System.out.println("Speed increased by :"+ increment+" New Speed :"+ speed);
    }
    public String toString(){

        return ("Number of gears are: "+ gear+" The speed is : "+ speed);
    }
}

class MountainBike extends Bike{
    int seatHeight;
    public MountainBike(int newGear, int newSpeed, int newSeatHeight){
        super(newGear, newSpeed);
        seatHeight = newSeatHeight;
    }

    public void decreaseHeight(int newHeight){
        seatHeight -=newHeight;
        System.out.println("The decreased seat height is: "+ seatHeight);
    }
    public String toString(){
      return ("Gear: "+gear+" Speed: "+ speed+" Seat Height: "+ seatHeight);
        }
    }


public class TwoWheeler {
   public static void main(String[] args)    {
       Bike b1 = new Bike(3,60);
       Bike b2 = new MountainBike(2,45,4);
       MountainBike b3 = new MountainBike(1,35,3);


//       System.out.println(b1);
//       b1.decreaseSpeed(1);
//       b1.increaseSpeed(2);
//       b1.decreaseSpeed(3);

       System.out.println(b2);
       b2.decreaseSpeed(2);
       b2.increaseSpeed(10);
       b1.decreaseSpeed(10);
       System.out.println(b3);
       b3.decreaseHeight(1);






   }

}
