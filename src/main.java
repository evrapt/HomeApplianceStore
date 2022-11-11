public class main {
    public static void main(String[] args)
    {
        //HomeApplianceStore Store1 = new HomeApplianceStore(args[0],args[1],Integer.parseInt(args[2]));
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
        System.out.println(Store1.getNameOfCompany()+" "+Store1.getAddress()+" "+Store1.getSumOfEmployees());
    }
}
