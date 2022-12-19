package FamilyTree;

import Employe.Address;

public class FamilyTree {
    public static void main(String[] args) {
        Address address = new Address("Hungary", "Vác", "Arany János", 2341,21);
        People kira = new People("Kíra", Gender.WOMAN, null,null);
        People janó = new People("Janó", Gender.MAN, null, null);
        People hugo = new People("Hugo", Gender.MAN, null, null);
        People mariann = new People("Mariann", Gender.WOMAN, kira,janó, address);
        People peter = new People("Péter", Gender.MAN, mariann, hugo);
        People gabi = new People("Gabi", Gender.WOMAN, null,null);
        People alma = new People("Alma", Gender.WOMAN, gabi,peter, address);
        System.out.println(alma);
    }
}
