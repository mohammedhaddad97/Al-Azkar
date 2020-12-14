package com.example.azkar;

import androidx.annotation.NonNull;

public class Zikr {
    private String mZikrText;
    private String mAddInfo;
    private int mNumOfRepetitions;
//    private boolean mIsSabah = true;

    public Zikr(String zikrText, String addInfo, int numOfRepetitions) {
        mZikrText = zikrText;
        mAddInfo = addInfo;
        mNumOfRepetitions = numOfRepetitions;
    }

    public Zikr() {};

    public String getZikrText() {
        return mZikrText;
    }

    public void setZikrText(String zikrText) {
        mZikrText = zikrText;
    }

    public String getAddInfo() {
        return mAddInfo;
    }

    public void setAddInfo(String addInfo) {
        mAddInfo = addInfo;
    }

    public int getNumOfRepetitions() {
        return mNumOfRepetitions;
    }

    public void setNumOfRepetitions(int numOfRepetitions) {
        if(numOfRepetitions <= 0) {
            mNumOfRepetitions = 1;
        } else {
            mNumOfRepetitions = numOfRepetitions;
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "\n" + mZikrText + "\n\n" + mAddInfo + "\n\n" + mNumOfRepetitions +"\n\n";
    }
}
