public class Car {
    double carCost;
    double milesDriven = 15000;
    double gasPrice;
    double fuelEfficiency;
    double resaleValue;
    double costToOwn;

    public void setCarCost(double carCost) {
        this.carCost = carCost;
    }

    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setResaleValue(double resaleValue) {
        this.resaleValue = resaleValue;
    }

    public double getCostToOwn() {
        costToOwn = carCost + ((milesDriven / fuelEfficiency) * 5);
        return costToOwn;
    }

    public double costAfterResale() {
        return costToOwn - resaleValue;
    }
}
