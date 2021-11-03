package interfacelatihan.percobaan_1;

import interfacelatihan.percobaan_2.Iberprestasi;

public class Sarjana extends Mahasiswa implements ICumlaude, Iberprestasi {

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Nama saya " + super.nama);
        System.out.println("Aku sudah menyelesaikan SKRIPSI");

    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");

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
