public class Triangolo implements Forme{
    public float base;
    public float height;

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del triangolo è "+(base*height)/2);
    }
}
