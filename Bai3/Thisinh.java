package Bai3;

public class Thisinh {
    private int Sobaodanh;
    private String Hoten;
    private String Diachi;
    private int Mucuutien;

    public Thisinh() {
    }

    public Thisinh(int sobaodanh, String hoten, String diachi, int mucuutien) {
        Sobaodanh = sobaodanh;
        Hoten = hoten;
        Diachi = diachi;
        Mucuutien = mucuutien;
    }

    @Override
    public String toString() {
        return "Thisinh{" +
                "Sobaodanh=" + Sobaodanh +
                ", Hoten='" + Hoten + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Mucuutien=" + Mucuutien +
                '}';
    }
}
