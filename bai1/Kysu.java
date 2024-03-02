package bai1;

public class Kysu extends Canbo{
    private int Capbac;

    public Kysu(int capbac) {
        Capbac = capbac;
    }

    public Kysu(String hoten, int tuoi, String gioitinh, String diachi, int capbac) {
        super(hoten, tuoi, gioitinh, diachi);
        Capbac = capbac;
    }

    public int getCapbac() {
        return Capbac;
    }

    public void setCapbac(int capbac) {
        Capbac = capbac;
    }

    @Override
    public String toString() {
        return "Congnhan{" +
                "Capbac=" + Capbac +"and"+super.toString();
    }
}
