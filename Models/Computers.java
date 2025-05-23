package Models;

public class Computers {
  
    private String room, monitor, keyboard, mouse, internet, systemUnit;
    private int pcNumber;

    public void setRoom(String room) {
        this.room = room;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public void setSystemUnit(String systemUnit) {
        this.systemUnit = systemUnit;
    }

    public void setPcNumber(int pcNumber) {
        this.pcNumber = pcNumber;
    }

    public String getRoom() {
        return room;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getInternet() {
        return internet;
    }

    public String getSystemUnit() {
        return systemUnit;
    }

    public int getPcNumber() {
        return pcNumber;
    }
}
