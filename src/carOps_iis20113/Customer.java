package carOps_iis20113;

import java.util.UUID;

public class Customer {
	private String id;
    private String name;
    private String surname;
    private String landline;
    private String address;
    private String email;

    public Customer(String name, String surname, String landline, String address, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.landline = landline;
        this.address = address;
        this.email = email;
    }
	//getters 
    public String getId() {
        return id;
    }
	public String getname(){
		return name;
	}
	public String getsurname(){
		return surname;
	}
	public String getlandline(){
		return landline;
	}
	public String getaddress(){
		return address;
	}
	public String getemail(){
		return email;
	}
	//setters
	public void setname(String newName) {
    this.name = newName;
	}
    public void setsurname(String newsurname) {
    this.surname = newsurname;
	}
	public void setlandline(String newlandline) {
    this.landline = newlandline;
	}
	public void setName(String newaddress) {
    this.address = newaddress;
	}
	public void setemail(String newemail) {
    this.email = newemail;
	}
}
