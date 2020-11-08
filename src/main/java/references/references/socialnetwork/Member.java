package references.references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {


    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    public List<String> connectedNames(){
        List<String> a = new ArrayList<>();
        for (Member connected : connections
             ) {String b = connected.getName();
            a.add(b);}

    return a;
    }


public String toString(){
        return getName() + connectedNames();
}

    public String toString1() {
        return name + " " + connections.toString();
    }


}
