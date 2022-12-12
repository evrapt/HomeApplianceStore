public interface DeviceBasic {
     double getLength();
     void setLength(double Length);
     double getHeight();
     void setHeight(double Height);
     double getDepth();
     void setDepth(double Depth);
     String getManufacturerName();
     void setManufacturerName(String ManufacturerName);
     String getDeviceName();
     void setDeviceName(String DeviceName);
     String getDeviceType();
     void setDeviceType(String DeviceType);
     Integer getPowerConsumption();
     void setPowerConsumption(Integer PowerConsumption);
    void powerOn ();
    void powerOff ();
    int periodicMaintenance(int num);
    boolean status();

}
