import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ColaTest {

    @Test
    public void countPriceReturnsCorrectPriceWhenPriceForMillilitreIsGiven(){
    double expected_price = 1300;

    Cola cola = new Cola(1000);
    cola.price = cola.countPrice(1.3);

    assert(expected_price == cola.price);
    }
}
