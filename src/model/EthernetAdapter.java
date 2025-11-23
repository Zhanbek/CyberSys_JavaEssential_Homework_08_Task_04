package model;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, String mac, int speed) {
        super(manufacturer, price, serialNumber);
        this.mac = mac;
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: manufacturer = " + manufacturer + ", price=" + price + ", serialNumber = " + serialNumber + " mac = " + mac + ", speed = " + speed ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter ethernetAdapter)) return false;
        if (!super.equals(o)) return false;
        return speed == ethernetAdapter.speed && Objects.equals(mac, ethernetAdapter.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
