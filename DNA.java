public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGTATCGTAGCTAGCTAGCTAGCTAGCTAGCTGA";
        String dna2 = "ATGCGATACGTATCGTAGCTAGCTAGCTAGCTAGCTAGCTG";
        String dna3 = "ATGCGATACGTATCGTAGCTAGCTAGCTAGCTAGCTAGCTGATG";
        
        String dna = dna3; 
        
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA", startCodon + 3);
        
        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("Contém uma proteína.");
        } else {
            System.out.println("Sem proteína.");
        }
    }
}