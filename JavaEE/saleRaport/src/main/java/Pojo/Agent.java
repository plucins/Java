package Pojo;

public class Agent {
    private String name;
    private String lastName;
    private String domainLogin;

    public Agent() {
    }

    public Agent(String name, String lastName, String domainLogin) {
        this.name = name;
        this.lastName = lastName;
        this.domainLogin = domainLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDomainLogin(String domainLogin) {
        this.domainLogin = domainLogin;
    }

    public String getDomainLogin() {
        return domainLogin;
    }

    @Override
    public String toString() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase() + " (@"+domainLogin.toLowerCase().trim()+")";
    }
}
