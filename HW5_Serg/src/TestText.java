
public class TestText {

	public static void main(String[] args) {
		String text = "я пришел.к тебе с приветом.рассказать.что солнце встало.что оно.горячим светом по листам.что оно.";
		Text textObj = new Text();
		textObj.init(text);
		System.out.println(textObj.getWordCount());
		System.out.println(textObj.getWordSentences(text));
		

	}

}
