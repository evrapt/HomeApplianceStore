public class Fridge {
    private double Length;
    private double Height;
    private double Depth;
    private String ManufacturerName;
    private String DeviceName;
    private String DeviceType;
    private Integer PowerConsumption;
    private Integer FreezerCapacity;
    private Integer FreshFoodCapacity;
    private String RefrigerantType;
    private Integer NumberOfDoors;
    private String DefrostSystem;
    private static Integer NumberOfObjects = 0;

    /**
     * Creates an empty Fridge object.
     * No arguments.
     */
    public Fridge()
    {
        NumberOfObjects+=1;
    }

    /**
     * Creates a new Fridge object.
     * Based on the provided arguments.
     * @param Length
     * @param Height
     * @param Depth
     * @param ManufacturerName
     * @param DeviceName
     * @param DeviceType
     * @param PowerConsumption
     * @param FreezerCapacity
     * @param FreshFoodCapacity
     * @param RefrigerantType
     * @param NumberOfDoors
     * @param DefrostSystem
     */
    public Fridge(double Length, double Height, double Depth, String ManufacturerName, String DeviceName, String DeviceType, Integer PowerConsumption, Integer FreezerCapacity, Integer FreshFoodCapacity, String RefrigerantType, Integer NumberOfDoors, String DefrostSystem) {
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.ManufacturerName = ManufacturerName;
        this.DeviceName = DeviceName;
        this.DeviceType = DeviceType;
        this.PowerConsumption = PowerConsumption;
        this.FreezerCapacity = FreezerCapacity;
        this.FreshFoodCapacity = FreshFoodCapacity;
        this.RefrigerantType = RefrigerantType;
        this.NumberOfDoors = NumberOfDoors;
        this.DefrostSystem = DefrostSystem;
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
     * Retuns the DeviceName property of the object.
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
     * Returns the FreezerCapacity property of the object.
     * @return FreezerCapacity
     */
    public Integer getFreezerCapacity() {
        return this.FreezerCapacity;
    }
    /**
     * Sets the FreezerCapacity property of the object.
     * @param FreezerCapacity
     */
    public void setFreezerCapacity(Integer FreezerCapacity) {
        this.FreezerCapacity = FreezerCapacity;
    }
    /**
     * Returns the FreshFoodCapacity property of the object.
     * @return FreshFoodCapacity
     */
    public Integer getFreshFoodCapacity() {
        return this.FreshFoodCapacity;
    }
    /**
     * Sets the FreshFoodCapacity property of the object.
     * @param FreshFoodCapacity
     */
    public void setFreshFoodCapacity(Integer FreshFoodCapacity) {
        this.FreshFoodCapacity = FreshFoodCapacity;
    }
    /**
     * Returns the RefrigerantType property of the object.
     * @return RefrigerantType
     */
    public String getRefrigerantType() {
        return this.RefrigerantType;
    }
    /**
     * Sets the RefrigerantType property of the object.
     * @param RefrigerantType
     */
    public void setRefrigerantType(String RefrigerantType) {
        this.RefrigerantType = RefrigerantType;
    }
    /**
     * Returns the NumberOfDoors property of the object.
     * @return NumberOfDoors
     */
    public Integer getNumberOfDoors() {
        return this.NumberOfDoors;
    }
    /**
     * Sets the NumberOfDoors property of the object.
     * @param NumberOfDoors
     */
    public void setNumberOfDoors(Integer NumberOfDoors) {
        this.NumberOfDoors = NumberOfDoors;
    }
    /**
     * Returns the DefrostSystem property of the object.
     @return DefrostSystem
     */
    public String getDefrostSystem() {
        return this.DefrostSystem;
    }
    /**
     * Sets the DefrostSystem property of the object.
     * @param DefrostSystem The type of defrosting.
     */
    public void setDefrostSystem(String DefrostSystem) {
        this.DefrostSystem = DefrostSystem;
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
    public void printDevice() {
        System.out.println("Length :" + this.Length + "\n" +
                "Height: " + this.Height+ "\n" +
                "Depth: " + this.Depth + "\n" +
                "ManufacturerName: " + this.ManufacturerName + "\n" +
                "DeviceName: " + this.DeviceName +"\n" +
                "DeviceType: " + this.DeviceType + "\n" +
                "PowerConsumption: " + this.PowerConsumption + "\n" +
                "FreezerCapacity: " + this.FreezerCapacity + "\n" +
                "FreshFoodCapacity: " + this.FreshFoodCapacity + "\n" +
                "RefrigerantType: " + this.RefrigerantType + "\n" +
                "NumberOfDoors: " +  this.NumberOfDoors + "\n" +
                "DefrostSystem: " + this.DefrostSystem + "\n" );
    }
}
