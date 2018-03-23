package Familie;

public interface IFamilyMember {
    default void introduce(){
        System.out.println("I am just a simply family member");
    };
    boolean isAdult();
    <T> Father[] znajdzOjcow(IFamilyMember familyMembers[]);
}
