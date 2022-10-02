package structural.facade;

public class TwitGetter {

    private OAuth oauth;
    private TwitterClient twitterClient;


    public TwitGetter() {
        oauth = new OAuth();
        twitterClient = new TwitterClient();
    }

    public java.util.List<Tweet> getTweets() {
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var tweets = twitterClient.getRecentTweets(accessToken);
        return tweets;
    }

}

