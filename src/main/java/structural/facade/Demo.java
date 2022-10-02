package structural.facade;

import java.util.List;

public class Demo {
  public static void show() {
    TwitGetter twitGetter = new TwitGetter();
    List<Tweet> tweets = twitGetter.getTweets();
    for (Tweet tweet : tweets) {
      System.out.println(tweet);
    }
  }

  public static void main(String[] args) {
    show();

  }
}
