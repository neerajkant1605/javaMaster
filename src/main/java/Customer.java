
public class Customer {

    private int CustomerID;
    private String Title;
    private String FirstName;
    private String MiddleName;
    private String LastName;

    public Customer() {
    }

    public Customer(int customerID, String title, String firstName, String middleName, String lastName) {
        CustomerID = customerID;
        Title = title;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
    }
}
