package tugas;

public class Main {

    public static void main(String[] args) {
        Singa obj_1 = new Singa("Singa", 4, "Mengaum", "Orange");
        Keledai obj_2 = new Keledai("Keledai", 4, "Meringkik", "Abu abu");
        Gorilla obj_3 = new Gorilla("Gorilla", 4, "Mengaum", "hitam");

        obj_1.displayBinatang();
        obj_1.displayMakan();
        obj_1.displayData();

        obj_2.displayBinatang();
        obj_2.displayMakan();
        obj_2.displayData();

        obj_3.displayBinatang();
        obj_3.displayMakan();
        obj_3.displayData();
    }
}
