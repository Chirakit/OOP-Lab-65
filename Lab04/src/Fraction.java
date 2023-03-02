public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        String numTop = String.valueOf(topN);
        String numBtm = String.valueOf(btmN);
        String result = numTop + "/" + numBtm;
        return result;
    }
    public String toFloat() {
        double result = (double)topN / (double)btmN;
        String Altresult = String.valueOf(result);
        return Altresult;
    }
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN = topN + f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
}
