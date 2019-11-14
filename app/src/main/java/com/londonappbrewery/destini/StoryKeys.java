package com.londonappbrewery.destini;

public class StoryKeys {
    private int mQuestionID;
    private int mAnswer1ID;
    private int mAnswer2ID;

    public StoryKeys(int storyResourceID,int storyAnswer1,int storyAnswer2){
        mQuestionID = storyResourceID;
        mAnswer1ID = storyAnswer1;
        mAnswer2ID = storyAnswer2;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public int getAnswer1ID() {
        return mAnswer1ID;
    }

    public void setAnswer1ID(int answer1ID) {
        mAnswer1ID = answer1ID;
    }

    public int getAnswer2ID() {
        return mAnswer2ID;
    }

    public void setAnswer2ID(int answer2ID) {
        mAnswer2ID = answer2ID;
    }
}
