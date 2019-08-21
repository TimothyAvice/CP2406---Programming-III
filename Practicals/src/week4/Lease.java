package week4;

import java.util.Scanner;

public class Lease {
    private String name;
    private int aptNum;
    private float monthRent;
    private int term;

    public Lease(String name, int aptNum, float monthRent, int term){
        setName(name);
        setAptNum(aptNum);
        setMonthRent(monthRent);
        setTerm(term);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAptNum(int aptNum) {
        this.aptNum = aptNum;
    }

    public void setMonthRent(float monthRent) {
        this.monthRent = monthRent;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public int getAptNum() {
        return aptNum;
    }

    public float getMonthRent() {
        return monthRent;
    }

    public int getTerm() {
        return term;
    }

    public void addPetFee(){
        monthRent += 10;
        explainPetPolicy();

    }

    private static void explainPetPolicy(){
        System.out.print("Pets add an additional cost");
    }
}
