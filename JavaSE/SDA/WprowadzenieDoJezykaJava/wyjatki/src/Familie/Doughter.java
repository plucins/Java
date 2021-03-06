package Familie;

public class Doughter implements IFamilyMember {

    @Override
    public void introduce() {
        System.out.println("I am Doughter");
    }

    @Override
    public boolean isAdult() {
        return false;
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
