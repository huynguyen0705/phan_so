public class QuanLyPs {
    PhanSo phanSo = new PhanSo();
    public void NhapPhanSo(int tuSo, int mauSo){
        phanSo.setTuSo(tuSo);
        phanSo.setMauSo(mauSo);
        System.out.println("Nhập thành công");
    }
    public void HienThi(){
        phanSo.HienThiPhanSo();
    }
    public PhanSo Chia2PhanSo (PhanSo ps2){
        int TuSoMoi = phanSo.getTuSo() * ps2.getMauSo();
        int MauSoMoi = phanSo.getMauSo() * phanSo.getTuSo();
        return new PhanSo(TuSoMoi, MauSoMoi);
    }
    public PhanSo Tru2PhanSo (PhanSo ps2){
        int TuSoMoi = phanSo.getTuSo() * ps2.getMauSo() - ps2.getTuSo() * phanSo.getMauSo();
        int MauSoMoi = phanSo.getMauSo() * ps2.getMauSo();
        return new PhanSo(TuSoMoi, MauSoMoi);
    }
    public PhanSo Cong2PhanSo (PhanSo ps2){
        int TuSoMoi = phanSo.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * phanSo.getMauSo();
        int MauSoMoi = phanSo.getMauSo() * ps2.getMauSo();
        PhanSo phanSoMoi = new PhanSo(TuSoMoi,MauSoMoi);
        phanSoMoi.HienThiPhanSo();
        return phanSoMoi;
    }
}
