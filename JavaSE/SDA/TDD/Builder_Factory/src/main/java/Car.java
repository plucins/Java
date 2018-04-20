public class Car {
    private String owner;
    private Color bodyColor;
    private Body bodyType;
    private Drive driveType;
    private Mark mark;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public Body getBodyType() {
        return bodyType;
    }

    public void setBodyType(Body bodyType) {
        this.bodyType = bodyType;
    }

    public Drive getDriveType() {
        return driveType;
    }

    public void setDriveType(Drive driveType) {
        this.driveType = driveType;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
