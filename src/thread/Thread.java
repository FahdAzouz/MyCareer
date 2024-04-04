package thread;

public class Thread {

    public void View_posts(Post[] posts) {

        System.out.println("Viewing Post");
    }

    public Post[] Sort_posts( Post[] posts){
        //the methods takes an array of posts and sorts it the same way we did in the inbox class, then return it
        return posts;
    }

    public void RemovePost(Post post_toRemove){
        //the user inputs the post they want to remove
        post_toRemove = null;
    }

}
