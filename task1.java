import java.util.*;

public class task1 {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("notebook1", 8, 512, "Windows", "grey");
        NoteBook noteBook2 = new NoteBook("notebook2", 32, 1024, "Windows", "black");
        NoteBook noteBook3 = new NoteBook("notebook3", 8, 256, "Windows", "red");
        NoteBook noteBook4 = new NoteBook("notebook4", 16, 512, "Linux", "grey");
        NoteBook noteBook5 = new NoteBook("notebook5", 64, 1024, "Linux", "black");
        NoteBook noteBook6 = new NoteBook("notebook6", 16, 512, "Windows", "grey");
        HashSet<NoteBook> notebooks = new HashSet<>();
        notebooks.add(noteBook1);
        notebooks.add(noteBook2);
        notebooks.add(noteBook3);
        notebooks.add(noteBook4);
        notebooks.add(noteBook5);
        notebooks.add(noteBook6);
        System.out.println("Good Day!");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of type of filter or action:");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD");
            System.out.println("3 - type os OS");
            System.out.println("4 - color");
            System.out.println("5 - multi-parameter filter");
            System.out.println("6 - Output of all notebooks");
            System.out.println("7 - exit");
            String filter1 = input.nextLine();
            if (!filter1.equals("7")) {
                switch (filter1) {
                    case ("1"):
                        filterRAM(notebooks, input);
                        break;
                    case ("2"):
                        filterHDD(notebooks, input);
                        break;
                    case ("3"):
                        filterTypeOfOS(notebooks, input);
                        break;
                    case ("4"):
                        filterColor(notebooks, input);
                        break;
                    case ("5"):
                        filter(notebooks, input);
                    case ("6"):
                        for (NoteBook elem : notebooks) {
                            System.out.println(elem);
                        }
                        break;
                    default:
                        System.out.println("Wrong command");
                        break;
                }
            } else {
                System.out.println("See you!");
                break;
            }
        }
    }


    public static void filter(HashSet<NoteBook> notebooks, Scanner input) {
        HashMap<String, String> filter = new HashMap<>();
        Boolean flag = false;
        System.out.println("Enter the minimum value of RAM");
        String minRAM = input.nextLine();
        filter.put("RAM", minRAM);
        System.out.println("Enter the minimum value of HDD");
        String minHDD = input.nextLine();
        filter.put("HDD", minHDD);
        System.out.println("Enter the type of OS");
        String typeOfOS = input.nextLine();
        filter.put("typeOfOS", typeOfOS);
        System.out.println("Enter the color");
        String color = input.nextLine();
        filter.put("color", color);
        for (NoteBook elem : notebooks) {
            if ((elem.valueOfRAM >= Integer.parseInt(filter.get("RAM"))) && (elem.valueOfHDD >= Integer.parseInt(filter.get("HDD")))
                    && (elem.typeOfOS.toLowerCase().equals(filter.get("typeOfOS").toLowerCase()))
                    && (elem.color.toLowerCase().equals(filter.get("color").toLowerCase()))) {
                System.out.println(elem);
                flag = true;
            }
        }
        if (flag == false) System.out.println("Unfortunately, we do not have such notebooks.");
    }

    public static void filterRAM(HashSet<NoteBook> notebooks, Scanner input) {
        HashMap<String, String> filter = new HashMap<>();
        Boolean flag = false;
        System.out.println("Enter the minimum value of RAM");
        String minRAM = input.nextLine();
        System.out.println("Enter the maximum value of RAM");
        String maxRAM = input.nextLine();
        for (NoteBook elem : notebooks) {
            if (elem.valueOfRAM >= Integer.parseInt(minRAM) && elem.valueOfRAM <= Integer.parseInt(maxRAM)) {
                System.out.println(elem);
                flag = true;
            }
        }
        if (flag == false) System.out.println("Unfortunately, we do not have such notebooks.");

    }

    public static void filterHDD(HashSet<NoteBook> notebooks, Scanner input) {
        HashMap<String, String> filter = new HashMap<>();
        Boolean flag = false;
        System.out.println("Enter the minimum value of HDD");
        String minHDD = input.nextLine();
        System.out.println("Enter the maximum value of HDD");
        String maxHDD = input.nextLine();
        for (NoteBook elem : notebooks) {
            if (elem.valueOfHDD >= Integer.parseInt(minHDD) && elem.valueOfHDD <= Integer.parseInt(maxHDD)) {
                System.out.println(elem);
                flag = true;
            }
        }
        if (flag == false) System.out.println("Unfortunately, we do not have such notebooks.");

    }

    public static void filterTypeOfOS(HashSet<NoteBook> notebooks, Scanner input) {
        HashMap<String, String> filter = new HashMap<>();
        Boolean flag = false;
        System.out.println("Enter the type of OS");
        String typeOfOS = input.nextLine().toLowerCase();
        for (NoteBook elem : notebooks) {
            if (elem.typeOfOS.toLowerCase().equals(typeOfOS)) {
                System.out.println(elem);
                flag = true;
            }
        }
        if (flag == false) System.out.println("Unfortunately, we do not have such notebooks.");

    }

    public static void filterColor(HashSet<NoteBook> notebooks, Scanner input) {
        HashMap<String, String> filter = new HashMap<>();
        Boolean flag = false;
        System.out.println("Enter the color");
        String color = input.nextLine().toLowerCase();
        for (NoteBook elem : notebooks) {
            if (elem.color.toLowerCase().equals(color)) {
                System.out.println(elem);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Unfortunately, we do not have such notebooks.");
        }

    }
}