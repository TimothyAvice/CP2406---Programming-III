package week7.Task2.Package;

import javafx.css.converter.LadderConverter;

class InsuredPackage extends Package {

    InsuredPackage(double weight, char method) {
        super(weight, method);
        addInsurance();
    }

    private void addInsurance(){
        if (cost >= 3.01){
            cost += 5.55;
        }
        else if (cost >= 3){
            cost += 3.95;
        }
        else
            cost += 2.45;

    }
}
