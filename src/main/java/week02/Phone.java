package week02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a tjpust");
        String name1 = scanner.nextLine();
        System.out.println("Adja meg a tjpust");
        String name2 = scanner.nextLine();
        System.out.println("Adja meg a memoria méretét");
        int mem1 = scanner.nextInt();
        System.out.println("Adja meg a memoria méretét");
        int mem2 = scanner.nextInt();

        Phone phone = new Phone(name1, mem1);

        Phone phone2 = new Phone(name2, mem2);


        System.out.println("A telefon típusa, memóriája " + phone.getMem() + phone.getType());
        System.out.println("A telefon típusa, memóriája " + phone2.getMem() + phone2.getType());
    }
}


