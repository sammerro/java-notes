package structural.adapter;

import structural.adapter.Gmail.GmailClient;

public class DemoAdapter {

    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));


        emailClient.downloadEmails();
        System.out.println(".");
    }
}
