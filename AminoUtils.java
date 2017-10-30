/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maventest.fastaanalyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A collection of DNA, RNA and protein utilities.<br>
 * Translations, transcriptions, protein analysis, protein codes conversion, linebreak removal.
 * 
 * @author Thijs Weenink
 * @version 1.0
 */
public class AminoUtils {
    
    /**
     *
     * @param Seq The DNA sequence as a String
     * @return The peptide sequence in one codes.
     * <p>Returns "No full protein available" if the DNA sequence does not give a full protein.
     * <br>This gives no exception so it can be used easily with a multiple fasta formatted file.
     * @throws UnknownNucleotideError If there is letter other then ATGC in the sequence.
     * @throws StringIndexOutOfBoundsException If there is no protein to be gotten
     * <p>The StringIndexOutOfBoundsException will most likely only be thrown when used in a for loop when reading a multiple fasta file.
     */
    public static String getTranslation(String Seq) throws UnknownNucleotideError{
            String Protein = "";
            Integer Start_Codon;

            java.util.Map table = new HashMap(); //Codon table declaration
            // <editor-fold defaultstate="collapsed" desc="Table contents">
            table.put ("TTT", "F");
            table.put ("TTC", "F");
            table.put ("TTA", "L");
            table.put ("TTG", "L");
            table.put ("TCT", "S");
            table.put ("TCC", "S");
            table.put ("TCA", "S");
            table.put ("TCG", "S");
            table.put ("TAT", "Y");
            table.put ("TAC", "Y");
              //            TAA end
              //            TAG end
            table.put ("TGT", "C");
            table.put ("TGC", "C");
              //            TGA end
            table.put ("TGG", "W");
            table.put ("CTT", "L");
            table.put ("CTC", "L");
            table.put ("CTA", "L");
            table.put ("CTG", "L");
            table.put ("CCT", "P");
            table.put ("CCC", "P");
            table.put ("CCA", "P");
            table.put ("CCG", "P");
            table.put ("CAT", "H");
            table.put ("CAC", "H");
            table.put ("CAA", "Q");
            table.put ("CAG", "Q");
            table.put ("CGT", "R");
            table.put ("CGC", "R");
            table.put ("CGA", "R");
            table.put ("CGG", "R");
            table.put ("ATT", "I");
            table.put ("ATC", "I");
            table.put ("ATA", "I");
            table.put ("ATG", "M");
            table.put ("ACT", "T");
            table.put ("ACC", "T");
            table.put ("ACA", "T");
            table.put ("ACG", "T");
            table.put ("AAT", "N");
            table.put ("AAC", "N");
            table.put ("AAA", "K");
            table.put ("AAG", "K");
            table.put ("AGT", "S");
            table.put ("AGC", "S");
            table.put ("AGA", "R");
            table.put ("AGG", "R");
            table.put ("GTT", "V");
            table.put ("GTC", "V");
            table.put ("GTA", "V");
            table.put ("GTG", "V");
            table.put ("GCT", "A");
            table.put ("GCC", "A");
            table.put ("GCA", "A");
            table.put ("GCG", "A");
            table.put ("GAT", "D");
            table.put ("GAC", "D");
            table.put ("GAA", "E");
            table.put ("GAG", "E");
            table.put ("GGT", "G");
            table.put ("GGC", "G");
            table.put ("GGA", "G");
            table.put ("GGG", "G");
            // Source: http://gaggle.systemsbiology.net/svn/gaggle/gaggle/branches/original/org/systemsbiology/gaggle/geese/sequence/CodonTable.java
            // </editor-fold>

            if(Seq.matches(".*[ATCG].*")){
                Start_Codon = Seq.indexOf("ATG");          
                String string_aug = Seq.substring(Start_Codon,Seq.length());
                String[] Splitted_codons = string_aug.split("(?<=\\G...)");

                for (String codon:Splitted_codons){ //Translation loop
                    if(codon.equals("TAA")){
                        break;
                    }else if(codon.equals("TAG")){
                        break;
                    }else if(codon.equals("TGA")){
                        break;
                    }else if(codon.length() < 3){//The way the string is splitted means there can be "codons" with a length less than 3, if this is true, there is no (full) protein.
                        Protein = "No full protein available";
                        break;
                    }else{
                        Protein += (String)table.get(codon);
                    }
                }

                return Protein;
            }else{
                throw new UnknownNucleotideError("UnknownNucleotideError Occurred:\nThere is an unknown nucleotide in this sequence.");
            }
            
    }
    
