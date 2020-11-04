package array;

public class ArrayMain {

    public static void main(String[] args) {
        //String[] a = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        //System.out.println(a[1]);
        //System.out.println(a.length);


        int[] b = new int[5];

        {
            int eredmeny = 1;

            for (int i = 0; i < b.length; i++) {

                b[i] = eredmeny;

                eredmeny = eredmeny * 2;

                System.out.println(b[i]);
            }
        }


        boolean[] d = {false, true, false, true, false, true};
        for (int i = 0; i < d.length;
             i++) {

            System.out.println(d[i]);
        }


    }
}




