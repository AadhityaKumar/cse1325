public class Colors {
    private Color color;
    private double startx;
    private double starty;
    private double endx;
    private double endy;
    private double length;

    public Colors(Color color, double startx, double starty, double endx, double endy)
    {
        this.color = color;
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public double length(){
        return Math.sqrt(Math.pow(endx - startx, 2) + Math.pow(endy - starty, 2));
    }

    @Override
    public String toString()
    {
        return color + " (" + startx + "," + starty + ")-(" + endx + "," + endy + ") has length " + length();
    }
/* 
    public static void main(String[] args)
    {
        Colors clr = new Colors(Color.ORANGE, 1.0, 2.0, 5.0, 6.0);

        System.out.println(clr);
    }*/
}