import com.bridgelabz.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest{
    @Test
    public void givenMessage_WhenMatchSad_ThenReturnSad()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in Sad Mood");
        String mood=moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenMatchHappy_ThenReturnHappy()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in Happy Mood");
        String mood=moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenMatchNull_ThenReturnHappy()
    {
        MoodAnalyzer moodAnalyser=new MoodAnalyzer(null);
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}