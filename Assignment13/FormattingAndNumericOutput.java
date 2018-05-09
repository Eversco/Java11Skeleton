import java.text.*;

public class FormattingAndNumericOutput {
    public static void main(String[] args){
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");//how many decimals are goin in there is the amount of 0. The 0's before the dot doesn't matter
        
        DecimalFormat lotsOfZeroes = new DecimalFormat("0000000.0000000"); // Same thing as the last one
        
        DecimalFormat standardIntFormat = new DecimalFormat("###0");// # allows the number 
        
        System.out.println(moneyFormat.format(273623.49f));// numbers printed. Any numbers after 9 cannot be printed and will be rounded
        System.out.println(standardIntFormat.format(200));// Number printed
        System.out.println(lotsOfZeroes.format(4262412.52635));
    }
}