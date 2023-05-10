package GSach;

/**
 *
 * @author nqhkt
 */
public class Sach extends Tailieu {
    double GiaB;
    int NamXb;
    public Sach(int MaS,String TenS,int NamXb,double GiaB) {
        super(MaS,TenS);
        this.GiaB = GiaB;
        this.NamXb = NamXb;
    }

    public double getGiaB() {
        return GiaB;
    }

    public int getNamXb() {
        return NamXb;
    }

    public void setGiaB(double GiaB) {
        this.GiaB = GiaB;
    }

    public void setNamXb(int NamXb) {
        this.NamXb = NamXb;
    }
    @Override
    public double Thanhtien(){
        if(NamXb >=2015)
            return GiaB*0.95;
        else
            return GiaB*0.85;
    }
}
