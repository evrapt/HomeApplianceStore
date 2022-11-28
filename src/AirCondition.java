public class AirCondition extends Device {


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
        super();
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
        super(Length, Height, Depth, ManufacturerName, DeviceName, DeviceType, PowerConsumption);
        this.Capacity = Capacity;
        this.Refrigerant = Refrigerant;
        this.RefrigerantQuantity = RefrigerantQuantity;
        this.AirFlowVolume = AirFlowVolume;
        this.LowestTemperature = LowestTemperature;
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
