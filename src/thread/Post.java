package thread;

import java.util.GregorianCalendar;
public class Post {

    java.util.GregorianCalendar Date_time = new GregorianCalendar();
    public String Post;
    int nLikes = 0;

    public Post(GregorianCalendar Date_time, String Post){
        this.Date_time = Date_time;
        this.Post = Post;
    }

    public int Like(){
        return ++nLikes;
    }

    public Post Search(Post[]posts, Post post_toSearch){
        //this method takes an array of type posts and returns the corresponding post if found after searching the array
        for (Post post : posts) {
            if (Post.equals(post_toSearch))
                return post_toSearch;
        }
        return null; //this case should be handled in the main by prompting a corresponding message if post is not found
    }

    @Override
    public String toString() {
        return "thread.Post{" +
                "Date_time=" + Date_time +
                ", thread.Post='" + Post + '\'' +
                '}';
    }
}
