package by.epam.unit03.class_and_obj.first_task;

public class Student {
    private String surname;
    private String initials;
    private int numbOfGroup;
    private int[]progress;// = new int[5];

    protected Student(){
        progress = new int[5];
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }
    protected void setInitials(String initials) {
        this.initials = initials;
    }
    protected void setNumbOfGroup(int numbOfGroup) {
        this.numbOfGroup = numbOfGroup;
    }
    protected void setProgress(int[] progress) {
            this.progress = progress;
    }

    protected String getSurname() {
        return surname;
    }
    protected String getInitials() {
        return initials;
    }
    protected int getNumbOfGroup() {
        return numbOfGroup;
    }
    protected int[] getProgress() {
        return progress;
    }

}