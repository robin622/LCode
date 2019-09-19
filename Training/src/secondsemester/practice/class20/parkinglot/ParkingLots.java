package secondsemester.practice.class20.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLots {
    
    public enum CarType{
        COMPACT,
        ECONOMY,
        MEDIUM,
        SUV,
        TRUCK
    }
       
    private List<Level> level_list; //levels
    
    public ParkingLots() {
        level_list = new ArrayList<>();
        init(level_list);
    }
    
    private void init(List<Level> level_list) {
        //add three levels
        level_list.add(new Level());
        level_list.add(new Level());
        level_list.add(new Level());
    }

    public boolean park(Car car) {
        for(Level level : level_list) {
            return level.park(car);
        }
        return false;
    }
    
    public double leave(Car car){
        for(Level level : level_list) {
            return level.leave(car);
        }
        return -1.0;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Car c1 = new Car(ParkingLots.CarType.COMPACT);
        ParkingLots pl = new ParkingLots();
        System.out.println("can park ?" + pl.park(c1));
        Thread.sleep(2000);
        System.out.println("money paid is: " + pl.leave(c1));
    }

}
