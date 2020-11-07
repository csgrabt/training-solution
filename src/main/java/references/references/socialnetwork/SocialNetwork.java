package references.references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    private Member findByName(String name) {
        for (Member findName : members) {
            if (findName.getName().equals(name)) {
                return findName;
            }
        }
        return null;
    }

    public void connect(String name, String othername) {
        Member a = findByName(name);
        Member b = findByName(othername);
        a.connectMember(b);
    }

    public List<String> bidirectionalConnections() {
        List<String> a = new ArrayList<>();
        for (Member c1 : members) {
            for (Member c2 : c1.getConnections()
            ) {
                if (c2.getConnections().contains(c1)) {
                    a.add(c1.getName() + " - " + c2.getName());
                }

            }
        }

        return a;
    }


}
