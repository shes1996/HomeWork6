public class NoteBook {
    String name;
    Integer valueOfRAM;
    Integer valueOfHDD;
    String typeOfOS;
    String color;

    public NoteBook(String name, Integer valueOfRAM, Integer valueOfHDD, String typeOfOS, String color) {
        this.name = name;
        this.valueOfRAM = valueOfRAM;
        this.valueOfHDD = valueOfHDD;
        this.typeOfOS = typeOfOS;
        this.color = color;

    }

    @Override
    public String toString() {
        return String.format("%s: value of RAM - %d; value of HDD - %d; type of OS - %s; color - %s", name, valueOfRAM, valueOfHDD, typeOfOS, color);
    }
}