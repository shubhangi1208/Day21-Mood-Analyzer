import com.bridgelabz.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest extends MoodAnalyzer {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.analyseMood("User is SAD");
        Assert.assertEquals("SAD", result);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.analyseMood("User is HAPPY");
        Assert.assertEquals("HAPPY", result);
    }

}