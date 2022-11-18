public class AirCondition {
    private double Length;
    private double Height;
    private double Depth;
    private String ManufacturerName;
    private String DeviceName;
    private String DeviceType;
    private Integer PowerConsumption;

    private Integer Capacity;
    private String Refrigerant;
    private double RefrigerantQuantity;
    private Integer AirFlowVolume;
    private Integer LowestTemperature;

    private static Integer NumberOfObjects = 0;
    /**
     * Creates an empty AirCondition object.
     * No arguments.
     */
    public AirCondition()
    {
        NumberOfObjects+=1;
    }

    /**
     * Creates a new AirCondition Object.
     * Based on the provided arguments.
     * @param Length
     * @param Height
     * @param Depth
     * @param ManufacturerName
     * @param DeviceName
     * @param DeviceType
     * @param PowerConsumption
     * @param Capacity
     * @param Refrigerant
     * @param RefrigerantQuantity
     * @param AirFlowVolume
     * @param LowestTemperature
     */
    public AirCondition(double Length, double Height, double Depth, String ManufacturerName, String DeviceName, String DeviceType, Integer PowerConsumption,  Integer Capacity, String Refrigerant, double RefrigerantQuantity, Integer AirFlowVolume, Integer LowestTemperature) {
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.ManufacturerName = ManufacturerName;
        this.DeviceName = DeviceName;
        this.DeviceType = DeviceType;
        this.PowerConsumption = PowerConsumption;
        this.Capacity = Capacity;
        this.Refrigerant = Refrigerant;
        this.RefrigerantQuantity = RefrigerantQuantity;
        this.AirFlowVolume = AirFlowVolume;
        this.LowestTemperature = LowestTemperature;
        NumberOfObjects += 1;
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
     * Retuns the DeviceName property of the object.
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
     * Returns the Refrigerant property of the object.
     * @return Refrigerant
     */
    public String getRefrigerant() {
        return this.Refrigerant;
    }
    /**
     * Sets the Refrigerant property of the object.
     * @param Refrigerant
     */
    public void setRefrigerant(String Refrigerant) {
        this.Refrigerant = Refrigerant;
    }
    /**
     * Returns the RefrigerantQuantity property of the object.
     * @return RefrigerantQuantity
     */
    public double getRefrigerantQuantity() {
        return this.RefrigerantQuantity;
    }
    /**
     * Sets the RefrigerantQuantity property of the object.
     * @param RefrigerantQuantity
     */
    public void setRefrigerantQuantity(double RefrigerantQuantity) {
        this.RefrigerantQuantity = RefrigerantQuantity;
    }
    /**
     * Returns the AirFlowVolume property of the object.
     * @return AirFlowVolume
     */
    public Integer getAirFlowVolume() {
        return this.AirFlowVolume;
    }
    /**
     * Sets the AirFlowVolume property of the object.
     * @param AirFlowVolume
     */
    public void setAirFlowVolume(Integer AirFlowVolume) {
        this.AirFlowVolume = AirFlowVolume;
    }
    /**
     * Returns the LowestTemperature property of the object.
     * @return LowestTemperature
     */
    public Integer getLowestTemperature() {
        return this.LowestTemperature;
    }
    /**
     * Sets the LowestTemperature property of the object.
     * @param LowestTemperature
     */
    public void setLowestTemperature(Integer LowestTemperature) {
        this.LowestTemperature = LowestTemperature;
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
                "Capacity: " + this.Capacity + "\n" +
                "Refrigerant: " + this.Refrigerant + "\n" +
                "RefrigerantQuantity: " + this.RefrigerantQuantity + "\n" +
                "AirFlowVolume: " +  this.AirFlowVolume + "\n" +
                "LowestTemperature: " + this.LowestTemperature + "\n" );
    }
}
