package money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yb.choi on 16. 4. 19..
 */
public class MoneyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product=five.times(3);
        assertEquals(15, product.amount);
    }

    class Dollar{

        int amount;
        Dollar(int amount){
            this.amount = amount;
        }

        Dollar times(int multiplier){
            return new Dollar(amount * multiplier);
        }
    }
}