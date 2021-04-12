package com.uren.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! This is Ugur Gogebakan. I am so excited about that. I have 2 sons. I love my wife.";

        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreLabelList = coreDocument.sentences();

        for(CoreSentence coreLabel : coreLabelList){
            System.out.println(coreLabel.toString());
        }
    }
}
