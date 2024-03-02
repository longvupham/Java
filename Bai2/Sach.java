package Bai2;

public class Sach extends Thuvien{
    private String tentacgia;
    private int sotrang;

    public Sach(String tentacgia, int sotrang) {
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    public Sach(String matailieu, String NXB, int sophathanh, String tentacgia, int sotrang) {
        super(matailieu, NXB, sophathanh);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tentacgia='" + tentacgia + '\'' +
                ", sotrang=" + sotrang +
                "and"+super.toString();
    }
}
