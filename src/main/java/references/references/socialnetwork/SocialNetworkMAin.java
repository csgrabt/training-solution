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

        System.out.println(socialNetwork.bidirectionalConnections());

    }
}