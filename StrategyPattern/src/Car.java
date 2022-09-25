public class Car {

    private String name;
    public PowerUnit powerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PowerUnit getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerUnit powerType) {
        this.powerType = powerType;
    }

    public String powerUnit() {
        return powerType.poweredBy();
    }
}
