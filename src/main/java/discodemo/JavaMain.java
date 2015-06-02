package discodemo;

import edu.arizona.sista.processors.fastnlp.FastNLPProcessor;
import edu.arizona.sista.processors.Document;

public class JavaMain {
    public static void main(String[] args) {
        String text = "John is smiling because he is happy. He is generally an optimistic fellow.";
        FastNLPProcessor proc = new FastNLPProcessor(true, false, true, true);
        Document doc = proc.annotate(text);
        System.out.println(doc.discourseTree().get());
    }
}