    /**
     *
     * @param Seq The one letter peptide sequence as a String
     * @param FullName A boolean to indicate whether or not the fullnames will be returned. <br>true = fullnames<br>false = three letter code.
     * @return Either the three letter code or the fullnames (String).
     * @throws UnknownAminoacidException If there is an unknown aminoacid in the sequence.
     */
    public static String getSequenceThree(String Seq, boolean FullName) throws UnknownAminoacidException{
        int error_index;
        String ThreeLetterCode = "";
        java.util.Map table = new HashMap(); //Codon table declaration
        // <editor-fold defaultstate="collapsed" desc="3 letter Aminoacids">
        table.put ("F", "Phe"); //1
        table.put ("L", "Leu"); //2
        table.put ("A", "Ala"); //3
        table.put ("R", "Arg"); //4
        table.put ("N", "Asn"); //5
        table.put ("D", "Asp"); //6
        table.put ("C", "Cys"); //7
        table.put ("Q", "Gln"); //8
        table.put ("E", "Glu"); //9
        table.put ("G", "Gly"); //10
        table.put ("H", "His"); //11
        table.put ("I", "Ile"); //12
        table.put ("K", "Lys"); //13
        table.put ("M", "Met"); //14
        table.put ("P", "Pro"); //15
        table.put ("S", "Ser"); //16 
        table.put ("T", "Thr"); //17
        table.put ("W", "Trp"); //18
        table.put ("Y", "Tyr"); //19
        table.put ("V", "Val"); //20
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Fullnames Aminoacids">
        java.util.Map table2 = new HashMap();
        table2.put ("A", "Alenine");
        table2.put ("R", "Arginine");
        table2.put ("N", "Asparagine");
        table2.put ("C", "Cysteine");
        table2.put ("D", "Aspartate");
        table2.put ("Q", "Glutamine");
        table2.put ("E", "Glutamate");
        table2.put ("G", "Glycine");
        table2.put ("H", "Histidine");
        table2.put ("I", "Isoleucine");
        table2.put ("L", "Leucine");
        table2.put ("K", "Lysine");
        table2.put ("M", "Methionine");
        table2.put ("F", "Phenylalanine");
        table2.put ("P", "Proline");
        table2.put ("S", "Serine");
        table2.put ("T", "Threonine");
        table2.put ("W", "Thryptophan");
        table2.put ("V", "Valine");
        table2.put ("Y", "Tyrosine");
        // </editor-fold>
            
        String[] sequence = Seq.split("(?<=\\G.)");
        for (String Letter:sequence){
            if(FullName){
                if((String)table2.get(Letter.toUpperCase()) != null){
                    ThreeLetterCode += (String)table2.get(Letter.toUpperCase());
                }else{
                    error_index = ((ThreeLetterCode.split("(?=\\p{Upper})")).length)+1;
                    System.out.println(error_index);
                    ThreeLetterCode = null;
                    throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown 1 letter aminoacid in this sequence, at location: "+error_index);
                }
            }else{
                if((String)table.get(Letter.toUpperCase()) != null){
                    ThreeLetterCode += (String)table.get(Letter.toUpperCase());
                }else{
                    error_index = (ThreeLetterCode.length()/3)+1;
                    System.out.println("Error index: "+error_index);
                    ThreeLetterCode = null;
                    throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown 1 letter aminoacid in this sequence, at location: "+error_index);
                }
            }
        }
        return ThreeLetterCode;
    }
    
    /**
     *
     * @param Seq The three letter peptide sequence as a String
     * @return The one letter peptide sequence (String)
     * @throws UnknownAminoacidException If there is an unknown aminoacid in the sequence.
     */
    public static String getSequenceOne(String Seq) throws UnknownAminoacidException{
        int error_index;
        String OneLetterCode = "";
         java.util.Map table = new HashMap(); //Codon table declaration
            // <editor-fold defaultstate="collapsed" desc="Table contents">
            table.put ("Phe", "F");
            table.put ("Leu", "L");
            table.put ("Ala", "A");
            table.put ("Arg", "R");
            table.put ("Asn", "N");
            table.put ("Asp", "D");
            table.put ("Cys", "C");
            table.put ("Gln", "Q");
            table.put ("Glu", "E");
            table.put ("Gly", "G");
            table.put ("His", "H");
            table.put ("Ile", "I");
            table.put ("Lys", "K");
            table.put ("Met", "M");
            table.put ("Pro", "P");
            table.put ("Ser", "S");
            table.put ("Thr", "T");
            table.put ("Trp", "W");
            table.put ("Tyr", "Y");
            table.put ("Val", "V");
            // </editor-fold>
        
        
        
        for (String Abr:Seq.split("(?<=\\G...)")){
            if((String)table.get(Abr) != null){
                OneLetterCode += (String)table.get(Abr);
            }else{
                error_index = OneLetterCode.length()+1;
                OneLetterCode = null;
                throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown 3 letter aminoacid in this sequence, at location: "+error_index);
            }   
        }
        return OneLetterCode;
    }
    
