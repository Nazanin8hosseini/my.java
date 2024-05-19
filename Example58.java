
import java.text.*;


public class Example58 {

    
    public static void main(String[] args) {
      NumberFormat formatter = NumberFormat.getNumberInstance();
      formatter.setMaximumFractionDigits(5);
      System.out.println("truncated pI " + formatter.format(Math.PI));
      NumberFormat money = NumberFormat.getCurrencyInstance();
      System.out.println("money symbol usage:" + money.format(3.53));
      NumberFormat percent = NumberFormat.getPercentInstance();
      System.out.println("percent symbul usage:" + percent.format(0.535));
      System.out.println("**N**A**Z**A**N**I**N**");
      DecimalFormat formatting = (DecimalFormat) NumberFormat.getNumberInstance();
      formatting.setDecimalSeparatorAlwaysShown(true);
      System.out.println("show decimal point always:" + formatting.format(3.0));
      formatting.setDecimalSeparatorAlwaysShown(false);
      System.out.println(" not show decimal point always:" + formatting.format(3.0));
      
    }
    
}
