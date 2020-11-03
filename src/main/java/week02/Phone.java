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

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        int mem1 = scanner.nextInt();
        int mem2 = scanner.nextInt();

        Phone phone = new Phone(name1, mem1);

        Phone phone2 = new Phone(name2, mem2);

        System.out.println(phone.getMem());
        System.out.println(phone.getType());
        System.out.println(phone2.getMem());
        System.out.println(phone2.getType());
    }

}