    /**
     *
     * @param Seq The one letter peptide sequence as a String 
     * @return A double[] which contains the two polarity percentages
     * <p>[0] = The percentage of polar aminoacids in the sequence.
     * <p>[1] = The percenatge of apolar aminoacids in the sequence.
     * @throws UnknownAminoacidException If there is an unknown aminoacid in the sequence.
     */
    public static double[] getPolarity(String Seq) throws UnknownAminoacidException{
        java.util.HashMap Polarity_table = new HashMap();
        // <editor-fold defaultstate="collapsed" desc="Polarity Table">
        Polarity_table.put("A", 0.0);
        Polarity_table.put("R", 1.0);
        Polarity_table.put("N", 1.0);
        Polarity_table.put("D", 1.0);
        Polarity_table.put("C", 1.0);
        Polarity_table.put("F", 0.0);
        Polarity_table.put("Q", 1.0);
        Polarity_table.put("E", 1.0);
        Polarity_table.put("G", 1.0);
        Polarity_table.put("H", 1.0);
        Polarity_table.put("I", 0.0);
        Polarity_table.put("L", 0.0);
        Polarity_table.put("K", 1.0);
        Polarity_table.put("M", 0.0);
        Polarity_table.put("P", 0.0);
        Polarity_table.put("S", 1.0);
        Polarity_table.put("T", 1.0);
        Polarity_table.put("W", 0.0);
        Polarity_table.put("Y", 1.0);
        Polarity_table.put("V", 0.0); // 20 aminoacids with if they are polar (1) or not (0)
        // </editor-fold>
        
        double Polarity_number = 0.0;
        String[] AminoArray = Seq.split("(?<=\\G.)");
        double Polar_perc, Apolar_perc;
        
        
        
        for(String Acid:AminoArray){
            if(!Double.isNaN((double)Polarity_table.get(Acid))){
                Polarity_number += (double)Polarity_table.get(Acid);
            }else{
                throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown aminoacid in this sequence.");
            }
        }
        
        Polar_perc = (Polarity_number / AminoArray.length)*100;
        Apolar_perc = 100 - Polar_perc;
        double[] Polarity_array = {Polar_perc, Apolar_perc};
        
        //System.out.println(Polarity_number+" "+AminoArray.length+" "+Polar_perc+" "+Apolar_perc);

        return Polarity_array;   
    }
    
