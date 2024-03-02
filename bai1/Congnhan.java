package bai1;

public class Congnhan extends Canbo {
    private int Capbac;

    public Congnhan(int capbac) {
        Capbac = capbac;
    }

    public Congnhan(String hoten, int tuoi, String gioitinh, String diachi, int capbac) {
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