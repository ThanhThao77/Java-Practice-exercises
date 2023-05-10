package Java31;

public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyên", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyên", 100000, 5.5);

		System.out.println("Tong tien cua HD1: " + hd1.tinhTongTien());
		System.out.println("Tong tien cua HD2: " + hd2.tinhTongTien());
		
		System.out.println("Tong tien: " + hd1.tinhTongTien() );
		
		System.out.println("Kiem tra khoi luong > 2kg: " + hd1.kiemtraKhoiLuongLonHon(2));
		System.out.println("Kiem tra khoi luong > 1kg: " + hd1.kiemtraKhoiLuongLonHon(1));

		System.out.println("kiem tra tong tien > 500k: " + hd1.kiemtraTongTienLonHon500k());
		
		System.out.println("HD1 giam gia: "+ hd1.giamGia(10));
		System.out.println("HD2 giam gia: "+ hd2.giamGia(10));

		System.out.println("So tien khach tra sau giam gia cua HD1: " +hd1.giaSauKhiGiam(10));
		System.out.println("So tien khach tra sau giam gia cua HD2: " +hd2.giaSauKhiGiam(10));

	}
}