    /**
     *
     * @param Seq The one letter peptide sequence (String)
     * @return A double[] which contains the 4 values.
     * <p>[0] = Charge number (double), a positive number indicates that the protein contains more positive aminoacids then negative, negative the other way around and 0.0 that the number of negative and positive aminoacids are the same.
     * <p>[1] = Positive (double), the amount of positive aminoacids in the sequence.
     * <p>[2] = Neutral (double), the amount of neutral aminoacids in the sequence.
     * <p>[3] = Negative (double), the amount of negative aminoacids in the sequence.
     * @throws UnknownAminoacidException If there is an unknown aminoacid in the sequence.
     */
    public static double[] getCharges(String Seq) throws UnknownAminoacidException{
        java.util.HashMap Charge_table = new HashMap();
        //<editor-fold defaultstate="collapsed" desc="Charge table">
        Charge_table.put("A", 0.0);
        Charge_table.put("R", 1.0);
        Charge_table.put("N", 0.0);
        Charge_table.put("D", -1.0);
        Charge_table.put("C", 0.0);
        Charge_table.put("F", 0.0);
        Charge_table.put("Q", 0.0);
        Charge_table.put("E", -1.0);
        Charge_table.put("G", 0.0);
        Charge_table.put("H", 1.0);
        Charge_table.put("I", 0.0);
        Charge_table.put("L", 0.0);
        Charge_table.put("K", 1.0);
        Charge_table.put("M", 0.0);
        Charge_table.put("P", 0.0);
        Charge_table.put("S", 0.0);
        Charge_table.put("T", 0.0);
        Charge_table.put("W", 0.0);
        Charge_table.put("Y", 0.0);
        Charge_table.put("V", 0.0); // 20 aminoacids with if they are positive (1), neutral(0) and negative (-1)
        //</editor-fold>
    
        double Charge_number = 0.0;
        String[] AminoArray = Seq.split("(?<=\\G.)");
        double Positive = 0, Neutral = 0, Negative = 0;
        
        for(String Acid:AminoArray){
            if(!Double.isNaN((double)Charge_table.get(Acid))){
                Charge_number += (double)Charge_table.get(Acid);
                if((double)Charge_table.get(Acid) == -1.0){
                    Negative++;
                }else if((double)Charge_table.get(Acid) == 1.0){
                    Positive++;
                }else{
                    Neutral++;
                }
            }else{
                throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown aminoacid in this sequence.");
            }
        }
        
        double[] Charge_Array = {Charge_number, Positive, Neutral, Negative};

        return Charge_Array;
    }
    
    /**
     *
     * @param Seq The one letter peptide sequence. (String)
     * @return List of doubles containing the Hydropathy values.
     * @throws NotCodingPeptideException If the sequence does not start with "M".
     * @throws UnknownAminoacidException If the sequence contains an unknown aminoacid.
     */
    public static List<Double> getHydropathy(String Seq) throws NotCodingPeptideException, UnknownAminoacidException{
        
        java.util.HashMap Hydro_table = new HashMap();
        //<editor-fold defaultstate="collapsed" desc="Hydropaty table">
        Hydro_table.put("I",-0.528);
        Hydro_table.put("L",-0.342);
        Hydro_table.put("F",-0.370);
        Hydro_table.put("V",-0.308);
        Hydro_table.put("M",-0.324);
        Hydro_table.put("P",-0.322);
        Hydro_table.put("W",-0.270);
        Hydro_table.put("H",2.029);
        Hydro_table.put("T",0.853);
        Hydro_table.put("E",3.173);
        Hydro_table.put("Q",2.176);
        Hydro_table.put("C",0.081);
        Hydro_table.put("Y",1.677);
        Hydro_table.put("A",-0.495);
        Hydro_table.put("S",0.936);
        Hydro_table.put("N",2.354);
        Hydro_table.put("D",9.573);
        Hydro_table.put("R",4.383);
        Hydro_table.put("G",0.386);
        Hydro_table.put("K",2.101);
        //</editor-fold>
        
        if(!Seq.startsWith("M")){
            throw new NotCodingPeptideException("NotPeptideException Occurred:\nThis sequence doesnt start with Methione (M)");
        }
        
        List<Double> HydroArrayList = new ArrayList<>(Seq.length());
        String[] AminoArray = Seq.split("(?<=\\G.)");
        
        for(String Acid:AminoArray){
            if(!Double.isNaN((double)Hydro_table.get(Acid))){
                HydroArrayList.add((double)Hydro_table.get(Acid));
            }else{
                throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown aminoacid in this sequence.");
            }
        }        
        return HydroArrayList;
    }
    
