package Model;
public class ModelRecipe
{
    int pic;
    String text;

    public ModelRecipe(int pic, String text)
    {
        this.pic=pic;
        this.text=text;
    }

    public int getPic() {
        return pic;
    }
    public void setPic(int pic) {
        this.pic = pic;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
