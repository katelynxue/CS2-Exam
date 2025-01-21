public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int pDefenseLevel, int pNumberOfSupplies){
        defenseLevel = pDefenseLevel;
        numberOfSupplies = pNumberOfSupplies;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getNumberOfSupplies() {
        return numberOfSupplies;
    }

    public void setNumberOfSupplies(int numberOfSupplies) {
        this.numberOfSupplies = numberOfSupplies;
    }
    public void printInfo(){
        System.out.println("Defense level :" + defenseLevel + " number of supplies: " + numberOfSupplies);
    }
}
