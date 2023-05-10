package GSach;

/**
 *
 * @author nqhkt
 */
public abstract class Tailieu {
    int MaS;
    String TenS;

    public Tailieu(int MaS, String TenS) {
        this.MaS = MaS;
        this.TenS = TenS;
    }
//  
    public int getMaS() {
        return MaS;
    }

    public String getTenS() {
        return TenS;
    }

    public void setMaS(int MaS) {
        this.MaS = MaS;
    }

    public void setTenS(String TenS) {
        this.TenS = TenS;
    }
   public abstract double Thanhtien();
    
}
