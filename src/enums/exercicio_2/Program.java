package enums.exercicio_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String moment = "21/02/2018 13:05:44";
        String moment2 = "28/07/2018 23:14:19";
        String title1 = "Traveling to New Zealand";
        String title2 = "Good night guys";
        String content = "I'm going to visit this country!";
        String content2 = "See you tomorrow";
        Integer likes1 = 12;
        Integer likes2 = 5;
        String comment1 = "Have a nice trip";
        String comment2 = "Wow that's awesome";

        String comment3 = "Good night";
        String comment4 = "May he force be with you";
        Post post1 = new Post(sdf.parse(moment), title1, content, likes1);
        Comment c1 = new Comment(comment1);
        Comment c2 = new Comment(comment2);
        post1.addComment(c1);
        post1.addComment(c2);

        Post post2 = new Post(sdf.parse(moment2), title2, content, likes2);
        Comment c3 = new Comment(comment3);
        Comment c4 = new Comment(comment4);
        post2.addComment(c3);
        post2.addComment(c4);


        System.out.println(post1);
        System.out.println(post2);

    }
}
