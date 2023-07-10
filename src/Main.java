import java.sql.Struct;

/*. Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
same format, can you write code that can parse and print out:
1. The building number: 12345
2. The Street: “Big St.”
3. City: “Alphabet City”
4. State: “CA”
5. Postal Code: 90210

 */
public class Main {
    public static void main(String[] args) {

        String indirizzo = "12345 Big St., Alphabet City, CA 90210";

        String civico = indirizzo.split(" ")[0];
        System.out.println(civico);

        String via = findStreet(indirizzo);
        System.out.println(via);

        String city = findcity(indirizzo);
        System.out.println(city);

        String state = state(indirizzo);
        System.out.println(state);

        String cap = cap(indirizzo);
        System.out.println(cap);



    }
    public static String findStreet (String indirizzo) {
        int space = indirizzo.indexOf(" ");
        int comma = indirizzo.indexOf(",");
        String street = indirizzo.substring(space + 1, comma);
        return street;
    }
    public static String findcity(String indirizzo){
        return indirizzo.split(",")[1].strip();
    }
    public static  String state(String indirizzo){
        return indirizzo.split(",")[2].strip().split(" ")[0];
    }
    public static String cap(String indirizzo){
        return indirizzo.split(",")[2].strip().split(" ")[1];
    }
    }