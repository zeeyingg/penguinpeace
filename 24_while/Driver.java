public class Driver {
    public static void main(String[] args) {

        //test default constructor
        Coin mine = new Coin();

        //test 1st overloaded constructor
        Coin yours = new Coin("quarter");

        //test 2nd overloaded constructor
        Coin wayne = new Coin("dollar", "heads");

        //test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        int numHeads, numMatches; // number of heads we want, number of matches we want
        int matchCtr = 0; // current match counter
        numHeads = 10;
        numMatches = 65536;

        while( (numHeads >= yours.getHeadsCtr() )
                || ( numMatches == matchCtr )
                || (matchCtr >= 65536 && matchCtr % 2005 == 0) )
        {
            if (yours.equals(wayne)) {
//                System.out.println("Matchee matchee!");
                numMatches++;
            } else {
//                System.out.println("No match. Firestarter you can not be.");
            }
        yours.flip();
        wayne.flip();
        }
        System.out.println("Total flips: " + yours.getFlipCtr() + "\nTotal matches: " + matchCtr + "\nTotal heads: " + numHeads);
    }
}
