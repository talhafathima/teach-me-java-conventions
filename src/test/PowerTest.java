package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToPowerOneIsOne() {
        assert Power.find(1,1) == 1;
    }

    @Test
    public void twoRaisedToPowerOneIsTwo() {
        assert Power.find(2,1) == 2;
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assert Power.find(2, 2) == 4;
    }

    @Test
    public void threeRaisedToPowerTwoIsNine() {
        assert Power.find(3, 2) == 3*3;
    }
}
