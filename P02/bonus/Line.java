public class Line {
    private Color color;
    private double startx;
    private double starty;
    private double endx;
    private double endy;
    private double length;

    public Line(Color color, double startx, double starty, double endx, double endy)
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
        return color + " (" + color.asRgb() + ")" + " (" + startx + "," + starty + ")-(" + endx + "," + endy + ") has length " + length();
    }
}