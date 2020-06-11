package by.epamtc.task02_9;

import by.epamtc.task02_9.dto.DividedStringsEvenAndOddDTO;
import by.epamtc.task02_9.dto.PercentageOfUppercaseAndLowercaseDTO;

public class Task1 {
    private Task1() {
    }

    /**
     * Четные и нечетные символы разделить по разным строкам
     */

    public static DividedStringsEvenAndOddDTO divideEvenAndOddCharactersIntoDifferentStrings(String sourceString) {
        StringBuilder oddChars = new StringBuilder();
        StringBuilder evenChars = new StringBuilder();
        char currentChar;

        for (int i = 0; i < sourceString.length(); i++) {

            currentChar = sourceString.charAt(i);

            if ((i % 2) == 0) {
                oddChars.append(currentChar);
            } else {
                evenChars.append(currentChar);
            }

        }
        return new DividedStringsEvenAndOddDTO(evenChars.toString(), oddChars.toString());
    }

    /**
     * Процентное соотношение строчных и прописных букв
     */

    public static PercentageOfUppercaseAndLowercaseDTO percentageOfUppercaseAndLowercaseLetters(String sourceString) {
        char currentChar;
        int countOfLetters = 0;
        double countOfUpperCase = 0;
        double percentageOfUpperCase;

        for (int i = 0; i < sourceString.length(); i++) {
            currentChar = sourceString.charAt(i);

            if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'а' && currentChar <= 'я')) {
                countOfLetters++;
            }
            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'А' && currentChar <= 'Я')) {
                countOfUpperCase++;
                countOfLetters++;
            }
        }

        percentageOfUpperCase = countOfUpperCase / countOfLetters * 100;

        return new PercentageOfUppercaseAndLowercaseDTO(
                100 - (int) percentageOfUpperCase, (int) percentageOfUpperCase);
    }

    /**
     * Удаление одинаковых символов
     */

    public static String deleteIdenticalCharacters(String sourceString) {
        String result;

        result = new StringBuilder(sourceString)
                .reverse().toString()
                .replaceAll("(.)(?=.*\\1)", "");

        result = new StringBuilder(result).reverse().toString();

        return result;
    }

    /**
     * Частота встречаемости символа в строке
     */

    public static int getFrequencyOfOccurrenceOfCharacter(String sourceString, char character) {
        int frequencyOfOccurrence = 0;
        char currentChar;

        for (int i = 0; i < sourceString.length(); i++) {
            currentChar = sourceString.charAt(i);
            if (currentChar == character) {
                frequencyOfOccurrence++;
            }
        }
        return frequencyOfOccurrence;
    }

    /**
     * Переворот строки
     */

    public static String reverseString(String sourceString) {
        return new StringBuilder(sourceString)
                .reverse()
                .toString();
    }

    /**
     * Вставка подстроки
     */

    public static String insertSubstringInString(String sourceString, int indexToInsert, String substring) {
        if (indexToInsert <= sourceString.length()) {
            return new StringBuilder(sourceString)
                    .insert(indexToInsert, substring)
                    .toString();
        }
        return sourceString;
    }

    /**
     * Удаление подстроки
     */

    public static String removeSubstring(String sourceString, int removeFrom, int removeTo) {
        if (removeFrom >= 0 && removeTo <= sourceString.length() && removeFrom <= removeTo) {
            return new StringBuilder(sourceString)
                    .replace(removeFrom, removeTo, "")
                    .toString();
        }
        return sourceString;
    }

    /**
     * Копирование части строки
     */

    public static String copySubstring(String sourceString, int copyFrom, int copyTo) {
        if (copyFrom >= 0 && copyTo <= sourceString.length() && copyFrom <= copyTo) {
            return sourceString.substring(copyFrom, copyTo);
        }
        return null;
    }

    /**
     * Определение длины строки
     */

    public static int getStringLength(String sourceString) {
        return sourceString.length();
    }

    /**
     * Количество вхождений подстроки в строку
     */

    public static int getFrequencyOfOccurrenceOfSubstring(String sourceString, String substring) {
        int lengthWithoutSubstring;
        lengthWithoutSubstring = sourceString.replaceAll(substring, "").length();
        return (sourceString.length() - lengthWithoutSubstring) / substring.length();
    }

    /**
     * Вывести слова строки в обратном порядке
     */

    public static String reverseWordsInString(String sourceString) {
        String[] words = sourceString.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString();
    }

    /**
     * Заменить пробел и группы пробелов символом "*"
     */

    public static String replaceSpaces(String sourceString) {
        return sourceString.replaceAll("\\s+", "*");
    }

    /**
     * Заменить в самом длинном слове строки буквы 'a' на 'b'
     */

    public static String replaceAWithBInLongestWord(String sourceString) {
        String[] words = sourceString.split("[\\d\\W]+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String temp;
        temp = longestWord.replaceAll("a", "b");

        return sourceString.replaceAll(longestWord, temp);
    }

    /**
     * Определить длину самого короткого слова в строке
     */

    public static int getShortestWordLength(String sourceString) {
        String[] words = sourceString.split("[\\d\\W]+");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord.length();
    }

    /**
     * Подсчет количества слов в строке
     */

    public static int getCountOfWords(String sourceString) {
        return sourceString.split("[\\d\\W]+").length;
    }

    /**
     * Поменять слова местами
     */

    public static String rearrangeWords(String sourceString, String firstWord, String secondWord) {

        if (!sourceString.contains(firstWord) || !sourceString.contains(secondWord)) {
            return sourceString;
        }

        String first = firstWord;
        String second = secondWord;

        if (sourceString.indexOf(firstWord) > sourceString.indexOf(secondWord)) {
            first = secondWord;
            second = firstWord;
        }

        int firstFromIndex;
        int firstToIndex;
        int secondFromIndex;
        int secondToIndex;
        firstFromIndex = sourceString.indexOf(first);
        firstToIndex = sourceString.indexOf(first) + first.length();
        secondFromIndex = sourceString.indexOf(second);
        secondToIndex = sourceString.indexOf(second) + second.length();

        return sourceString.substring(0, firstFromIndex) +
                second +
                sourceString.substring(firstToIndex, secondFromIndex) +
                first +
                sourceString.substring(secondToIndex);
    }

    /**
     * Удаление последнего слова в строке
     */

    public static String removeLastWord(String sourceString) {
        return sourceString.replaceAll("(\\s\\w+$)", "");
    }

    /**
     * Добавление пробелов в строку
     */

    public static String addSpaces(String sourceString) {
        return sourceString.replaceAll(" ", "  ");
    }

    /**
     * Является ли строка палиндром?
     */

    public static boolean isPalindrome(String sourceString) {
        String reverseString;
        reverseString = new StringBuilder(sourceString)
                .reverse()
                .toString();
        return sourceString.equals(reverseString);
    }

    /**
     * Замена подстроки в строке
     */

    public static String replaceSubstring(String sourceString, int from, int to, String substring) {
        if (from < 0 || to > sourceString.length()) {
            return sourceString;
        }
        return new StringBuilder(sourceString)
                .replace(from, to, substring)
                .toString();
    }

    /**
     * Сложение очень длинных целых чисел
     */

    public static String summarizeNumbers(String firstAdding, String secondAdding) {
        String firstNumber;
        String secondNumber;

        if (firstAdding.length() > secondAdding.length()) {
            firstNumber = firstAdding;
            secondNumber = secondAdding;
        } else {
            firstNumber = secondAdding;
            secondNumber = firstAdding;
        }

        char firstNum;
        char secondNum;
        int a;
        int b;
        int temp = 0;
        int result;
        StringBuilder sum = new StringBuilder();

        for (int i = 0; i < firstNumber.length(); i++) {
            firstNum = firstNumber.charAt(firstNumber.length() - 1 - i);
            secondNum = (i < secondNumber.length()) ? secondNumber.charAt(secondNumber.length() - 1 - i) : '0';
            a = Integer.parseInt(String.valueOf(firstNum));
            b = Integer.parseInt(String.valueOf(secondNum));

            result = (a + b + temp) >= 10 ? (a + b + temp) - 10 : a + b + temp;
            temp = (a + b + temp) >= 10 ? 1 : 0;
            sum.append(result);
        }
        if (temp != 0) {
            sum.append(temp);
        }
        return sum.reverse().toString();
    }

    /**
     * Удаление из строки слов заданной длины
     */

    public static String removeWordsByLength(String sourceString,int lengthOfWord){
        return sourceString.replaceAll("\\b\\w{"+lengthOfWord+"}\\b+","").trim();
    }

    /**
     * Удаление лишних пробелов
     */

    public static String removeExtraSpaces(String sourceString){
        return sourceString.replaceAll("\\s{2,}"," ").trim();
    }

    /**
     * Выделение слов из строки
     */

    public static String[] findWords(String sourceString){
        return sourceString.split("[\\s,\".]+");
    }
}