import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by Gary_Pan on 4/15/2015.
 */
public class LearnBigDecimal {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        LearnBigDecimal learnBigDecimal = new LearnBigDecimal();
//        System.out.println(a.compareTo(amount));
        String abc = "[{\"video\":\"21/VIDEO/879688.01429082153779.mp4,21/IMAGE/810324.01429082160879.png\",\"contentType\":\"VIDEO\"}]";
        BigDecimal bucket = new BigDecimal(300);
        BigDecimal amount = new BigDecimal(2000),result = new BigDecimal(0);

        result = amount.divide(bucket,BigDecimal.ROUND_FLOOR);


        System.out.println("Actual PI value with no " +
                "scale defined : " + (double) 22 / 7);

        int i = 22, j = 7;
        BigDecimal a = new BigDecimal(i);
        BigDecimal b = new BigDecimal(j),
                c = new BigDecimal(0);

        c = a.divide(b, 5, BigDecimal.ROUND_FLOOR);
        System.out.println("PI value with scale 5 : "
                + c);

        BigDecimal m = new BigDecimal(i);
        BigDecimal n = new BigDecimal(j),
                o = new BigDecimal(0);

        // Creating NumberFormat class num object
        NumberFormat num = NumberFormat.getInstance();

        // Invoking .setMinimumFraction() in object num
        num.setMinimumFractionDigits(5);
        System.out.println("Formated  PI value : "
                + num.format(c));
        String versionControl = "svn";

    }

}
