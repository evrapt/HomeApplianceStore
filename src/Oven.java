public class Oven extends Device{


    private Integer Capacity;
    private Integer TemperatureMin;
    private Integer TemperatureMax;
    private String Controls;
    private String Interior;

    private static Integer NumberOfObjects = 0;
    /**
     * Creates an empty Oven object.
     * No arguments.
     */
    public Oven()
    {
        super();
        NumberOfObjects+=1;
    }

    /**
     * Creates a new Oven Object.
     * Based on the provided arguments.
     * @param Length
     * @param Height
     * @param Depth
     * @param ManufacturerName
     * @param DeviceName
     * @param DeviceType
     * @param PowerConsumption
     * @param Capacity
     * @param TemperatureMin
     * @param TemperatureMax
     * @param Controls
     * @param Interior
     */
    public Oven(double Length, double Height, double Depth, String ManufacturerName, String DeviceName, String DeviceType, Integer PowerConsumption, Integer Capacity, Integer TemperatureMin, Integer TemperatureMax, String Controls, String Interior) {
        super(Length, Height, Depth, ManufacturerName, DeviceName, DeviceType, PowerConsumption);

        this.Capacity =  Capacity;
        this.TemperatureMin = TemperatureMin;
        this.TemperatureMax = TemperatureMax;
        this.Controls = Controls;
        this.Interior = Interior;
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
     * Returns the TemperatureMin property of the object.
     * @return TemperatureMin
     */
    public Integer getTemperatureMin() {
        return this.TemperatureMin;
    }
    /**
     * Sets the TemperatureMin property of the object.
     * @param TemperatureMin
     */
    public void setTemperatureMin(Integer TemperatureMin) {
        this.TemperatureMin = TemperatureMin;
    }
    /**
     * Returns the TemperatureMax property of the object.
     * @return TemperatureMax
     */
    public Integer getTemperatureMax() {
        return this.TemperatureMax;
    }
    /**
     * Sets the TemperatureMax property of the object.
     * @param TemperatureMax
     */
    public void setTemperatureMax(Integer TemperatureMax) {
        this.TemperatureMax = TemperatureMax;
    }
    /**
     * Returns the Controls property of the object.
     * @return Controls
     */
    public String getControls() {
        return this.Controls;
    }
    /**
     * Sets the Controls property of the object.
     * @param Controls
     */
    public void setControls(String Controls) {
        this.Controls = Controls;
    }
    /**
     * Returns the Interior property of the Object.
     * @return Interior
     */
    public String getInterior() {
        return this.Interior;
    }
    /**
     * Sets the Interior property of the object.
     * @param Interior
     */
    public void setInterior(String Interior) {
        this.Interior = Interior;
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
                "Capacity: " + this.Capacity + "\n" +
                "TemperatureMin: " + this.TemperatureMin + "\n" +
                "TemperatureMax: " + this.TemperatureMax + "\n" +
                "Controls: " +  this.Controls + "\n" +
                "Interior: " + this.Interior + "\n" );
    }
}