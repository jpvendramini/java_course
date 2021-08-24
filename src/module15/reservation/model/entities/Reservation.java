package module15.reservation.model.entities;

import module15.reservation.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if(!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check out dete must be after checkin");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates!");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check out dete must be after checkin");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return  "Room " + roomNumber +
                ", checkIn: " + sdf.format(checkIn) +
                ", checkOut: " + sdf.format(checkOut) + " "+
                duration() + " nights";
    }
}
