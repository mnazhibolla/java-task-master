package cz.acamar.tasks;

import javafx.concurrent.Task;

import javax.swing.text.TabSet;

public class Task1 {

    public static void main(String[] args) {
        Task1 t = new Task1();
        String s = "hello w orld   ";
        System.out.println(t.lengthOfLastWord(s));
    }

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {

        int len = str.length();
        String s = "";
        boolean isWordStarted = false;
        for (int i = len - 1; i >= 0; i--){
            if(str.charAt(i) != ' '){
                s = str.charAt(i) + s;
                isWordStarted = true;
            } else if(isWordStarted){
                return s != null ? s.length() : 0;
            }
        }
        /*String[] arr = str.split(" +");
        if(arr != null && arr.length > 0){
            return arr[arr.length - 1].length();
        } */
        return 0;
    }
}
