package CaseStudy.models;

public class House extends services {
    String tieuChuanPhong;
    String wifi;
    int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, String wifi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.wifi = wifi;
        this.soTang = soTang;
    }

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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return super.toString()+
                " tieu chuan phong " + getTieuChuanPhong()+
                " tien nghi khac "+ getWifi()+
                " so tang " + getSoTang();
    }
}
