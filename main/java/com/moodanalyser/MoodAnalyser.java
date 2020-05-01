package com.moodanalyser;
import static com.moodanalyser.MoodAnalyseException.ExceptionType.ENTERED_EMPTY;
import static com.moodanalyser.MoodAnalyseException.ExceptionType.ENTERED_NULL;
//import org.junit.Assert;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalyseException {
        try{
            if (message.length() == 0)
                throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.ENTERED_EMPTY,"Please Enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e){
             throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.ENTERED_NULL,"Please Enter Proper Mood");
        }

    }


}
