package FamilyTree;

import Employe.Address;

public class People {
    final String name;
    final Gender gender;
    final People mom;
    final People dad;
    private Address address;

    public People(String name, Gender gender, People mom, People dad) {
        this.name = name;
        this.gender = gender;
        this.mom = mom;
        this.dad = dad;
    }
    public People(String name, Gender gender, People mom, People dad, Address address) {
        this(name, gender, mom, dad);
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("\n%s-s father: %s - %s-s mother: %s%s%s%s",
                this.name,
                this.dad != null ? this.dad.name : "Unknown",
                this.name,
                this.mom != null ? this.mom.name : "Unknown",
                this.dad != null ? this.dad : "",
                this.mom != null ? this.mom : "",
                this.address != null ? "\n" + this.name + "-s address:" + this.address : "");
    }
}
