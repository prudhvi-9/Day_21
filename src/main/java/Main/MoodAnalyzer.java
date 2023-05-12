package Main;

public class MoodAnalyzer {

	String message;

	/*
	 * Constructor.
	 */
	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood(String message) {

		this.message = message;

		return analyzeMood();

	}

	/*
	 * To analyse the mood.
	 */
	public String analyzeMood() {

		if (message.contains("sad")) {

			return "SAD";

		} else {

			return "HAPPY";

		}
	}
}