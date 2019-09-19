package secondsemester.practice.class20.parkinglot;

public class Car {
    private Ticket ticket;
    private ParkingLots.CarType type;
    
    public Car(ParkingLots.CarType type) {
        this.type = type;
    }
    
    public void AddATicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public Ticket getTicket(){
        return ticket;
    }
    
    public ParkingLots.CarType getCarType(){
        return type;
    }
}
