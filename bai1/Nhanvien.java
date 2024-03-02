package bai1;

public class Nhanvien extends Canbo{
    private String Congviec;

    public Nhanvien(String congviec) {
        Congviec = congviec;
    }

    public Nhanvien(String hoten, int tuoi, String gioitinh, String diachi, String congviec) {
        super(hoten, tuoi, gioitinh, diachi);
        Congviec = congviec;
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String congviec) {
        Congviec = congviec;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "Congviec='" + Congviec + '\'' +
                "and"+super.toString();
    }
}
