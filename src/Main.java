import java.awt.image.BufferedImage;
import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Coffee machine\n");

        String[] drinks = {"Espresso", "Cappuccino", "Water"};
        int[] drinkPrices = {80, 150,20};
        int moneyAmount = 120;
        boolean canBuyAnything = false;

        try {
            BufferedImage image = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

            System.out.println(image.getWidth());
            System.out.println(image.getHeight());
        } catch (AWTException e) {
            e.printStackTrace();
        }


        for(int i = 0; i < drinks.length; i++)
        {
            if (moneyAmount >= drinkPrices[i])
            {
                System.out.println("You can buy " + drinks[i]);
                canBuyAnything = true;
            }
            //System.out.println(drinks[i] + " - " + drinkPrices[i]);
        }

        if (!canBuyAnything)
            System.out.println("You can't buy anything");

        // 20190520_214722
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String now = dateFormat.format(new Date());
        System.out.println(now);
    }
}
