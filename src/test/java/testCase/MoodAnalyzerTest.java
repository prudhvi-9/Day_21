package testCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Main.MoodAnalyzer;

public class MoodAnalyzerTest {
	/*
	 * Junit Test for happy mood.
	 */
	@Test
	public void happyMood() {
		/*
		 * A new object moodAnalyzer is created.
		 */
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("HAPPY", mood);
	}

	/*
	 * Junit Test for sad mood.
	 */
	@Test
	public void sadMood() {
		/*
		 * A new object moodAnalyzer is created.
		 */
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("SAD", mood);
	}

	/*
	 * Junit Test for any mood.
	 */
	@Test
	public void anyMood() {
		/*
		 * A new object moodAnalyzer is created.
		 */
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in  mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("HAPPY", mood);
	}

}
