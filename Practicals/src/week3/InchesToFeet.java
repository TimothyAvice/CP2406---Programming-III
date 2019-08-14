package week3;

class InchesToFeet {

    void convertAndPrint(){
        int inches = 10;
        int feet = inches /12;
        int remaindingInches = inches%12;
        System.out.println("Inches " + inches);
        System.out.printf("That is equal to: %d feet %d inches", feet, remaindingInches);
    }
}