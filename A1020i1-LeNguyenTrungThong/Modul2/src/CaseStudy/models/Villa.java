package CaseStudy.models;

public class Villa extends services {
    String tieuChuanPhong;
    String wifi;
    double dienTichHoBoi;
    int soTang;

    public Villa(String tieuChuanPhong, String wifi, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.wifi = wifi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(){}

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return super.toString()+
                " tieu chuan phong "+ getTieuChuanPhong()+
                " wifi "+getWifi()+
                " dien tich ho boi "+getDienTichHoBoi()+
                " so tang " + getSoTang();
    }
}
