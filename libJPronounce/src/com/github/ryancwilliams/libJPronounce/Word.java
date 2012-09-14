/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPronounce;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ryanwilliams
 */
public class Word {
    private final String spelling;
    private final List ipa;
    
    /**
     * Creates a new word object 
     * @param spelling The Spelling of the word
     * @param ipa The IPA of the word
     */
    public Word(String spelling, List ipa) {
        
        // Stroe Spelling
        this.spelling = spelling;
        
        // Create list
        this.ipa = new LinkedList();
        
        // Add ipa to list
        this.ipa.addAll(ipa);
    }
    
    /**
     * Creates a new word object 
     * @param spelling The Spelling of the word
     * @param ipa The IPA of the word
     */
    public Word(String spelling, String[] ipa) {
        this(spelling, Arrays.asList(ipa));
    }

    /**
     * Gets the IPA this word.
     * @return the IPA of this word.
     */
    public List getIpa() {
        return ipa;
    }

    /**
     * Gets the Spelling this word.
     * @return the Spelling of this word.
     */
    public String getSpelling() {
        return spelling;
    }
    
}
