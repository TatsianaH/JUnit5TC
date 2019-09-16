import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text {
	private Map<String, Integer> mapCount;
	private Map<String, List<String>> mapSentences;

	public void init(String text) {
this.mapCount = new HashMap<>();
this.mapSentences = new HashMap<>();
String [] sentences = text.split("\\.");
for(int i = 0; i < sentences.length; i++) {
	String [] words = sentences[i].split(" ");
	for(int w = 0; w < words.length; w++) {
		if(mapCount.containsKey(words[w])) {
		mapCount.put(words[w], mapCount.get(words[w] + 1));	
		mapSentences.get(words[w]).add(sentences[i]);	
		} else {
			mapCount.put(words[w], 1);
			
			List<String> list = new ArrayList<>();
			list.add(sentences[i]);
			mapSentences.put(words[w], list);
		}
	}
}

	}

	public Map<String, Integer> getWordCount() {
		return this.mapCount;
	}

	public Map<String, List<String>> getWordSentences() {
		return this.mapSentences;
	}
}
