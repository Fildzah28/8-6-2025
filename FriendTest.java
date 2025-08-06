//Driver Class--> butuh main method 
public class FriendTest {
    public static void main(String[] args) {
    //membuat objek 
    Friend hasna = new Friend ("hasna", 15, "web developer", "menari");
    hasna.print();

    Friend banu = new Friend ("banu", 16, "programmer", "bermain basket" );
    banu.print();

    Friend axel = new Friend ("axel", 15, "orang suskses", "bersepeda jarak jauh");
    axel.print();

    Friend elzhar = new Friend ("Elzhar", 16, "chef", "memasak");
    elzhar.print();
    
    Friend bryan = new Friend ("bryan", 16, "computer scientist", "nonton film");
    bryan.print();
}
}

