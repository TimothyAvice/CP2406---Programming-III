package week7.Task2.Package;

public class UsePackage {
    public static void main(String[] args) {
        Package package1 = new Package(4, 'T');
        Package package2 = new Package(11, 'A');
        Package package3 = new Package(24, 'M');

        InsuredPackage inPackage1 = new InsuredPackage(4.88, 'T');
        InsuredPackage inPackage2 = new InsuredPackage(10.1, 'A');
        InsuredPackage inPackage3 = new InsuredPackage(23, 'M');

        System.out.println("Package 1:");
        package1.display();
        System.out.println("Package 2:");
        package2.display();
        System.out.println("Package 3:");
        package3.display();
        System.out.println("inPackage 1:");
        inPackage1.display();
        System.out.println("inPackage 2:");
        inPackage2.display();
        System.out.println("inPackage 3:");
        inPackage3.display();
    }
}
