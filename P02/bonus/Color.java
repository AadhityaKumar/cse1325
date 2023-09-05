public enum Color {ORANGE("0xFFA500"), PURPLE("0x800080"), PINK("0xFFC0CB"), BROWN("0x964B00");

    private final String rgb;

    private Color(String rgb)
    {
        this.rgb = rgb;
    }

    public String asRgb()
    {
        return rgb;
    }
}