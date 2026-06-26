package MekushBasics;

public class Bodmas {
    public static void main(String[] args) {
        int x = 4*2/3;
        System.out.println(x);
        int y = 11;
        y++;
        System.out.println(y);
        ++y;
        System.out.println(y);
        System.out.println(y++);
        System.out.println(++y);

        int z = 10;
        int w = z++;
        System.out.println(w+" "+z);
        int k = ++w;
        System.out.println(k+" "+w);


    }
}