    /**
     *
     * @param Seq The one letter peptide sequence. (String)
     * @return List of "Pho", "Phi" and "Neu" for each aminoacid in the sequence.
     * @throws UnknownAminoacidException If the sequence contains an unknown aminoacid.
     */
    public static List<String> getHydrophobicities(String Seq) throws UnknownAminoacidException{
        java.util.HashMap Phobicity_table = new HashMap(); // pH 7 values: http://www.sigmaaldrich.com/life-science/metabolomics/learning-center/amino-acid-reference-chart.html#hydro
        //<editor-fold defaultstate="collapsed" desc="Hydrophobicity table">
        Phobicity_table.put("L", "Pho");
        Phobicity_table.put("I", "Pho");
        Phobicity_table.put("F", "Pho");
        Phobicity_table.put("W", "Pho");
        Phobicity_table.put("V", "Pho"); // Hydrophobic
        Phobicity_table.put("M", "Pho");
        Phobicity_table.put("C", "Pho");
        Phobicity_table.put("Y", "Pho");
        Phobicity_table.put("A", "Pho");
        
        Phobicity_table.put("T", "Neu");
        Phobicity_table.put("H", "Neu");
        Phobicity_table.put("G", "Neu"); // Neutral
        Phobicity_table.put("S", "Neu");
        Phobicity_table.put("Q", "Neu");
        
        Phobicity_table.put("R", "Phi");
        Phobicity_table.put("K", "Phi");
        Phobicity_table.put("N", "Phi"); // Hyrophilic
        Phobicity_table.put("E", "Phi");
        Phobicity_table.put("P", "Phi");
        Phobicity_table.put("D", "Phi");
        //</editor-fold>
        

        List<String> Phobicity_List = new ArrayList<>(Seq.length() );
        String[] AminoArray = Seq.split("(?<=\\G.)");
        
        for(String Acid:AminoArray){
            if((String)Phobicity_table.get(Acid) != null){
                Phobicity_List.add((String)Phobicity_table.get(Acid));
            }else{
                throw new UnknownAminoacidException("UnknownAminoacidException Occurred:\nThere is an unknown aminoacid in this sequence.");
            }
        }
        
        
        return Phobicity_List;
        
        
    }
    
    /**
     *
     * @param Seq The DNA sequence as a String
     * @return The RNA sequence as a String
     * @throws UnknownNucleotideError If the sequence contains an unknown aminoacid.
     */
    public static String getRNA(String Seq) throws UnknownNucleotideError{
        String RNA= null;
        if(Seq.matches(".*[ATCG].*")){
            RNA = Seq.replace("T", "U");   
        }else{
            throw new UnknownNucleotideError("UnknownNucleotideError Occurred:\nThere is an unknown nucleotide in this sequence.");
        }

        return RNA;
    }
    
    /**
     *
     * @param Seq The DNA sequence as a String.
     * @return The protein sequence in one-letter codes (String)
     * @throws UnknownNucleotideError If there is a letter other than ATGC in the sequence
     * @throws NotAFullProteinError If the sequence is not dividable by 3.
     */
    public static String getProtein(String Seq) throws UnknownNucleotideError, NotAFullProteinError{
            String Protein = "";
            Integer Start_Codon;
            Seq = Seq.toUpperCase();
            

            java.util.Map table = new HashMap(); //Codon table declaration
            // <editor-fold defaultstate="collapsed" desc="DNA -> Protein table">
            table.put ("TTT", "F");
            table.put ("TTC", "F");
            table.put ("TTA", "L");
            table.put ("TTG", "L");
            table.put ("TCT", "S");
            table.put ("TCC", "S");
            table.put ("TCA", "S");
            table.put ("TCG", "S");
            table.put ("TAT", "Y");
            table.put ("TAC", "Y");
              //            TAA end
              //            TAG end
            table.put ("TGT", "C");
            table.put ("TGC", "C");
              //            TGA end
            table.put ("TGG", "W");
            table.put ("CTT", "L");
            table.put ("CTC", "L");
            table.put ("CTA", "L");
            table.put ("CTG", "L");
            table.put ("CCT", "P");
            table.put ("CCC", "P");
            table.put ("CCA", "P");
            table.put ("CCG", "P");
            table.put ("CAT", "H");
            table.put ("CAC", "H");
            table.put ("CAA", "Q");
            table.put ("CAG", "Q");
            table.put ("CGT", "R");
            table.put ("CGC", "R");
            table.put ("CGA", "R");
            table.put ("CGG", "R");
            table.put ("ATT", "I");
            table.put ("ATC", "I");
            table.put ("ATA", "I");
            table.put ("ATG", "M");
            table.put ("ACT", "T");
            table.put ("ACC", "T");
            table.put ("ACA", "T");
            table.put ("ACG", "T");
            table.put ("AAT", "N");
            table.put ("AAC", "N");
            table.put ("AAA", "K");
            table.put ("AAG", "K");
            table.put ("AGT", "S");
            table.put ("AGC", "S");
            table.put ("AGA", "R");
            table.put ("AGG", "R");
            table.put ("GTT", "V");
            table.put ("GTC", "V");
            table.put ("GTA", "V");
            table.put ("GTG", "V");
            table.put ("GCT", "A");
            table.put ("GCC", "A");
            table.put ("GCA", "A");
            table.put ("GCG", "A");
            table.put ("GAT", "D");
            table.put ("GAC", "D");
            table.put ("GAA", "E");
            table.put ("GAG", "E");
            table.put ("GGT", "G");
            table.put ("GGC", "G");
            table.put ("GGA", "G");
            table.put ("GGG", "G");
            // Source: http://gaggle.systemsbiology.net/svn/gaggle/gaggle/branches/original/org/systemsbiology/gaggle/geese/sequence/CodonTable.java
            // </editor-fold>

            if(Seq.matches(".*[ATCG].*")){
                Start_Codon = Seq.indexOf("ATG"); 
                /*
                This can give a StringIndexOutOfBoundsException Exception, which means there is no protein to be gotten. 
                And is therefore useless, and the header and value gets skipped if thrown
                */         
                String string_aug = Seq.substring(Start_Codon,Seq.length());
                String[] Splitted_codons = string_aug.split("(?<=\\G...)");
                //System.out.println(header+"\n"+java.util.Arrays.toString(Splitted_codons));


                for (String codon:Splitted_codons){ //Translation loop
                    if(codon.equals("TAA")){
                        break;
                    }else if(codon.equals("TAG")){
                        break;
                    }else if(codon.equals("TGA")){
                        break;
                    }else if(codon.length() < 3){//The way the string is splitted means there can be "codons" with a length less than 3, if this is true, there is no (full) protein.
                        throw new NotAFullProteinError("<html><body>NotAFullProteinError Occurred:<br>This DNA sequence cannot be translated into a protein sequence.</body></html>");
                    }else{
                        Protein += (String)table.get(codon);
                    }
                }
            }else{
                throw new UnknownNucleotideError("UnknownNucleotideError Occurred:\nThere is an unknown nucleotide in this sequence.");
            }
            
        return Protein;
    }
    
