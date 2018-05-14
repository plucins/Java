package systemAndroid.model;

import java.time.LocalDateTime;

public class Call {
    private int callID;
    private String kierunekRozmowy;
    private LocalDateTime rozpoczecieRozmowy;
    private LocalDateTime zakonczenieRozmowy;

    public Call(int callID, String kierunekRozmowy) {
        this.callID = callID;
        this.kierunekRozmowy = kierunekRozmowy;
    }

    public LocalDateTime getRozpoczecieRozmowy() {
        return rozpoczecieRozmowy;
    }

    public void setRozpoczecieRozmowy(LocalDateTime rozpoczecieRozmowy) {
        this.rozpoczecieRozmowy = rozpoczecieRozmowy;
    }

    public LocalDateTime getZakonczenieRozmowy() {
        return zakonczenieRozmowy;
    }

    public void setZakonczenieRozmowy(LocalDateTime zakonczenieRozmowy) {
        this.zakonczenieRozmowy = zakonczenieRozmowy;
    }

    public int getCallID() {
        return callID;
    }

    public void setCallID(int callID) {
        this.callID = callID;
    }

    public String getKierunekRozmowy() {
        return kierunekRozmowy;
    }

    public void setKierunekRozmowy(String kierunekRozmowy) {
        this.kierunekRozmowy = kierunekRozmowy;
    }
}
