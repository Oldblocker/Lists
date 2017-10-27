package listy;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listy {
    
    public static final String EXIT = "exit";
    
    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>();
        try(Scanner sc = new Scanner(System.in);) {
        read(sc, lst);
        }
        sumWrite(lst);
    }
    
    public static void read(Scanner sc, List<Double> lst) 
    {
        System.out.println("Podaj kolejną liczbę, lub wpisz exit by wyjść.");
        String input = sc.nextLine();
        Double number;
        if(input.equals(EXIT)) 
        {
            return;
        }
        else
        {
            try {
            number = Double.parseDouble(input);
            lst.add(number);
            }
            catch(NumberFormatException e) {
                System.err.println("Podano niewłaściwy format liczby");
            }
            read(sc, lst);
        }
        
    }
    
    public static void sumWrite(List<Double> lst) {
        double sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for(double s: lst)
        {
            sum += s;
            sb.append(s);
            sb.append("+");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
        System.out.println("Suma tych liczb wynosi: " + sum);
    }
}
