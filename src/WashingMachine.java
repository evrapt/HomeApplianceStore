public class WashingMachine {
    private double Length;
    private double Height;
    private double Depth;
    private String ManufacturerName;
    private String DeviceName;
    private String DeviceType;
    private Integer PowerConsumption;
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
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.ManufacturerName = ManufacturerName;
        this.DeviceName = DeviceName;
        this.DeviceType = DeviceType;
        this.PowerConsumption = PowerConsumption;
        this.Capacity = Capacity;
        this.WashingSpeed = WashingSpeed;
        this.SpinSpeed = SpinSpeed;
        this.MotorPower = MotorPower;
        this.GFactor = GFactor;
        NumberOfObjects += 1;
    }
    /**
     * Returns the Length property of the object.
     * @return Length
     */
    public double getLength() {
        return this.Length;
    }
    /**
     * Sets the Length property of the object.
     * @param Length
     */
    public void setLength(double Length) {
        this.Length = Length;
    }
    /**
     * Returns the Height property of the object.
     * @return Height
     */
    public double getHeight() {
        return this.Height;
    }
    /**
     * Sets the Height property of the object.
     * @param Height
     */
    public void setHeight(double Height) {
        this.Height = Height;
    }
    /**
     * Returns the Depth property of the object.
     * @return Depth
     */
    public double getDepth() {
        return this.Depth;
    }
    /**
     * Sets the Depth property of the object.
     * @param Depth
     */
    public void setDepth(double Depth) {
        this.Depth = Depth;
    }
    /**
     * Returns the ManufacturerName property of the object.
     * @return ManufacturerName
     */
    public String getManufacturerName() {
        return this.ManufacturerName;
    }
    /**
     * Sets the ManufacturerName property of the object.
     * @param ManufacturerName
     */
    public void setManufacturerName(String ManufacturerName) {
        this.ManufacturerName = ManufacturerName;
    }
    /**
     * Returns the DeviceName property of the object.
     * @return DeviceName
     */
    public String getDeviceName() {
        return this.DeviceName;
    }
    /**
     * Sets the DeviceName property of the object.
     * @param DeviceName
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }
    /**
     * Returns the DeviceType property of the object.
     * @return DeviceType
     */
    public String getDeviceType() {
        return this.DeviceType;
    }
    /**
     * Sets the DeviceType property of the object.
     * @param DeviceType
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }
    /**
     * Returns the PowerConsumption property of the object.
     * @return PowerConsumption
     */
    public Integer getPowerConsumption() {
        return this.PowerConsumption;
    }
    /**
     * Sets the PowerConsumption property of the object.
     * @param PowerConsumption
     */
    public void setPowerConsumption(Integer PowerConsumption) {
        this.PowerConsumption = PowerConsumption;
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