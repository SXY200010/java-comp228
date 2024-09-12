public class Singers
{
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int numberOfAlbums;

    public Singers()
    {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numberOfAlbums = 0;
    }
    public Singers(int id)
    {
        this.id = id;
    }
    public Singers(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Singers(int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Singers(int id, String name, String address, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public Singers(int id, String name, String address, String dateOfBirth, int numberOfAlbums)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }
    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    public String toString()
    {
        return "Singers:" +
                "ID: " + id +
                ", Name: " + name +
                ", Address:" + address +
                ", Date of Birth:" + dateOfBirth +
                ", Number of Albums:" + numberOfAlbums;
    }
}
