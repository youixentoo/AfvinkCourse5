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
public class Sequentie {
    
    protected String ntSeq;
    static int counterDNA, counterRNA;
    
    Sequentie(){   
    }
    
    Sequentie(String Seq){
        this.ntSeq = Seq;
    }
    
    
    public static void main(String[] args){
        DNA dna1 = new DNA("ATGATG");
        DNA dna2 = new DNA("ATTGGG");
        DNA dna3 = new DNA();
        RNA rna1 = new RNA("AUGAUG");
        
        try {
            dna3.setDNA("AUG");
        } catch (DNAException ex) {
            System.out.println(ex.toString());
        }
       
        System.out.println("DNA sequences: "+dna1.getCountDNA()+"\nRNA sequences: "+rna1.getCountRNA()+"\nTotal sequences: "+(dna1.getCountDNA()+rna1.getCountRNA()));
        
    }
    
    /**
     *
     * @param Seq Set the sequence of the Class Sequentie
     */
    public void setSequentie(String Seq){
        this.ntSeq = Seq;
    }
    
    /**
     *
     * @return Returns a String with the DNA or RNA sequence of the used object.
     */
    public String getSequentie(){
        return this.ntSeq;
    }
    
    
    
    
    
}
