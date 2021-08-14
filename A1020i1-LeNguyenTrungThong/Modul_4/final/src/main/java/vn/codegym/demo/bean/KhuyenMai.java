package vn.codegym.demo.bean;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "khuyen_mai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "tieu de khong duoc de trong")
    private String tieuDe;
    @NotBlank(message = "thoi gian bat dau khong duoc de trong")
    private String thoiGianBatDau;
    @NotBlank(message = "thoi gian ket thuc khong duoc de trong")
    private String thoiGianKetThuc;
//    @NotBlank(message = "muc giam gia khong duoc de trong")
    private double mucGiamGia;
    @NotBlank(message = "mo ta chi tiet khong duoc de trong")
    private String chiTiet;

    public KhuyenMai() {
    }

    public KhuyenMai(int id, @NotBlank(message = "tieu de khong duoc de trong") String tieuDe, @NotBlank(message = "thoi gian bat dau khong duoc de trong") String thoiGianBatDau, @NotBlank(message = "thoi gian ket thuc khong duoc de trong") String thoiGianKetThuc, @NotBlank(message = "muc giam gia khong duoc de trong") double mucGiamGia, @NotBlank(message = "mo ta chi tiet khong duoc de trong") String chiTiet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.mucGiamGia = mucGiamGia;
        this.chiTiet = chiTiet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public double getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
}
