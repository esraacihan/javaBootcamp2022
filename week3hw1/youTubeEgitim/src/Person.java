public class Person extends Customer{
    private String nationalityId;
    private String firstName;
    private String lastName;

    public Person(int id, String city, String nationalityId, String firstName, String lastName) {
        super(id, city);
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
