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
        five.times(2);
        assertEquals(10, five.amount);
    }

    class Dollar{

        int amount;
        Dollar(int amount){
            this.amount = amount;
        }

        void times(int multiplier){
            amount *= multiplier;
        }
    }
}
