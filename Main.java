public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();
        triangolo.setBase(5.2F);
        triangolo.setHeight(12F);
        rettangolo.setSideA(20.3F);
        rettangolo.setSideB(18.5F);
        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
