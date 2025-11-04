public class Inventory {
    private String weapon;
    private String helm;
    private String chest;
    private String legs;

    public Inventory() {
        weapon = "None";
        helm = "None";
        chest = "None";
        legs = "None";
    }

    public void setItem(int slot, String item) {
        switch (slot) {
            case 0 -> weapon = item;
            case 1 -> helm = item;
            case 2 -> chest = item;
            case 3 -> legs = item;
            default -> System.out.println("Invalid slot!");
        }
    }

    public String getInventory() {
        return String.format("Weapon: %s | Helm: %s | Chest: %s | Legs: %s", 
                             weapon, helm, chest, legs);
    }
}
