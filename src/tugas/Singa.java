package tugas;

public class Singa extends Binatang implements IKarnivora {
    private String suara, warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.printf("%s makan daging \n", super.getNama());
    }

    public void displayBinatang() {
        System.out.println("=======================================");
        System.out.println("Binatang adalah " + super.getNama());
    }

    public void displayData() {
        System.out.println("Nama adalah " + super.getNama());
        System.out.println("Jumlah kaki adalah " + super.getKaki());
        System.out.println("Suara adalah " + this.suara);
        System.out.println("Warna bulu adalah " + this.warnaBulu);
        System.out.println("=======================================");

    }

}
