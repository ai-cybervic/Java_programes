import java.util.Scanner;
public class StudentReport {w
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Reg No (Student 1): ");
        String reg1 = input.nextLine();
        System.out.print("Enter Full Name (Student 1): ");
        String name1 = input.nextLine();
        System.out.print("Enter CCS 2211: ");
        int student1_unit1 = input.nextInt();
        System.out.print("Enter CCS 2212: ");
        int student1_unit2 = input.nextInt();
        System.out.print("Enter CCS 2213: ");
        int student1_unit3 = input.nextInt();
        System.out.print("Enter CCS 2214: ");
        int student1_unit4 = input.nextInt();
        System.out.print("Enter CCS 2215: ");
        int student1_unit5 = input.nextInt();
        System.out.print("Enter CCS 2216: ");
        int student1_unit6 = input.nextInt();
        System.out.print("Enter CCS 2217: ");
        int student1_unit7 = input.nextInt();
        input.nextLine();

        int total1 = student1_unit1 + student1_unit2 + student1_unit3 + student1_unit4 + student1_unit5 + student1_unit6 + student1_unit7;
        int avg1 = total1 / 7;

        System.out.print("Enter Reg No (Student 2): ");
        String reg2 = input.nextLine();
        System.out.print("Enter Full Name (Student 2): ");
        String name2 = input.nextLine();
        System.out.print("Enter CCS 2211: ");
        int student2_unit1 = input.nextInt();
        System.out.print("Enter CCS 2212: ");
        int student2_unit2 = input.nextInt();
        System.out.print("Enter CCS 2213: ");
        int student2_unit3 = input.nextInt();
        System.out.print("Enter CCS 2214: ");
        int student2_unit4 = input.nextInt();
        System.out.print("Enter CCS 2215: ");
        int student2_unit5 = input.nextInt();
        System.out.print("Enter CCS 2216: ");
        int student2_unit6 = input.nextInt();
        System.out.print("Enter CCS 2217: ");
        int student2_unit7 = input.nextInt();
        input.nextLine();

        int total2 = student2_unit1 + student2_unit2 + student2_unit3 + student2_unit4 + student2_unit5 + student2_unit6 + student2_unit7;
        int avg2 = total2 / 7;

        System.out.print("Enter Reg No (Student 3): ");
        String reg3 = input.nextLine();
        System.out.print("Enter Full Name (Student 3): ");
        String name3 = input.nextLine();
        System.out.print("Enter CCS 2211: ");
        int student3_unit1 = input.nextInt();
        System.out.print("Enter CCS 2212: ");
        int student3_unit2 = input.nextInt();
        System.out.print("Enter CCS 2213: ");
        int student3_unit3 = input.nextInt();
        System.out.print("Enter CCS 2214: ");
        int student3_unit4 = input.nextInt();
        System.out.print("Enter CCS 2215: ");
        int student3_unit5 = input.nextInt();
        System.out.print("Enter CCS 2216: ");
        int student3_unit6 = input.nextInt();
        System.out.print("Enter CCS 2217: ");
        int student3_unit7 = input.nextInt();
        input.nextLine();

        int total3 = student3_unit1 + student3_unit2 + student3_unit3 + student3_unit4 + student3_unit5 + student3_unit6 + student3_unit7;
        int avg3 = total3 / 7;

        System.out.print("Enter Reg No (Student 4): ");
        String reg4 = input.nextLine();
        System.out.print("Enter Full Name (Student 4): ");
        String name4 = input.nextLine();
        System.out.print("Enter CCS 2211: ");
        int student4_unit1 = input.nextInt();
        System.out.print("Enter CCS 2212: ");
        int student4_unit2 = input.nextInt();
        System.out.print("Enter CCS 2213: ");
        int student4_unit3 = input.nextInt();
        System.out.print("Enter CCS 2214: ");
        int student4_unit4 = input.nextInt();
        System.out.print("Enter CCS 2215: ");
        int student4_unit5 = input.nextInt();
        System.out.print("Enter CCS 2216: ");
        int student4_unit6 = input.nextInt();
        System.out.print("Enter CCS 2217: ");
        int student4_unit7 = input.nextInt();
        input.nextLine();

        int total4 = student4_unit1 + student4_unit2 + student4_unit3 + student4_unit4 + student4_unit5 + student4_unit6 + student4_unit7;
        int avg4 = total4 / 7;

        System.out.print("Enter Reg No (Student 5): ");
        String reg5 = input.nextLine();
        System.out.print("Enter Full Name (Student 5): ");
        String name5 = input.nextLine();
        System.out.print("Enter CCS 2211: ");
        int student5_unit1 = input.nextInt();
        System.out.print("Enter CCS 2212: ");
        int student5_unit2 = input.nextInt();
        System.out.print("Enter CCS 2213: ");
        int student5_unit3 = input.nextInt();
        System.out.print("Enter CCS 2214: ");
        int student5_unit4 = input.nextInt();
        System.out.print("Enter CCS 2215: ");
        int student5_unit5 = input.nextInt();
        System.out.print("Enter CCS 2216: ");
        int student5_unit6 = input.nextInt();
        System.out.print("Enter CCS 2217: ");
        int student5_unit7 = input.nextInt();
        input.nextLine();

        int total5 = student5_unit1 + student5_unit2 + student5_unit3 + student5_unit4 + student5_unit5 + student5_unit6 + student5_unit7;
        int avg5 = total5 / 7;

        System.out.println("                                                 Dedan Kimathi University of Technology");
        System.out.println("                                                    School of Computer Science and IT");
        System.out.println("                                                     Department of Computer Science");
        System.out.println("                                                       Academic Year: 2024/2025");
        System.out.println("                                                   STUDENT MARKSHEET (SECOND YEAR RESULTS)");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Reg No.              Full Name          CCS2211   CCS2212   CCS2213   CCS2214   CCS2215   CCS2216   CCS2217      TOTALS    AVERAGE   STATUS    GRADE");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(reg1+"    "+name1+"        "+student1_unit1+"       "+student1_unit2+"         "+student1_unit3+"        "+student1_unit4+"       "+student1_unit5+"        "+student1_unit6+"         "+student1_unit7+"          "+total1+"        "+avg1);
        System.out.println(reg2+"    "+name2+"        "+student2_unit1+"       "+student2_unit2+"         "+student2_unit3+"        "+student2_unit4+"       "+student2_unit5+"        "+student2_unit6+"         "+student2_unit7+"          "+total2+"        "+avg2);
        System.out.println(reg3+"    "+name3+"        "+student3_unit1+"       "+student3_unit2+"         "+student3_unit3+"        "+student3_unit4+"       "+student3_unit5+"        "+student3_unit6+"         "+student3_unit7+"          "+total3+"        "+avg3);
        System.out.println(reg4+"    "+name4+"        "+student4_unit1+"       "+student4_unit2+"         "+student4_unit3+"        "+student4_unit4+"       "+student4_unit5+"        "+student4_unit6+"         "+student4_unit7+"          "+total4+"        "+avg4);
        System.out.println(reg5+"    "+name5+"        "+student5_unit1+"       "+student5_unit2+"         "+student5_unit3+"        "+student5_unit4+"       "+student5_unit5+"        "+student5_unit6+"         "+student5_unit7+"          "+total5+"        "+avg5);

    }
}