package Bai2;

public class Thuvien {
    private String Matailieu;
    private String NXB;
    private int Sobanphathanh;

    public Thuvien() {
    }

    public Thuvien(String matailieu, String NXB, int sobanphathanh) {
        Matailieu = matailieu;
        this.NXB = NXB;
        Sobanphathanh = sobanphathanh;
    }

    public String getMatailieu() {
        return Matailieu;
    }

    public void setMatailieu(String matailieu) {
        Matailieu = matailieu;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSobanphathanh() {
        return Sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        Sobanphathanh = sobanphathanh;
    }

    @Override
    public String toString() {
        return "Thuvien{" +
                "Matailieu='" + Matailieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", Sobanphathanh=" + Sobanphathanh +
                '}';
    }
}
