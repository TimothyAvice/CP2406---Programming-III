package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesToFeetTest {
    @Test
    void checkConvert(){
        InchesToFeet inchesToFeet = new InchesToFeet();
        inchesToFeet.inches = 10;
        float feet = inchesToFeet.convert(inchesToFeet.inches);
        System.out.println(inchesToFeet.inches);
        System.out.println(feet);
    }

}