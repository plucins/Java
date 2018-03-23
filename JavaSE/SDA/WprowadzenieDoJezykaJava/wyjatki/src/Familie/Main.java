package Familie;

public class Main {
    public static void main(String[] args) {
        IFamilyMember son = new Son();
        IFamilyMember father = new Father();
        IFamilyMember mother = new Mother();
        IFamilyMember doughter = new Doughter();
        IFamilyMember[] iFamilyMembers = new IFamilyMember[]{son,father,mother,doughter};

        Father[] a = new Father().znajdzOjcow(iFamilyMembers);

        for(IFamilyMember f: father.znajdzOjcow(iFamilyMembers)){
            if(f instanceof Father)
                f.introduce();
        }

        for(IFamilyMember member: iFamilyMembers){
            System.out.print("Czy pelnoletni " + member.isAdult() + " ");
            member.introduce();
        }

    }


}
