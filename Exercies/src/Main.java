//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1: \n");
        int weight = 70;
        double height = 1.75;
        double bmi = weight / (height * height);

        System.out.println("weight =" + weight + "  "+ "height =" +height+ "\nbmi = "+bmi);


        //Question 2
        System.out.println("\nQuestion 2: \n");

        int obtainedMark = 85;
        int totalMark = 100;
        double percentage = (obtainedMark * totalMark) / totalMark;
        System.out.println("obtainedMark =" + obtainedMark + "  "+ "totalMark =" +totalMark+ "\npercentage = "+percentage+"%");


        //Question 3
        System.out.println("\nQuestion 3: \n");

        int amount_USD = 100;
        double usdTOeur_exchangeRATE;
        usdTOeur_exchangeRATE = 0.85;
        double amount_EUR = amount_USD * usdTOeur_exchangeRATE;
        System.out.println("amount_USD =" + amount_USD + "  "+ "usdTOeur_exchangeRATE =" +usdTOeur_exchangeRATE+ "\namount_EUR = "+amount_EUR);


        //Question 4
        System.out.println("\nQuestion 4: \n");

        StringBuilder word = new StringBuilder("Hello, World!");
        StringBuilder word_reverse = word.reverse();
        System.out.println("Length of the String ="+word.length() +"\n"+"And reversed String: "+ word_reverse);

        //Question 5
        System.out.println("\nQuestion 5: \n");

        String sentence = "The quick brown fox jumbs over the lazy dog";
        System.out.println(sentence.substring(10,20));


        //Question 6
        System.out.println("\nQuestion 6: \n");

        String sentence_1 = "The quick brown fox jumbs over the lazy dog";
        String keyword = "jumbs";

        boolean check = sentence_1.contains(keyword);

        //System.out.println(check);

        if (check){
            System.out.println("Keyword "+  '"' +keyword +'"'+ " is persent in the sentence");
        }else
        {
            System.out.println("Keyword " + '"' + keyword +'"' + " is not persent in the sentence");

        }

        //Question 7
        System.out.println("\nQuestion 7: \n");

        String sentence_2 = "The quick brown fox jumbs over the lazy dog";
        System.out.println("Before replace: " + sentence_2);

        String replace = sentence_2.replace("fox","cat");
        System.out.println("After replace: " + replace);




        //Question 8
        System.out.println("\nQuestion 8: \n");

        String first_word = "Hello";
        String second_word = "hello";
        boolean Equ = first_word.equalsIgnoreCase(second_word);
        //System.out.println(first_word.equalsIgnoreCase(second_word));


        if (Equ){
            System.out.println("Strings are equal");
        }else
        {
            System.out.println("Strings are not equal");


        }
    }



}