package arraylist;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


public class Capsule {

    public List<String> szinek = new ArrayList<>();


    public void addFirst(String szin) {
        szinek.add(0, szin);
    }


    public void addLast(String szin) {
        szinek.add(szin);
    }


    public List<String> getSzinek() {
        return szinek;
    }

    public void removeFirst() {
        szinek.remove(0);
    }

    public void removeLast() {
        szinek.remove(szinek.size() - 1);
    }


    public static void main(String[] args) {
        Capsule capsule = new Capsule();
        capsule.addFirst("béla");

        System.out.println(capsule.getSzinek());

        capsule.addFirst("béla2");

        System.out.println(capsule.getSzinek());

        capsule.addLast("béla3");

        System.out.println(capsule.getSzinek());

        capsule.szinek.add("sdfds");

        System.out.println(capsule.getSzinek());

        capsule.removeFirst();

        System.out.println(capsule.getSzinek());

        capsule.removeLast();

        System.out.println(capsule.getSzinek());




    }


}











