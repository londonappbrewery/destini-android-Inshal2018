package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mRedButton;
    Button mBlueButton;
    int mCurrentStage;
    private StoryKeys[] mStoryArray = new StoryKeys[] {
            new StoryKeys(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryKeys(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryKeys(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryKeys(R.string.T4_End,0,0),
            new StoryKeys(R.string.T5_End,0,0),
            new StoryKeys(R.string.T6_End,0,0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mRedButton = findViewById(R.id.buttonTop);
        mBlueButton = findViewById(R.id.buttonBottom);
        mCurrentStage=0;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCurrentStage==0){
                    nextStep(3);
                }
                else if (mCurrentStage==2){
                    nextStep(3);
                }
                else if (mCurrentStage==3){
                    nextStep(6);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCurrentStage==0){
                    nextStep(2);
                }
                else if (mCurrentStage==2){
                    nextStep(4);
                }
                else if (mCurrentStage==3){
                    nextStep(5);
                }
            }
        });

    }

    public void nextStep(int steptomove){
        mCurrentStage=steptomove;
        steptomove--;
        mStoryTextView.setText(mStoryArray[steptomove].getQuestionID());
        if(mStoryArray[steptomove].getAnswer1ID()==0){
            mRedButton.setText("THE END");
            mBlueButton.setVisibility(View.GONE);
        }
        else {
            mRedButton.setText(mStoryArray[steptomove].getAnswer1ID());
            mBlueButton.setText(mStoryArray[steptomove].getAnswer2ID());
        }
    }
}
