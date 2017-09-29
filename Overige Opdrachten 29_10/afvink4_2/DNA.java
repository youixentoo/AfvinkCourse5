/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maventest.afvink4_2;

/**
 * DNA storage in a object
 * @author thijs
 */
class DNAException extends Exception{
    String str1;

    /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
    
    DNAException(String str2) {
        str1 = str2;
    }

    @Override
    public String toString() {
        return ("DNAException Occurred: " + str1);
    }
}


public class DNA extends Sequentie {
    
    DNA(){
        
    }
    
    DNA(String Seq) {
        super(Seq);           
        counterDNA++;
    }

    /**
     *
     * @param Seq a sequence of DNA in captital letters
     * @throws DNAException if it contains a "U"
     */
    public void setDNA(String Seq) throws DNAException{
        if(!Seq.contains("U")){
            super.setSequentie(Seq);
        }else{
            throw new DNAException("This is not DNA");
        }
        
        
    }
    
    /**
     *
     * @return
     * Returns the amount of DNA sequences created total
     */
    public int getCountDNA(){
        return counterDNA;
    }
    
}
