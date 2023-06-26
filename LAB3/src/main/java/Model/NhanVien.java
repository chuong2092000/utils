package Model;

import java.util.Date;

public class NhanVien {
    private String hoten;
    private String ngaysinh;

    public NhanVien() {
    }

    public NhanVien(String hoten, String ngaysinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}
