public class PhanSo {
    private int TuSo;
    private int MauSo;
    public PhanSo(){

    }

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int mauSo) {
        MauSo = mauSo;
    }

    public PhanSo(int tuSo, int mauSo) {
        setTuSo(tuSo);
        setMauSo(mauSo);
    }

    public void HienThiPhanSo() {
        System.out.println("Phân số: " + getTuSo() + "/" + getMauSo());
    }
}
