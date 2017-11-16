package com.example.sachin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Youtubetest extends YouTubeBaseActivity {


    private  static  final String TAG="Youtubetest";
    YouTubePlayerView youTubePlayerView;
    Button play;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubetest);
        Log.d(TAG, "onCreate: starting.");
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtubeplayer);
        play=(Button)findViewById(R.id.play);

        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                Log.d(TAG, "onClick: Done initializing.");
                youTubePlayer.loadVideo("KHuHEI90yug");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Log.d(TAG, "onClick: Failure to initializing.");

            }
        };


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Initializing YouTube Player.");
                youTubePlayerView.initialize(Youtubeconfig.getApiKey(),onInitializedListener);
            }
        });
    }
}
