package bai1;

public class Canbo {
    private String Hoten;
    private int Tuoi;
    private String Gioitinh;
    private String Diachi;

    public Canbo() {
    }

    public Canbo(String hoten, int tuoi, String gioitinh, String diachi) {
        Hoten = hoten;
        Tuoi = tuoi;
        Gioitinh = gioitinh;
        Diachi = diachi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "Hoten='" + Hoten + '\'' +
                ", Tuoi=" + Tuoi +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", Diachi='" + Diachi + '\'' +
                '}';
    }
}