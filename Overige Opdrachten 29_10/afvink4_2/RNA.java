/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maventest.afvink4_2;

/**
 *
 * @author thijs
 */
class RNAException extends Exception{
    String str1;

    /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
    
    RNAException(String str2) {
        str1 = str2;
    }

    @Override
    public String toString() {
        return ("RNAException Occurred: " + str1);
    }
}

public class RNA extends Sequentie {
    
    RNA(){
        
    }
    
    RNA(String Seq) {
        super(Seq);
        counterRNA++;
    }
    
    /**
     *
     * @param Seq
     * @throws DNAException
     */
    public void setRNA(String Seq)throws DNAException{
        if(!Seq.contains("T")){
            super.setSequentie(Seq);
        }else{
            throw new DNAException("This is not RNA");
        }
    }
    
    /**
     *
     * @return
     * Returns the total RNA sequences total.
     */
    public int getCountRNA(){
        return counterRNA;
    }
}
