package Bai3;

public class KhoiB extends Thisinh {
    private String monthi = "Toán, Hóa, Sinh";

    public KhoiB() {
    }

    public KhoiB(int sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiB{" + super.toString() + "and" +
                "monthi='" + monthi + '\'' +
                '}';
    }
}
