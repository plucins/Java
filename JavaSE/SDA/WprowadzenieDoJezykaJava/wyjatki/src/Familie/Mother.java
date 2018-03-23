package Familie;

public class Mother implements IFamilyMember {

    @Override
    public void introduce() {
        System.out.println("i am Mother");
    }

    @Override
    public boolean isAdult() {
        return true;
    }

    @Override
    public <T> Father[] znajdzOjcow(IFamilyMember familyMembers[]){
        Father[] fathers = new Father[familyMembers.length];
        for(int i = 0; i < familyMembers.length;i++){
            if(familyMembers[i] instanceof Father){
                fathers[i] = (Father)familyMembers[i];
            }
        }
        return fathers;
    }
}
