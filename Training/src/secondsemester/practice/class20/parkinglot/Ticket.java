package secondsemester.practice.class20.parkinglot;

import java.util.Date;

public class Ticket {
    
    private long entryTime;
    private double unitPrice;
    
    public Ticket(long entryTime){
        unitPrice = 12.5;
        this.entryTime = entryTime;
    }
    
    public double calculatePayment(){
        int hours = (int)((new Date().getTime() - entryTime) / 1000);
        return hours * unitPrice;
    }
}
