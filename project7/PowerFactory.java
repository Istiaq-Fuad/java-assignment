public class PowerFactory {
  final double resistance = 10;
  final double power = 260;
  final double voltageAccessed = 120;

  double powerFactor;
  double voltageSourced;
  double temp1, temp2, temp3;

  public PowerFactory(double powerFactor) {
    this.powerFactor = powerFactor;
    this.temp1 = Math.pow((voltageAccessed + ((2 * resistance * power) / voltageAccessed)), 2);
    this.temp2 = Math.pow((2 * resistance * power) / (powerFactor * voltageAccessed), 2);
    this.temp3 = (1 - Math.pow(powerFactor, 2));

    voltageSourced = Math.sqrt(temp1 + (temp2 * temp3));
  }

  public double getVoltageSourced() {
    return voltageSourced;
  }
}