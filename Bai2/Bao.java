package Bai2;

public class Bao extends Thuvien{
    private int Ngayphathanh;

    public Bao(int ngayphathanh) {
        Ngayphathanh = ngayphathanh;
    }

    public Bao(String matailieu, String NXB, int sobanphathanh, int ngayphathanh) {
        super(matailieu, NXB, sobanphathanh);
        Ngayphathanh = ngayphathanh;
    }

    public int getNgayphathanh() {
        return Ngayphathanh;
    }

    public void setNgayphathanh(int ngayphathanh) {
        Ngayphathanh = ngayphathanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "Ngayphathanh=" + Ngayphathanh +
                "and"+super.toString();
    }
}
