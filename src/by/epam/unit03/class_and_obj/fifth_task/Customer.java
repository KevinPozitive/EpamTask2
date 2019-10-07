package by.epam.unit03.class_and_obj.fifth_task;

public class Customer {
    private int id;
    private String secondName;
    private String name;
    private String thirdName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    protected Customer(int id, String secondName, String name, String thirdName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.thirdName = thirdName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    protected void setId(int id) {
        this.id = id;
    }
    protected void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
    protected void setAddress(String address) {
        this.address = address;
    }
    protected void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    protected void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    protected int getId() {
        return id;
    }
    protected String getSecondName() {
        return secondName;
    }
    protected String getName() {
        return name;
    }
    protected String getThirdName() {
        return thirdName;
    }
    protected String getAddress() {
        return address;
    }
    protected int getCreditCardNumber() {
        return creditCardNumber;
    }
    protected int getBankAccountNumber() {
        return bankAccountNumber;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
