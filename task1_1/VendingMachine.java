public class VendingMachine
{
    private DefineCentCoin CenCoin = new DefineCentCoin();
    private int CentCoinCount100 = 0;
    private int CentCoinCount50 = 0;
    private int CentCoinCount20 = 0;
    private int CentCoinCount10 = 0;
    private int CentCoinCount5 = 0;
    private int CentCoinCount1 = 0;
    public void ConversionCentCion(int CentCoin_)
    {
        if (CentCoin_ >= CenCoin.getCentCoin100())
        {
            CentCoinCount100 = CentCoin_ / 100;
            CentCoin_ %= 100;
        }
        if (CentCoin_ >= CenCoin.getCentCoin50())
        {
            CentCoinCount50 = CentCoin_ / 50;
            CentCoin_ %= 50;
        }
        if (CentCoin_ >= CenCoin.getCentCoin20())
        {
            CentCoinCount20 = CentCoin_ / 20;
            CentCoin_ %= 20;
        }
        if (CentCoin_ >= CenCoin.getCentCoin10())
        {
            CentCoinCount10 = CentCoin_ / 10;
            CentCoin_ %= 10;
        }
        if (CentCoin_ >= CenCoin.getCentCoin5())
        {
            CentCoinCount5 = CentCoin_ / 5;
            CentCoin_ %= 5;
        }
        CentCoinCount1 = CentCoin_;
        Print();
    }
    public void ConversionDollar(float Dollar_)
    {
        ConversionCentCion((int)(Dollar_ * 100));
    }
    private void Print()
    {
        if (CentCoinCount100 != 0)
        {
            System.out.println(CentCoinCount100 + " * 1 dollars");
        }
        if (CentCoinCount50 != 0)
        {
            System.out.println(CentCoinCount50 + " * 50 cent coins");
        }
        if (CentCoinCount20 != 0)
        {
            System.out.println(CentCoinCount20 + " * 20 cent coins");
        }
        if (CentCoinCount10 != 0)
        {
            System.out.println(CentCoinCount10 + " * 10 cent coins");
        }
        if (CentCoinCount5 != 0)
        {
            System.out.println(CentCoinCount5 + " * 5 cent coins");
        }
        if (CentCoinCount1 != 0)
        {
            System.out.println(CentCoinCount1 + " * 1 cent coins");
        }
    }
}
