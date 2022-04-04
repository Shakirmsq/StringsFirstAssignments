
/**
 * Write a description of Part1 here.
 * 
 * @author Mohamed Shakir 
 * @version  1.0.0 (1st April, 2022)
 */

import edu.duke.*;
import java.io.File;

//This is the class of project finding a Gene.
public class Part1 {
 //This is the method for finding a simple gene (start(ATG) and end(TAA) and has
 // no. of letters in multiple of 3(codon).
 // MY Error: input String dna not only dna(define its datatype). Also can say initialization of result.
    public String findSimpleGene(String dna){
        //MY Error: String output for return which is empty.
        String result = "";
        //(Start Codon)Variable containg the position of first occuring "ATG" in dna.
      int startIndex = dna.indexOf("ATG");
      // if no "ATG".
      if (startIndex == -1){
        return result;
        }
        // Take "TAA" that comes after the "ATG" by using inbuilt string method: obj.indexOf( find TAA, From startIndex+3(including self));
      int stopIndex = dna.indexOf("TAA", startIndex+3);
      //if no "TAA".
      if (stopIndex == -1){
        return result;
        }
        
        //String of gene from "ATG" to "TAA".
        String gene = dna.substring(startIndex,stopIndex+3);
        //Calculating if gene is multiple of 3(codon).
        int g= gene.length();
        if((g%3)==0){
           result = gene;
        }
        else{
            result = "";
        }
        //obj.substring(a(including a), b(exlcuding b));  due to exlusion of b, we add +3 in indexes to include stopindex.
        return result;
    }

    public void testSimpleGene(){

    String dna = "ATACGGTAACGA";
        System.out.println("DNA strand is " + dna);
        //my error to find how to use call method with multiple string parameters.
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
    dna = "CGATGCCTAGCGAT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
    dna = "CTGATGCTGATCCGATAACTCGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
    dna = "ACTGATGTACGTACCGATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
    dna = "GTCATAGCCTAGATT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
}


public static void main (String[] args) {
        Part1 obj = new Part1();
        obj.testSimpleGene();
   
}
}



