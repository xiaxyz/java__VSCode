import java.util.Scanner;

public class task1main
{
    public static void main(String[] args)
    {
        VendingMachine Machine = new VendingMachine();
        Scanner In = new Scanner(System.in);
        float Dollar;
        System.out.print("请输入美元数: ");
        Dollar = In.nextFloat();
        Machine.ConversionDollar(Dollar);
        In.close();
    }
}
