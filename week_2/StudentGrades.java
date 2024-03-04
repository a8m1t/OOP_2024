public class StudentGrades{
    public static void main(String[] args) {
        // Student data
        String[] names = {"asmit", "chandra", "aayam", "bibas", "kausik"};
        int[] labPoints = {43, 50, 39, 45, 48};
        int[] bonusPoints = {7, 8, 10, 6, 9};

        // Print the border
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table headers
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        // Print student data
        for (int i = 0; i < names.length; i++) {
            int totalPoints = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + totalPoints);
        }
    }
}
