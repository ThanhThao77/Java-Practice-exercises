package Java31;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1kg;
	private double khoiLuong;
	
	//bắt buộc phải có constructor
	public HoaDonCaPhe (String ten, double gia, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}
	
	//nếu pthuc k trả về bất cứ thông tin gì thì kdl là void
	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}
	
	//ktra kl caffe cua tui da ban co lon hon 1 con so dc dua vao pthuc hay k
	public boolean kiemtraKhoiLuongLonHon(double kl) {
		return this.khoiLuong > kl;
	}
	
	//ktra gia tien cua hoa don co lon hon 500.000d hay k
	public boolean kiemtraTongTienLonHon500k() {
		return this.tinhTongTien() > 500000;
	}
	
	//tinh so tien giam gia, giam x% cho cac hoa don co gtri lon hon 500k
	public double giamGia(double x) {
		if(this.tinhTongTien() > 500000) {
			return this.tinhTongTien() * (x/100);
		}
		else {
			return 0;
		}
	}
	
	//tinh so tien khach phai tra sau khi giam
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
	
}
