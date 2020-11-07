package references.references.socialnetwork;


public class SocialNetworkMAin {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addMember("Joe");
        socialNetwork.addMember("John");
        socialNetwork.addMember("Jane");
        socialNetwork.addMember("Richard");

        socialNetwork.connect("Joe", "John");
        socialNetwork.connect("John", "Joe");

        //ystem.out.println(socialNetwork.bidirectionalConnections());

        //System.out.println(socialNetwork.toString());
        System.out.println(socialNetwork.getMembers().get(2).toString1());

    }
}