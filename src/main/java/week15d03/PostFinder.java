package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private final List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }


    public void addToList(Post post){
        posts.add(post);
    }


    public List<Post> findPostsFor(String user) {
        List<Post> postsForUser = new ArrayList<>();

        for (Post item : posts
        ) {
            if (isEarlier(item) &&
                    howIsTheOwner(item, user) &&
                    isEmpty(item)

            ) {
                postsForUser.add(item);
            }

        }


        return postsForUser;
    }


    private boolean isEarlier(Post post) {

        return post.getPublishedAt().isBefore(LocalDate.now());
    }

    private boolean howIsTheOwner(Post post, String owner) {

        return owner.equals(post.getOwner());
    }

    private boolean isEmpty(Post post) {
        boolean a = !(post.getContent().isEmpty());
        boolean b = !(post.getTitle().isEmpty());
        return a && b;
    }


}




