package week7.Task2.Pet;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemSold1 = new ItemSold(20, "Shampoo", 2.90);
        ItemSold itemSold2 = new ItemSold(24,"Collar", 4.80);
        System.out.println("itemSold1\nDescr: " + itemSold1.getDescription() + "\nPrice: " + itemSold1.getPrice());
        System.out.println("itemSold2\nDescr: " + itemSold2.getDescription() + "\nPrice: " + itemSold2.getPrice());

        PetSold petSold1 = new PetSold(5, "Husky", 1,
                false, false, false);
        System.out.println("petSold1\nDescr: " + petSold1.getDescription() + "\nPrice: " + petSold1.getPrice()
                + "\nVaccinated: " + petSold1.isVaccinated() + "\nNeutered: " + petSold1.isNeutered() +
                "\nHousebroken: " + petSold1.isHousebroken());
        PetSold petSold2 = new PetSold(8, "Golden retriever", 99.09,
                true, false, true);
        System.out.println("petSold2\nDescr: " + petSold2.getDescription() + "\nPrice: " + petSold2.getPrice() +
                "\nVaccinated: " + petSold2.isVaccinated() + "\nNeutered: " + petSold2.isNeutered() + "\nHousebroken: "
                + petSold2.isHousebroken());
    }
}
