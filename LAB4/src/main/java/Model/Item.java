package Model;

import java.util.Date;

public class Item {
    private String tensanpham;
    private String hinhanh;
    private Double giagoc;
    private Double giamoi;
    private Date ngay;

    public Item(String tensanpham, String hinhanh, Double giagoc, Double giamoi, Date ngay) {
        this.tensanpham = tensanpham;
        this.hinhanh = hinhanh;
        this.giagoc = giagoc;
        this.giamoi = giamoi;
        this.ngay = ngay;
    }

    public Item() {
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Double getGiagoc() {
        return giagoc;
    }

    public void setGiagoc(Double giagoc) {
        this.giagoc = giagoc;
    }

    public Double getGiamoi() {
        return giamoi;
    }

    public void setGiamoi(Double giamoi) {
        this.giamoi = giamoi;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String mucgia(){
        if(giamoi<10){
            return "Giá Thấp";
        }else if(giamoi>100){
            return "Giá Cao";
        }
        return "Bình Thường";
    }

}
