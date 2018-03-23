package Zadanie7;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Programmer {
    Person person;
    List<String> languagesList;

    public Programmer() {
    }

    public Programmer(Person person, List<String> languagesList) {
        this.person = person;
        this.languagesList = languagesList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(List<String> languagesList) {
        this.languagesList = languagesList;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "person=" + person +
                ", languagesList=" + languagesList +
                '}';
    }

    public List<Programmer> maleProgrammer(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale())
                .collect(Collectors.toList());
    }

    public List<Programmer> cobolMinor(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getLanguagesList().
                contains("Cobol")).collect(Collectors.toList());
    }

    public List<Programmer> moreThanOneLanguage(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getLanguagesList().size() > 1)
                .collect(Collectors.toList());
    }

    public List<Programmer> famaleWhosWriteInJavaAndCpp(List<Programmer> programmers){
        return programmers.stream().filter(u -> !u.getPerson().isMale()).
                filter(u -> u.getLanguagesList().contains("Java") && u.getLanguagesList().contains("Cpp"))
                .collect(Collectors.toList());
    }

    public List<String> getMaleNames(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale())
                .map(u -> u.getPerson().getName())
                .collect(Collectors.toList());
    }

    public Set<String> getAllLanguages(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale())
                .map(u -> u.getPerson().getName())
                .collect(Collectors.toSet());
    }

    public List<String> getLastNameProgrammersWithMoreThanTwoLanguages(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.languagesList.size() > 2)
                .map(u -> u.getPerson().getLastName())
                .collect(Collectors.toList());
    }

    public boolean isExistAnyPersonWhosDoesnyKnowAnyLanguage(List<Programmer> programmers){
        return programmers.stream().anyMatch(u -> u.getLanguagesList().size() == 0);
    }

    public int  getAllLanguagesKnownByFamales(List<Programmer> programmers){
        return programmers.stream().filter(u -> !u.getPerson().isMale())
                    .mapToInt(u -> u.getLanguagesList().size()).sum();
    }
}
