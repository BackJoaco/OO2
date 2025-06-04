import java.util.List;

public class Document {
    List<String> words;

    public long totalCharacterCount(){
        return this.words
        .stream()
        .mapToLong(w -> w.length())
        .sum();
    }
  
    public long characterCount() {
    	return totalCharacterCount();
	}
    public long calculateAvg() {
 	    return totalCharacterCount() / words.size();
	}
// Resto del código que no importa
}
