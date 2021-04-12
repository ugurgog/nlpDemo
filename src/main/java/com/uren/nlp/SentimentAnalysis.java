package com.uren.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {

    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! This is Ugur. I don't like insects but I like snakes. Snakes are so sweet. " +
                "I hate watching TV.";

        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentences = coreDocument.sentences();

        for(CoreSentence sentence : coreSentences){
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + " - " + sentence);
        }
    }
}
