


abstract class Device implements DeviceBasic
{
    protected double Length;
    protected double Height;
    protected double Depth;
    protected String ManufacturerName;
    protected String DeviceName;
    protected String DeviceType;
    protected Integer PowerConsumption;
    private boolean Status;
    public Device(double Length, double Height, double Depth, String ManufacturerName, String DeviceName, String DeviceType, Integer PowerConsumption)
    {
    this.Length = Length;
    this.Height = Height;
    this.Depth = Depth;
    this.ManufacturerName = ManufacturerName;
    this.DeviceName = DeviceName;
    this.DeviceType = DeviceType;
    this.PowerConsumption = PowerConsumption;
    }

    public Device() {

    }
    /**
     * Returns the Length property of the object.
     * @return Length
     */
    public double getLength() {
    return Length;
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
        return Height;
    }
    /**
     * Sets the Height Property of the object.
     * @param Height
     */
    public void setHeight(double Height) {
        this.Height = Height;
    }
    /**
     * Returns the Depth Property of the object.
     * @return Depth
     */
    public double getDepth() {
        return Depth;
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
        return ManufacturerName;
    }
    /**
     * Sets the ManufacturerName of the object.
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
        return DeviceName;
    }
    /**
     * Sets the DeviceName property of the object.
     * @param DeviceName
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }
    /**
     * Returns the DeviceName property of the object.
     * @return DeviceType
     */
    public String getDeviceType() {
        return DeviceType;
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
        return PowerConsumption;
    }
    /**
     * Sets the PowerConsumption property of the object.
     * @param PowerConsumption
     */
    public void setPowerConsumption(Integer PowerConsumption) {
        this.PowerConsumption = PowerConsumption;
    }

    public int periodicMaintenance(int number)
    {
        return 0;
    }
    public void powerOn()
    {
        this.Status = true;
    }
    public void powerOff()
    {
        this.Status = false;
    }
    public boolean status()
    {
        return this.Status;
    }

    /** Abstract Classes */
    abstract void printDevice();
    abstract int getNumberOfObjects();
}

