package daynineproblems.classes;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    long phoneNumber;
    String email;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, long zip,
                   long phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayContact() {
        System.out.println(firstName + " " + lastName + ", " + address + ", "
                + city + ", " + state + " - " + zip
                + ", Phone: " + phoneNumber + ", Email: " + email);
    }
}
