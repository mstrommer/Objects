public class Main {
    public static void main(String[] args) {
        MyInteger x = new MyInteger(5);
        MyInteger y = new MyInteger(6);
        System.out.println("Before swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y.n);
        swap(x,y);
        System.out.println("After swap:");
        System.out.println("x: " + x.n);
        System.out.println("y: " + y.n);
    }

    public static void swap(int x, int y){ // Parameter werden immer als Kopie übergeben
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void swap(Integer x, Integer y){ // Wrapper Klassen sind immutable, so wie Strings auch
        Integer tmp = x;
        x = y;
        y = tmp;
    }

    public static void swap(MyInteger x, MyInteger y){ // Daher ist eigene Klasse notwendig
        int tmp = x.n;
        x.n = y.n;
        y.n = tmp;
    }
}