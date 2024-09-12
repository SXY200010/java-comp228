public class Drivers
{
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        System.out.println(singer1.toString());
        singer1.setId(1);
        System.out.println(singer1.toString());
        singer1.setName("John Doe");
        System.out.println(singer1.toString());
        singer1.setAddress("123 Music Lane");
        System.out.println(singer1.toString());
        singer1.setDateOfBirth("1985-07-15");
        System.out.println(singer1.toString());
        singer1.setNumberOfAlbums(5);
        System.out.println(singer1.toString());

    }
}
