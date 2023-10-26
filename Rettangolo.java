public class Rettangolo implements Forme{
    public float sideA;
    public float sideB;

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del rettangolo è "+(sideA*sideB));
    }
}
