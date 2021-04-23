/**
 * 
 */
/**
 * @author tanya
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
class AddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip ;
	private String phoneNumber;
	private String email;	
	
	public AddressBook(String firstName ,String lastName ,String address, String city,
			          String state,String phoneNumber,String email,int zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.zip = zip;
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}


public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <AddressBook> contactDetails =new ArrayList <AddressBook>();
		System.out.println("How many contacts you want add ? ");
		int contactInput = sc.nextInt();
		
		for(int i =0;i<contactInput ; i++) {
			System.out.println("Enter your First Name : ");
			String firstName = sc.nextLine();
			
			System.out.println("Enter your Last Name : ");
			String lastName=sc.nextLine();
			
			System.out.println("Enter your Address : ");
			String address=sc.nextLine();
			
			System.out.println("Enter your City Name : ");
			String city=sc.nextLine();
			
			System.out.println("Enter your State Name : ");
			String state=sc.nextLine();
			
			System.out.println("Enter your Phone number : ");
			String phoneNumber=sc.nextLine();
			
			System.out.println("Enter your Email : ");
			String email=sc.nextLine();
			
			System.out.println("Enter your Zip code : ");
			int zip=sc.nextInt();
			
			contactDetails.add(new AddressBook(firstName, lastName, address, city,
					                             state, phoneNumber, email, zip));
		
		
			
		}
	}
}