public class Fridge extends Device{

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
        super();
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
        super(Length, Height, Depth, ManufacturerName, DeviceName, DeviceType, PowerConsumption);
        this.FreezerCapacity = FreezerCapacity;
        this.FreshFoodCapacity = FreshFoodCapacity;
        this.RefrigerantType = RefrigerantType;
        this.NumberOfDoors = NumberOfDoors;
        this.DefrostSystem = DefrostSystem;
        NumberOfObjects += 1;
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
