import java.util.Scanner;

 class ReplaceIWithExclamation {
    public static void main(String[] args) {
        int n = 3; // Size of the array
        String[] countryname = new String[n];

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 country name
        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            countryname[i] = scanner.nextLine();
        }

        // Replace 'i' with '!' in each name
        
        // Display the modified country name
        System.out.println("Modified country:");
        for (String name : countryname) {
            if(name.startsWith("A")&&name.endsWith("a")){
            System.out.println(name);
            }
        }

        scanner.close();
    }
}
