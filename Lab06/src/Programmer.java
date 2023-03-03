public class Programmer extends Employee {
    private int happiness;

    public void coding(String str) {
        if (super.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            super.setEnergy(super.getEnergy() - 30);
            this.setHappiness(happiness - 30);
        } else {
            System.out.println("Error Error Error");
            super.setEnergy(super.getEnergy() - 30);
            this.setHappiness(happiness - 30);
        }
    }
    public void coding(char str) {
        this.coding(str + "");
    }
    public int getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
