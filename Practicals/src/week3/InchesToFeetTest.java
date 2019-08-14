package week3;

import org.junit.jupiter.api.Test;

class InchesToFeetTest {
    @Test
    void checkConvert(){
        InchesToFeet inchesToFeet = new InchesToFeet();
        inchesToFeet.convertAndPrint();
    }

}