    /**
     *
     * @param Fasta The fasta sequence with linebreaks.
     * @return A String with the linebreaks removed in the given sequence.
     * @throws IncorrectFileFormatError If the first character of the input does not match the greater than sign.
     */
    public static String removeBreaklines(String Fasta) throws IncorrectFileFormatError{
        String[] Lines = Fasta.split("\\n");
        String Fixed_Fasta = "";
        
        if(!Lines[0].startsWith(">")){
            throw new IncorrectFileFormatError("IncorrectFileFormatError occurred:\nThe input does not start with a '>'");
        }
        
        for (String line: Lines){
            if (line.startsWith(">")){
                Fixed_Fasta += (line+"\n");
            }else if(!line.startsWith(">")){
                Fixed_Fasta += (line);
            }
        } 
        return Fixed_Fasta;
    }
    
    /*
    public String ProteinSequence(String Seq){
        String ProteinSequence = "";
        int Index_M = Seq.indexOf("M");
        
        
        
        return ProteinSequence;
    }*/
        
}

/* Custom Exceptions */

class UnknownAminoacidException extends Exception{
    String str1;
    
    UnknownAminoacidException() {
        super();
    }

    public UnknownAminoacidException(String str2){
        super(str2);
        str1 = str2;
    }
    @Override
    public String toString() {
        System.out.println(str1);
        return (str1);
    }
}

class NotCodingPeptideException extends Exception{
    String str1;

    NotCodingPeptideException() {
        super();
    }
    
    public NotCodingPeptideException(String str2){
        super(str2);
        str1 = str2;
    }
    
    @Override
    public String toString(){
        System.out.println(str1);
        return str1;
    }  
}

class UnknownNucleotideError extends Exception{
    String str1;

    UnknownNucleotideError() {
        super();
    }

    public UnknownNucleotideError(String str2) {
        super(str2);
        str1 = str2;
    }
    
    @Override
    public String toString(){
        System.err.println(str1);
        return str1;
    }  
}

class NotAFullProteinError extends Exception{
    String str1;

    NotAFullProteinError() {
        super();
    }

    public NotAFullProteinError(String str2) {
        super(str2);
        str1 = str2;
    }
    
    @Override
    public String toString(){
        System.err.println(str1);
        return str1;  
    }   
}

class IncorrectFileFormatError extends Exception{
    String str1;

    IncorrectFileFormatError() {
        super();
    }

    public IncorrectFileFormatError(String str2) {
        super(str2);
        str1 = str2;
    }
    
    @Override
    public String toString(){
        System.err.println(str1);
        return str1;  
    }   
}


