public class FigureCost
{
    private int InchX;
    private int InchY;
    private boolean FrameType;
    private int NumberCrown;
    private FramePicture Frame = new FramePicture();
    public double AllCost;

    public void SetInchXY(int InchX_, int InchY_)
    {
        InchX = InchX_;
        InchY = InchY_;
    }

    public void SetFrameType(String FrameType_)
    {
        if (FrameType_ == "regular" || FrameType_ == "Regular")
        {
            FrameType = false;
        }
        else if (FrameType_ == "fancy" || FrameType_ == "Fancy")
        {
            FrameType = true;
        }
    }

    public void SetFrameType(boolean FrameType_)
    {
        FrameType = FrameType_;
    }

    public void SetNumberCrown(int NumberCrown_)
    {
        NumberCrown = NumberCrown_;
    }

    public void FigureAllCost()
    {
        AllCost += Frame.AllCostFrameType(InchX, InchY, FrameType);
        AllCost += Frame.AllCostColoring(InchX, InchY);
        AllCost += Frame.AllCostCardboard(InchX, InchY);
        AllCost += Frame.AllCostGlass(InchX, InchY);
        AllCost += Frame.AllCostCrown(NumberCrown);
    }
}
