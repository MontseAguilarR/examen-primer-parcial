package uaslp.enginering.exam.model;

public class Room {
    private RoomStatus status;
    private int number;
    private String bed;

    public Room(int number, String bed, RoomStatus status) {
      this.number=number;
      this.bed=bed;
      this.status=status;
    }



    public RoomStatus getStatus() {
        return status;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
