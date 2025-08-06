//Object Class-->tidak butuh main method
public class Friend {
    //properties class
    String nama;
    int usia;
    String cita;
    String hobi;

    //constructur
    public Friend(String n, int u, String c, String h) {
     nama = n;
     usia = u; 
     cita = c;
     hobi = h;
    }

    //method untuk menampilkan data
    public void print() {
        System.out.println(nama);
        System.out.println("usia:"+ usia); 
        System.out.println(cita);
        System.out.println(hobi);
    }
}
 





