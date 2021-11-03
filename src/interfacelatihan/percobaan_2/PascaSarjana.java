package interfacelatihan.percobaan_2;

import interfacelatihan.percobaan_1.ICumlaude;
import interfacelatihan.percobaan_1.Mahasiswa;

public class PascaSarjana extends Mahasiswa implements ICumlaude, Iberprestasi {

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Nama saya " + super.nama);
        System.out.println("Aku sudah menyelesaikan TESIS");

    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");

    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Nama saya " + super.nama);
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");

    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");

    }

}
