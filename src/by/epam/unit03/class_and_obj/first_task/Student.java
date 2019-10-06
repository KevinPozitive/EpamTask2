package by.epam.unit03.class_and_obj.first_task;

public class Student {
    private String surname;
    private String initials;
    private int numbOfGroup;
    private int[]progress;// = new int[5];

    Student(){
        progress = new int[5];
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }
    public void setNumbOfGroup(int numbOfGroup) {
        this.numbOfGroup = numbOfGroup;
    }
    public void setProgress(int[] progress) {
            this.progress = progress;
    }

    public String getSurname() {
        return surname;
    }
    public String getInitials() {
        return initials;
    }
    public int getNumbOfGroup() {
        return numbOfGroup;
    }
    public int[] getProgress() {
        return progress;
    }

}