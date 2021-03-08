#cau 2
select *from sanphamsach s,  sanphamdochoi d,sanphamdungcu c
where s.SoLuong>10 and s.Dongia<1000000 and d.SoLuong>10 and d.Dongia<1000000 and c.SoLuong>10 and c.Dongia<1000000 ; 
select *from sanphamdochoi d
where d.Dongia<10 and d.Dongia<1000000 ; 
select *from sanphamdungcu c
where c.SoLuong>10 and c.Dongia<1000000 ; 

#khong co dia chi trong bang khachhang, cau 3
select *from khachhang 
where ROUND(DATEDIFF(now(),( NgaySinh)/365) BETWEEN 16 and 30) or ROUND(DATEDIFF(now(), NgaySinh)/365) = 40;

#cau 4
select c.TenSPSach, c.SoLuong, c.DonGia, a.TenSPDoChoi, a.SoLuong, a.DonGia, b.TenSPDungCu, b.SoLuong, b.DonGia  from donhang dh, chitietdonhang ct, sanphamdochoi a, sanphamdungcu b,sanphamsach c
where year(dh.NgayMuaHang)=2020;

#cau 5
select * from donhang d, khachhang
where QUARTER(d.NgayMuaHang)=4;

#cau 6
select *from khachhang
where length(TenKhachHang)>14 and (left(TenKhachHang,1)='N' or left(TenKhachHang,1)='Đ' or left(TenKhachHang,1)='C');

#cau 7:Hien thi thong tin san pham sach duoc khach mua va chua mua
select MaSPSach,TenSPSach, SoLuong,DonGia, DonVi, MaDMSach, NhaXuatBan, TacGia, SoLuong*DonGia as ThanhTien from sanphamsach;

#Nang cao Tạo Sp_1
create proc in_put_DonHang(@madonhang nvarchar(10), @makh nvarchar(10), @manv nvarchar(10), @ngaymua date, @tongtien float)
as
if exists (select * from DonHang where MaDonHang=@madonhang)
print N'Bạn k thể nhập trùng mã'
else 
insert into DonHang values (@madonhang, @makh, @manv, @tongtien)
select * from DonHang

#Nang cao Tạo Sp_2
create proc update_chi_tiet_donHang(@madh nvarchar(10))
as
if not exists (select * from DonHang where MaDonHang=@madonhang)
print N'Mã đơn hàng không tồn tại'
else select Soluong*2 as SoLuongMoi

#Tạo func_1
create function thongke_tien_sp(@makh nvarchar(10))
returns int
as
begin
declare @so int
select @so= sum(TongTien) from donhang, khachhang where @makh= MaKhachHang
return @so
end

#Tạo func_2

#Tạo trigger cập nhật ngày
create function doi_ngay(@ngay datetime)
returns nvarchar(15)
as
 begin
 declare @kq nvarchar(15)
 set @kq=dbo.doi_so(day(@ngay))+dbo.doi_so(MONTH(@ngay))+dbo.doi_so(year(@ngay))
 return @kq
 end
 
 create trigger CapNhat on DonHang for insert
 as 
 update DonHang set NgayMuaHang = dbo.doi_ngay(NgayMuaHang)
 

