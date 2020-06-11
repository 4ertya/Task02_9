package by.epamtc.task02_9;

import by.epamtc.task02_9.dto.DividedStringsEvenAndOddDTO;
import by.epamtc.task02_9.dto.PercentageOfUppercaseAndLowercaseDTO;

import java.util.Arrays;

import static by.epamtc.task02_9.Task1.*;

public class Main {
    public static void main(String[] args) {

        DividedStringsEvenAndOddDTO dividedStringsDTO;
        dividedStringsDTO = divideEvenAndOddCharactersIntoDifferentStrings("Hello Java!");
        System.out.println("Четные и нечетные символы разделить по разным строкам.");
        System.out.println("Even: " + dividedStringsDTO.stringWithEvenChar);
        System.out.println("Odd: " + dividedStringsDTO.stringWithOddChar);

        PercentageOfUppercaseAndLowercaseDTO percentage;
        percentage = percentageOfUppercaseAndLowercaseLetters("Hello Java!");
        System.out.println("\nПроцентное соотношение строчных и прописных букв.");
        System.out.println("Uppercase: " + percentage.percentageOfUppercase + "%");
        System.out.println("Lowercase: " + percentage.percentageOfLowercase + "%");

        String withoutDuplicate;
        withoutDuplicate = deleteIdenticalCharacters("Hello Java!");
        System.out.println("\nУдаление одинаковых символов.");
        System.out.println(withoutDuplicate);

        int frequencyOfOccurrence;
        frequencyOfOccurrence = getFrequencyOfOccurrenceOfCharacter("Hello Java!", 'a');
        System.out.println("\nЧастота встречаемости символа в строке.");
        System.out.println("frequency of occurrence: " + frequencyOfOccurrence);

        String reverseString;
        reverseString = reverseString("Hello Java!");
        System.out.println("\nПереворот строки.");
        System.out.println("reverse string: " + reverseString);

        String resultOfInsert;
        resultOfInsert = insertSubstringInString("Hello !", 6, "Java");
        System.out.println("\nВставка подстроки.");
        System.out.println("result string: " + resultOfInsert);

        String afterRemoval;
        afterRemoval = removeSubstring("Hello Java!", 5, 11);
        System.out.println("\nУдаление подстроки.");
        System.out.println("after replace: " + afterRemoval);

        String substring;
        substring = copySubstring("Hello Java!", 6, 10);
        System.out.println("\nКопирование подстроки.");
        System.out.println("substring: " + substring);

        int stringLength;
        stringLength = getStringLength("Hello Java!");
        System.out.println("\nОпределение длины строки.");
        System.out.println("String length: " + stringLength);

        int occurrenceOfSubstring;
        occurrenceOfSubstring = getFrequencyOfOccurrenceOfSubstring("Hello Java!Hello Java!", "Java");
        System.out.println("\nКоличество вхождений подстроки");
        System.out.println("Occurrence of substring: " + occurrenceOfSubstring);

        String reverseWords;
        reverseWords = reverseWordsInString("Hello Java");
        System.out.println("\nВывести слова строки в обратном порядке");
        System.out.println("reverse words: " + reverseWords);

        String replaceSpaces;
        replaceSpaces = replaceSpaces("Hello Java  Hello     World");
        System.out.println("\nЗаменить пробелы и группы пробелов на \"*\"");
        System.out.println("after replace spaces: " + replaceSpaces);

        String replacedAWithBInLongest;
        replacedAWithBInLongest = replaceAWithBInLongestWord("Hello Java fundamentals");
        System.out.println("\nЗаменить в самом длинном слове строки буквы 'a' на 'b'");
        System.out.println("replaced a with b in the longest word: " + replacedAWithBInLongest);

        int shortestWordLength;
        shortestWordLength = getShortestWordLength("Hello Java!");
        System.out.println("\nОпределить длину самого короткого слова в строке");
        System.out.println("length: " + shortestWordLength);

        int countOfWords;
        countOfWords = getCountOfWords("Hello Java!");
        System.out.println("\nПодсчет количества слов в строке");
        System.out.println("count: " + countOfWords);

        String rearrangeWords;
        rearrangeWords=rearrangeWords("Hello Java","Hello","Java");
        System.out.println("\nПоменять слова местами");
        System.out.println("rearrange words: "+rearrangeWords);

        String removalLastWord;
        removalLastWord=removeLastWord("Hello Java");
        System.out.println("\nУдаление последнего слова в строке");
        System.out.println("without last word: "+removalLastWord);

        String addedSpaces;
        addedSpaces=addSpaces("Hello Java");
        System.out.println("\nДобавление пробелов в строку");
        System.out.println("after adding: "+ addedSpaces);

        boolean isPalindrome;
        isPalindrome=isPalindrome("Hello olleH");
        System.out.println("\nЯвляется ли строка палиндром?");
        System.out.println("is palindrome: "+ isPalindrome);

        String stringAfterReplacing;
        stringAfterReplacing = replaceSubstring("Hello C#",6,8,"Java");
        System.out.println("\nЗамена подстроки в строке");
        System.out.println("after replacing: "+stringAfterReplacing);

        String sum;
        sum = summarizeNumbers("9999","888888");
        System.out.println("\nСложение очень длинных целых чисел");
        System.out.println("sum: "+sum);

        String afterRemovalWords;
        afterRemovalWords= removeWordsByLength("Hello Java Javaaa",6);
        System.out.println("\nУдаление из строки слов заданной длины");
        System.out.println("after removal: "+afterRemovalWords);

        String withoutExtraSpaces;
        withoutExtraSpaces = removeExtraSpaces("Hello  Java   World");
        System.out.println("\nУдаление лишних пробелов");
        System.out.println("without extra spaces: "+ withoutExtraSpaces);

        String [] words;
        words = findWords("Hello Java");
        System.out.println("\nВыделение слов из строки");
        System.out.println("words: "+ Arrays.toString(words));
    }
}
