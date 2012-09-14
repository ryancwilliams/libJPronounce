/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPronounce;

import java.util.LinkedList;
import java.util.List;
import sun.tools.tree.ThisExpression;

/**
 *
 * @author ryanwilliams
 */
public class Pronunciation {
    
    public static List ARPAbetToIPA(List ARPAbet) {
        //Create new list
        List IPA = new LinkedList();
        
        // Load a Phon
        for(Object Phon : ARPAbet) {
            String Phoneme = (String)Phon;
            
            if (Phoneme.startsWith("AO")) {
                IPA.add("ɔ");
            } else if (Phoneme.startsWith("AA")) {
                IPA.add("ɑ");
            } else if (Phoneme.startsWith("IY")) {
                IPA.add("i");
            } else if (Phoneme.startsWith("UW")) {
                IPA.add("u");
            } else if (Phoneme.startsWith("EH")) {
                IPA.add("ɛ");
            } else if (Phoneme.startsWith("IH")) {
                IPA.add("ɪ");
            } else if (Phoneme.startsWith("UH")) {
                IPA.add("ʊ");
            } else if (Phoneme.startsWith("AH1")) {
                IPA.add("ʌ");
            } else if (Phoneme.startsWith("AH")) {
                IPA.add("ə");
            } else if (Phoneme.startsWith("AX")) {
                IPA.add("ə");
            } else if (Phoneme.startsWith("AE")) {
                IPA.add("æ");
            } else if (Phoneme.startsWith("EY")) {
                IPA.add("eɪ");
            } else if (Phoneme.startsWith("AY")) {
                IPA.add("aɪ");
            } else if (Phoneme.startsWith("OW")) {
                IPA.add("oʊ");
            } else if (Phoneme.startsWith("AW")) {
                IPA.add("aʊ");
            } else if (Phoneme.startsWith("OY")) {
                IPA.add("ɔɪ");
            } else if (Phoneme.startsWith("ER")) {
                IPA.add("ɝ");
            }
        }
    }
}
