public class HomeApplianceStore {
     private String NameOfCompany;
     private String Address;
     private Integer SumOfEmployees;

     HomeApplianceStore()
     {

     }
     HomeApplianceStore(String NameOfCompany,String Address, Integer SumOfEmployees)
     {
          this.NameOfCompany = NameOfCompany;
          this.Address = Address;
          this.SumOfEmployees = SumOfEmployees;
     }
     public String getNameOfCompany()
     {
          return this.NameOfCompany;
     }

     public String getAddress()
     {
          return this.Address;
     }

     public Integer getSumOfEmployees()
     {
          return this.SumOfEmployees;
     }

     public void setNameOfCompany(String nameOfCompany)
     {
          this.NameOfCompany = nameOfCompany;
     }

     public void setAddress(String Address)
     {
          this.Address = Address;
     }

     public void setSumOfEmployees(Integer SumOfEmployees)
     {
          this.SumOfEmployees = SumOfEmployees;
     }

}
