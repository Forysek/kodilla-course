package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator){
        String prettyText = poemDecorator.decorate(textToDecorate);
        System.out.println("New, pretty text: " + prettyText);
    }
}
