public class main {
    public static void deviceStatus(Device object)
    {

        System.out.println("Instance of Device? " + (object instanceof Device));
        if(object instanceof Device) {
           object = (Device) object;
            System.out.println("Device Class: " + object.getClass().getName());
            System.out.println("Device Status: " + object.status());

        }

    }
    public static void main(String[] args) {
        HomeApplianceStore Store1 = new HomeApplianceStore();
        Store1.setNameOfCompany(args[0]);
        Store1.setAddress(args[1]);
        Store1.setSumOfEmployees(Integer.parseInt(args[2]));
        if (Store1.getNameOfCompany() == null) {
            System.out.println("NameOfCompany is null");
        }
        if (Store1.getAddress() == null) {
            System.out.println("Address is null");
        }
        if (Store1.getSumOfEmployees() == null) {
            System.out.println("SumOfEmployees is null");
        }
        System.out.println(Store1.getNameOfCompany() + " " + Store1.getAddress() + " " + Store1.getSumOfEmployees());

        Fridge Fridge1 = new Fridge(2.5, 1.5, 3, "samsung", "real", "Fridge", 300, 10, 2, "r134a", 2, "Automatic");
        AirCondition AirCondition1 = new AirCondition(2.5, 1.5, 3, "Samsung", "real1", "AirCondition", 100, 12000, "R-410A", 0.5, 10, 10);

        Oven Oven1 = new Oven(2.5, 1.5, 3, "Samsung", "real23", "Oven", 200, 10, 100, 200, "Manual", "Ceramic");
        WashingMachine WashingMachine1 = new WashingMachine(2.5, 1.5, 3, "Samsung", "real21", "WashingMachine", 100, 10, 2000, 4000, 25.5, 3);

        Oven1.printDevice();
        Oven1.powerOn();
        deviceStatus(Oven1);
        Oven1.powerOff();
        deviceStatus(Oven1);
    }
    }