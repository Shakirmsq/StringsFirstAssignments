
/**
 * Write a description of Part2 here.
 * 
 * @author Mohammed Shakir 
 * @version  2.0.0  5th April, 2022
 */

import edu.duke.*;
import java.io.File;

public class Part2{
//To do task: modify this method by adding two more parameters (startCodon and stopCodon).
    public String findSimpleGene(String dna,String startCodon,String stopCodon){
    
       
         String result = "";
        
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
        return "";
        }
        int stopIndex = dna.indexOf("TAA");
        if(stopIndex == -1){
        return "";
        }
        
        String gene = dna.substring(startIndex, stopIndex);
        int g = gene.length();
        if((g%3)==0){
        
            result = gene + stopCodon;
        }
        
        else
        { 
            result = "";
        }
        
        return result; 
    }
    
    
    public void testSimpleGene(){
        
        String startCodon = "ATG";
        String stopCodon = "TAA";
        
    String dna = "ATACGGTAACGA";
        System.out.println("DNA strand is " + dna);
        //my error to find how to use call method with multiple string parameters.
        String gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
        //Take a DNA String and assign a variable.
    dna = "CGATGCCTAGCGAT";
        // Print the DNA String to the user.
        System.out.println("DNA strand is " + dna);
        //Output of findSimpleGene method is stored in gene: which is a gene.
        //by giving dna string as a parameter.
        gene = findSimpleGene(dna,startCodon,stopCodon);
        //print that gene to the user.
        System.out.println("Gene is " + gene);
        
    dna = "CTGATGCTGATCCGATAACTCGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
    dna = "ACTGATGTACGTACCGATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
        
    dna = "GTCATAGCCTAGATT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene is " + gene);
    
        
    }
    
    public static void main(String[] args){
    Part2 obj = new Part2();
    obj.testSimpleGene();
    }
}
