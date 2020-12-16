package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class gamesActivity extends AppCompatActivity {

    private List<Game> gameList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }


    //Denna kallas när man startar nytt game
    protected void createNewGame(){

    }

    //Denna kallas när man fortsätter ett spel som redan är igång
    protected void continueGame(){

    }

    public static Uri generateContentLink() {
        Uri baseUrl = Uri.parse("https://your-custom-name.page.link");
        String domain = "https://your-app.page.link";

        DynamicLink link = FirebaseDynamicLinks.getInstance()
                .createDynamicLink()
                .setLink(baseUrl)
                .setDomainUriPrefix(domain)
                .setIosParameters(new DynamicLink.IosParameters.Builder("com.your.bundleid").build())
                .setAndroidParameters(new DynamicLink.AndroidParameters.Builder("com.your.packageName").build())
                .buildDynamicLink();

        return link.getUri();
    }


}