package secondsemester.practice.class20.parkinglot;

import java.util.Random;

public class Level {
    
    private static final int ROWS = 10;
    private static final int COLUMNS = 20;
    
    private final Spot[][] spots;
    
    public Level(){
        spots = new Spot[ROWS][COLUMNS];
        //add all spots
        init(spots);
    }
    
    private void init(Spot[][] spots) {
        for(int row = 0; row < ROWS; row++) {
            for(int column = 0; column < COLUMNS; column++) {
                spots[row][column] = new Spot(ParkingLots.CarType.values()[new Random().nextInt(5)]);
            }
        }
    }

    boolean park(Car car) {
        for(int row = 0; row < ROWS; row++) {
            for(int column = 0; column < COLUMNS; column++) {
                if(spots[row][column].isAvailable() && spots[row][column].canFit(car)){
                    spots[row][column].park(car);
                    return true;
                }
            }
        }
        return false;
    }
    
    double leave(Car car) {
        for(int row = 0; row < ROWS; row++) {
            for(int column = 0; column < COLUMNS; column++) {
                if(spots[row][column].getCar() == car){
                    return spots[row][column].leave();
                }
            }
        }
        return -1.0;
    }
    
}
