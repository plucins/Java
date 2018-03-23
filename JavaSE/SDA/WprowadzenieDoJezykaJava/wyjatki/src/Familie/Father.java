package Familie;

public class Father implements IFamilyMember {

    @Override
    public void introduce() {
        System.out.println("I am YOur Father");
    }

    @Override
    public boolean isAdult() {
        return true;
    }

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
