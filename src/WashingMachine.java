public class WashingMachine extends Device{
    private Integer Capacity;
    private Integer WashingSpeed;
    private Integer SpinSpeed;
    private double MotorPower;
    private Integer GFactor;
    private static Integer NumberOfObjects = 0;
    /**
     * Creates an Empty WashingMachine Object
     * No arguments.
     */
    public WashingMachine()
    {
        super();
        NumberOfObjects+=1;
    }
    /**
     * Creates a new WashingMachine Object.
     * Based on the provided arguments.
     * @param Length
     * @param Height
     * @param Depth
     * @param ManufacturerName
     * @param DeviceName
     * @param DeviceType
     * @param PowerConsumption
     * @param Capacity
     * @param WashingSpeed
     * @param SpinSpeed
     * @param MotorPower
     * @param GFactor
     */
    public WashingMachine(double Length, double Height, double Depth, String ManufacturerName, String DeviceName, String DeviceType, Integer PowerConsumption, Integer Capacity, Integer WashingSpeed, Integer SpinSpeed, double MotorPower, Integer GFactor) {
        super(Length, Height, Depth, ManufacturerName, DeviceName, DeviceType, PowerConsumption);

        this.Capacity = Capacity;
        this.WashingSpeed = WashingSpeed;
        this.SpinSpeed = SpinSpeed;
        this.MotorPower = MotorPower;
        this.GFactor = GFactor;
        NumberOfObjects += 1;
    }

    /**
     * Returns the Capacity property of the object.
     * @return Capacity
     */
    public Integer getCapacity() {
        return this.Capacity;
    }
    /**
     * Sets the Capacity property of the object.
     * @param Capacity
     */
    public void setCapacity(Integer Capacity) {
        this.Capacity = Capacity;
    }
    /**
     * Returns the WashingSpeed property of the object.
     * @return WashingSpeed
     */
    public Integer getWashingSpeed() {
        return this.WashingSpeed;
    }
    /**
     * Sets the WashingSpeed property of the object.
     * @param WashingSpeed
     */
    public void setWashingSpeed(Integer WashingSpeed) {
        this.WashingSpeed = WashingSpeed;
    }
    /**
     * Returns the SpinSpeed property of the object.
     * @return SpinSpeed
     */
    public Integer getSpinSpeed() {
        return this.SpinSpeed;
    }
    /**
     * Sets the SpinSpeed property of the object.
     * @param SpinSpeed
     */
    public void setSpinSpeed(Integer SpinSpeed) {
        this.SpinSpeed = SpinSpeed;
    }
    /**
     * Returns the MotorPower property of the object.
     * @return MotorPower
     */
    public double getMotorPower() {
        return this.MotorPower;
    }
    /**
     * Sets the MotorPower property of the object.
     * @param MotorPower
     */
    public void setMotorPower(double MotorPower) {
        this.MotorPower = MotorPower;
    }
    /**
     * Returns the GFactor property of the object.
     * @return GFactor
     */
    public Integer getGFactor() {
        return this.GFactor;
    }
    /**
     * Sets the GFactor property of the object.
     * @param GFactor
     */
    public void setGFactor(Integer GFactor) {
        this.GFactor = GFactor;
    }
    /**
     * This function does nothing for now.
     */
    private void periodicMaintenance() {

    }
    /**
     * This function returns the amount of created objects.
     * @return Number of created Objects.
     * */
    public static int getNumberOfObjects()
    {
        return NumberOfObjects;
    }
    /**
     * Prints device's properties.
     * */
    public void printDevice()
    {
        System.out.println("Length :" + this.Length + "\n" +
                "Height: " + this.Height+ "\n" +
                "Depth: " + this.Depth + "\n" +
                "ManufacturerName: " + this.ManufacturerName + "\n" +
                "DeviceName: " + this.DeviceName +"\n" +
                "DeviceType: " + this.DeviceType + "\n" +
                "PowerConsumption: " + this.PowerConsumption + "\n" +
                "Capacity:" + this.Capacity + "\n" +
                "WashingSpeed: " + this.WashingSpeed + "\n" +
                "SpinSpeed: " + this.SpinSpeed + "\n" +
                "MotorPower: " + this.MotorPower + "\n" +
                "GFactor: " + this.GFactor+ "\n");
    }
}