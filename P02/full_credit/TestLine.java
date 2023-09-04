public class TestLine
{
    public static void main(String[] args)
        {
            Line clr1 = new Line(Color.ORANGE, 1.0, 2.0, 5.0, 6.0);
            Line clr2 = new Line(Color.PURPLE, 3.0, 4.0, 7.0, 8.0);
            Line clr3 = new Line(Color.PINK, 0.0, 0.0, 3.0, 4.0);
            Line clr4 = new Line(Color.BROWN, 2.5, 2.5, 6.5, 6.5);

            System.out.println(clr1);
            System.out.println(clr2);
            System.out.println(clr3);
            System.out.println(clr4);
        }
}