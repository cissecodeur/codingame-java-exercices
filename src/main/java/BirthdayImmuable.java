import java.util.Date;

public class BirthdayImmuable {


    /*
    Modifiez le corps de certaines méthodes (cela peut inclure le constructeur) de la classe Person pour que les instances ne soient pas altérables :
    A partir du moment où une instance de Person est créée,
    il ne devrait plus être possible de la modifier.
     */



    /**
     * Creates a Person with the given name and birth date.
     */
    private final String name;
    private final Date birthDate;
    public BirthdayImmuable(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

   // birthDate est copié dans le constructeur et dans le getter

}
