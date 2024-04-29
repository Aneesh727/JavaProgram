package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10,1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brakes is: " + mountainBike.speed);
        mountainBike.speedUp(2);
        System.out.println("Bike speed after speeding up is: " + mountainBike.speed);
    }
}
