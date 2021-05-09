package entities;

public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalityId;

    public Customer(String firstName, String lastName, int dateOfBirth, String nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

	public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }
    
   
}
