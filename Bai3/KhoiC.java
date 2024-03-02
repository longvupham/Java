package Bai3;

public class KhoiC extends Thisinh {
    private String monthi = "Văn, Sử, Địa";

    public KhoiC() {
    }

    public KhoiC(int sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiC{" + super.toString() + "and" +
                "monthi='" + monthi + '\'' +
                '}';
    }
}
