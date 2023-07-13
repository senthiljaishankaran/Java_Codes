/*
 * Removing the duplicate words in a sentence
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicate{
    public static void main(String[] args) {
        String regex ="\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
         * \\b - boundary words to check repeatability ie "My thesis is good" here is in thesis will not be compared with is
         * \\w+ - matches words [a-zA-Z0-9]
         * '+' in \\w+ -matches more than one words
         * \\W+ - Matches non character words (here also + stands for same meaning)
         * ?: - It indicates that the subpattern is a non-capture subpattern. That means whatever is matched in (?:\w+\s), 
         * even though it's enclosed by () it won't appear in the list of matches, only (\w+) will.
         * “+”: Match whatever it’s placed after 1 or more times
         * \\1 - Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
         */  

         Pattern p =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
         Scanner sc = new Scanner (System.in);
         int num_times =Integer.parseInt(sc.nextLine());
         while(num_times-- >0){
            String input =sc.nextLine();
            Matcher m =p.matcher(input);
            while(m.find()){
                input =input.replaceAll(m.group(),m.group(1));
            }
            System.out.println(input);
         }
         sc.close();
    }
}