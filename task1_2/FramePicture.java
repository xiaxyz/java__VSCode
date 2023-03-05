public class FramePicture {
    private double CostRegularType = 0.15;
    private double CostFancyType = 0.25;
    private double CostColoring = 0.1;
    private double CostCardboard = 0.02;
    private double CostGlass = 0.07;
    private double CostCrown = 0.35;

    public double AllCostFrameType(int InchX_, int InchY_, boolean frame) {
        if (frame) {
            return (InchX_ + InchY_) * 2 * CostRegularType;
        } else {
            return (InchX_ + InchY_) * 2 * CostFancyType;
        }
    }

    public double AllCostColoring(int InchX_, int InchY_, String Color_) {
        if (Color_ != "write") {
            return (InchX_ + InchY_) * 2 * CostColoring;
        }
        return 0;
    }

    public double AllCostCardboard(int InchX_, int InchY_) {
        return InchX_ * InchY_ * CostCardboard;
    }

    public double AllCostGlass(int InchX_, int InchY_) {
        return InchX_ * InchY_ * CostGlass;
    }

    public double AllCostCrown(int Number_) {
        return Number_ * CostCrown;
    }
}
