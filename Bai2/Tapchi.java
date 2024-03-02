package Bai2;

public class Tapchi extends Thuvien{
    private int sophathanh;
    private int thangphathanh;

    public Tapchi(int sophathanh, int thangphathanh) {
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public Tapchi(String matailieu, String NXB, int sobanphathanh, int sophathanh, int thangphathanh) {
        super(matailieu, NXB, sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    @Override
    public String toString() {
        return "Tapchi{" +
                "sophathanh=" + sophathanh +
                ", thangphathanh=" + thangphathanh +
                "and"+super.toString();
    }
}
