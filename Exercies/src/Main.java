import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Question 1
        System.out.println("Question 1: \n");
        System.out.println("Please Enter your weight");
        int weight = input.nextInt();
        System.out.println("Please Enter your height");
        double height = input.nextDouble();
        double bmi = weight / (height * height);

        System.out.println("weight =" + weight + "  "+ "height =" +height+ "\nbmi = "+bmi);


        //Question 2
        System.out.println("\nQuestion 2: \n");
        System.out.println("Please Enter obtained mark");
        int obtainedMark = input.nextInt();
        System.out.println("Please Enter total mark");
        int totalMark = input.nextInt();
        double percentage = (obtainedMark * totalMark) / totalMark;
        System.out.println("obtainedMark =" + obtainedMark + "  "+ "totalMark =" +totalMark+ "\npercentage = "+percentage+"%");


        //Question 3
        System.out.println("\nQuestion 3: \n");
        System.out.println("Please Enter the amount of usd");
        int amount_USD = input.nextInt();
        double usdTOeur_exchangeRATE;
        System.out.println("Enter exchange rate: ");
        usdTOeur_exchangeRATE = input.nextDouble();
        double amount_EUR = amount_USD * usdTOeur_exchangeRATE;
        System.out.println("amount_USD =" + amount_USD + "  "+ "exchange rate =" +usdTOeur_exchangeRATE+ "\namount_EUR = "+amount_EUR);


        //Question 4
        System.out.println("\nQuestion 4: \n");

        StringBuilder word = new StringBuilder("Hello, World!");
        StringBuilder word_reverse = word.reverse();
        System.out.println("Length of the String ="+word.length() +"\n"+"And reversed String: "+ word_reverse);

        //Question 5
        System.out.println("\nQuestion 5: \n");

        System.out.println("please enter the sentence");
        input.nextLine();
        String sentence = input.nextLine();




        System.out.println("please enter the index of start substring: ");
        int start_Substring = input.nextInt();

        System.out.println("please enter the index of end substring: ");
        int end_Substring = input.nextInt();
        if (start_Substring<sentence.length() && end_Substring<sentence.length()){


            System.out.println(sentence.substring(start_Substring,end_Substring));
        }else {
            System.out.println("the index of substring either larger or smaller than the length" +
                    " of the sentence.");
        }

        input.nextLine();

        //Question 6
        System.out.println("\nQuestion 6: \n");

        System.out.println("Enter the sentence");

        String sentence_1 = input.nextLine();


        System.out.println("Enter the keyword");

        String keyword = input.nextLine();

        boolean check = sentence_1.contains(keyword);



        if (check){
            System.out.println("Keyword "+  '"' + keyword +'"'+ " is persent in the sentence");
        }else
        {
            System.out.println("Keyword " + '"' + keyword +'"' + " is not persent in the sentence");

        }


        //Question 7
        System.out.println("\nQuestion 7: \n");

        System.out.println("Enter the sentence");
        String sentence_2 = input.nextLine();
        System.out.println("Before replace: " + sentence_2);

        System.out.println("Enter the first word you want to replace");
        String word_1 = input.nextLine();


        String replace = "";
        if(sentence_2.contains(word_1)){
            System.out.println("Enter the second word to replace it with first word");
            String word_2 = input.nextLine();

            replace = sentence_2.replace(word_1, word_2);

        }else{
            System.out.println("the word you entered is not in the sentence");
        }

        System.out.println("After replace: " + replace);





        //Question 8
        System.out.println("\nQuestion 8: \n");

        System.out.println("Enter first word");
        String first_word = input.nextLine();
        System.out.println("Enter second word");
        String second_word = input.nextLine();
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