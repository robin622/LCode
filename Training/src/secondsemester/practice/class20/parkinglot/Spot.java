package secondsemester.practice.class20.parkinglot;

import java.util.Date;

public class Spot {
    private final ParkingLots.CarType type;
    private Car car; 
    
    public Spot(ParkingLots.CarType carType){
        this.type = carType;
    }
    
    public boolean canFit(Car car){
        if(type == car.getCarType()){
            return true;
        }
        return false;
    }
    
    public void park(Car car) {
        this.car = car;
        car.AddATicket(new Ticket(new Date().getTime()));
    }
    
    public double leave(){
        double ret = car.getTicket().calculatePayment();
        car = null;
        return ret;
    }
    
    public boolean isAvailable(){
        return car == null;
    }
    
    public Car getCar(){
        return car;
    }
}
