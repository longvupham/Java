package Bai3;

public class KhoiA extends Thisinh {
    private String monthi = "Toán, Lý, Hóa";

    public KhoiA() {
    }

    public KhoiA(int sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiA{" + super.toString() + "and" +
                "monthi='" + monthi + '\'' +
                '}';
    }
}
