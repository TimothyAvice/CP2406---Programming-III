package week7.Task2.Package;

public class Package {
    private double weight;
    private char method;
    double cost;

    Package(double weight, char method){
        this.weight = weight;
        this.method= method;
        calculateCost();
    }

    private void calculateCost(){
        switch (method){
            case 'A':
                if (weight >= 17){
                    this.cost = 4.5;
                }
                else if (weight >= 9){
                    this.cost = 3;
                }
                else
                    this.cost = 2;
                break;
            case 'T':
                if (weight >= 17){
                    this.cost = 3.25;
                }
                else if (weight >= 9){
                    this.cost = 2.35;
                }
                else
                    this.cost = 1.5;
                break;
            case 'M':
                if (weight >= 17){
                    this.cost = 2.15;
                }
                else if (weight >= 9){
                    this.cost = 1.5;
                }
                else
                    this.cost = 0.5;
                break;
        }
    }

    public void display(){
        String shipMethod = "";
        switch (method){
            case 'A':
                shipMethod = "air";
                break;
            case 'T':
                shipMethod = "truck";
                break;
            case 'M':
                shipMethod = "mail";
                break;
        }
        System.out.format("Weight: %.2f, Shipping method: %s, Shipping cost: $%.2f\n",
                weight, shipMethod, cost);
    }
}
