package Java35;

public class Test35 {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(15, 9, 2030);
		Ngay ngay3 = new Ngay(15, 9, 2025);
		
		TacGia tacGia1 = new TacGia("tung tivi", ngay1);
		TacGia tacGia2 = new TacGia("Thao", ngay2);
		TacGia tacGia3 = new TacGia("Tien", ngay3);
		
		Sach sach1 = new Sach("Lap trinh Java", 5000, 2023, tacGia1);
		Sach sach2 = new Sach("Lap trinh C++", 2000, 2000, tacGia2);
		Sach sach3 = new Sach("Lap trinh Python", 100, 2000, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sach NXB sach1 va sach3: "+ sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("So sach NXB sach2 va sach3: "+ sach2.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("Sach1 giam 10% con: "+sach1.giaSauKhiGiam(10));
		System.out.println("Sach2 giam 20% con: " + sach2.giaSauKhiGiam(20));
	}
}
