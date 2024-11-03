package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] whatLet = input.split(" ");
        int isY = 0;
        int isZ = 0;
        for (String word : whatLet) {
            if (word.endsWith("z")) isZ++;
            if (word.endsWith("y")) isY++;
        }
        return isY + isZ;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String cool = base.replace(remove, "");
        return cool;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int isNum = 0;
        int notNum = 0;
        boolean ugh = false;
        String not = "not";
        String is = "is";
        //is loop
        for (int i=0;i<input.length()-1;i++) {
            String substring = input.substring(i, i + 2);
            if (substring.equals(is)) isNum++; }
        for (int i=0;i<input.length()-2;i++) {
            String substring = input.substring(i,i+3);
            if (substring.equals(not)) notNum++;
        }
        if (isNum == notNum) ugh = true;
        return ugh;

    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public boolean gIsHappy(String input) {
        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'g') {
                if(i==0){if(letters[i + 1] != 'g') { return false; }

                }else if (i==letters.length-1) {if (letters[i - 1] != 'g') {return false;}

                } else if(letters[i - 1] != 'g' && letters[i + 1] != 'g') {
                    return false;
                }
            }

        }
        return true;
    }

        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){
            return null;
       }

}