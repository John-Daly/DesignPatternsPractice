public interface PowerUnit {

    String poweredBy();
}

class GasEngine implements PowerUnit{

    @Override
    public String poweredBy() {
        return "Powered by Gas!";
    }
}

class Battery implements PowerUnit{

    @Override
    public String poweredBy() {
        return "Powered by Battery!";
    }
}

class Hybrid implements PowerUnit{

    @Override
    public String poweredBy() {
        return "Powered by both Battery and Gas!";
    }
}

class FootPower implements PowerUnit{

    @Override
    public String poweredBy() {
        return "Powered by Feet!";
    }
}
