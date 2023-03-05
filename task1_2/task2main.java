import java.util.Scanner;

public class task2main
{
    public static void main(String[] args)
    {
        FigureCost AllCost = new FigureCost();
        Scanner In = new Scanner(System.in);
        int InchX, InchY;
        System.out.println("请输入图片长(英寸)");
        InchX = In.nextInt();
        System.out.println("请输入图片宽(英寸)");
        InchY = In.nextInt();
        AllCost.SetInchXY(InchX, InchY);
        System.out.println("请输入框架类型(regular/fancy)");
        AllCost.SetFrameType(In.next());
        System.out.println("请输入皇冠数量(0为不要皇冠):");
        AllCost.SetNumberCrown(In.nextInt());
        AllCost.FigureAllCost();
        System.out.println("总费用为" + AllCost.AllCost + "美元");
        In.close();
    }
}
