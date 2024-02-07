package tombokhasznalata;

public class TombokHasznalata {

    public static void main(String[] args) {
        // Indexek:        0       1        2
        //Lista:
        String[] tomb = {"egy", "kettő", "három"};
        /* Memória címet ír ki, nem a tartalmat: 
        System.out.println("");*/
        
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        /*Tömb mérete nem váloztatható létre lehet hozni új tömböt: */
        tomb = new String[4];
            System.out.println("az üres tömb: ");
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        tomb[2] = "zwer";
        tomb[3] = "drei";
        System.out.println("részben- németül feltöltött tömb: ");
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        System.out.println("Teljesen -angolul- feltöltött tömb: ");
        tomb[0] = "one";
        tomb[1] = "two";
        tomb[3] = "tree";
        tomb[3] = "four";
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n",i, tomb[i]);
        }
        System.out.println("\null\" vagy null?");
        if("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
    }
    
}
