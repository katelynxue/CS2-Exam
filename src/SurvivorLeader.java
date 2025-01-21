public class SurvivorLeader {
    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";
    public Shelter[] shelters;

    public static void main(String[] args) {
        SurvivorLeader leader = new SurvivorLeader();
    }

    public SurvivorLeader(){
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");

        shelters = new Shelter[40];
        for(int i = 0; i < 40; i++) {
            int d = (int) (Math.random() * 101)+1;
            int s = (int) (Math.random() * 1001);
            shelters[i] = new Shelter(d, s);
        }

        displayShelters();
        boolean c = checkSupplies();
        System.out.println("It is " + c + " that at least two values are equal");
        checkSupplies();
        decipher(transmission);
    }

    public void displayShelters(){
        for(int i = 0; i <40; i++){
            shelters[i].printInfo();
        }
    }

    public boolean checkSupplies(){
        boolean sameSupplies = false;
        for(int i = 0; i < shelters.length; i++){
            for(int x = 0; x < shelters.length; x++){
                if(shelters[i].getNumberOfSupplies() == shelters[x].getNumberOfSupplies() && i != x){
                    sameSupplies = true;
                }
            }
        }
        if(sameSupplies = true){
            return true;
        }
        else {
            return false;
        }
    }

    public String decipher(String transmission){
        String decoded = "";
        System.out.println(transmission);

        int al = transmission.indexOf("5");
        while(al > 0 ){
            String sub = transmission.substring(al+1,al+2);
            decoded += sub;
            al = transmission.indexOf("5",al+1);

        }
        System.out.println(decoded);
        return decoded;
    }
}

