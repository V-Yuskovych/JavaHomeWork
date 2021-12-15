package com.pb.yuskovych.hw11and12;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    private String name;
    private LocalDate dateBirthday;
    private int[] phone;
    private String address;
    private String dateEdit;

    public Person(String name, LocalDate dateBirthday, int[] phone, String address, String dateEdit) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phone = phone;
        this.address = address;
        this.dateEdit = dateEdit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public int[] getPhone() {
        return phone;
    }

    public void setPhone(int[] phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(String dateEdit) {
        this.dateEdit = dateEdit;
    }

    @Override
    public String toString() {
        return "PhoneBooks{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", phone=" + Arrays.toString(phone) +
                ", address='" + address + '\'' +
                ", dateEdit='" + dateEdit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person that = (Person) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getDateBirthday() != null ? !getDateBirthday().equals(that.getDateBirthday()) : that.getDateBirthday() != null)
            return false;
        if (!Arrays.equals(getPhone(), that.getPhone())) return false;
        if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) return false;
        return getDateEdit() != null ? getDateEdit().equals(that.getDateEdit()) : that.getDateEdit() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDateBirthday() != null ? getDateBirthday().hashCode() : 0);
        result = 31 * result + Arrays.hashCode(getPhone());
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getDateEdit() != null ? getDateEdit().hashCode() : 0);
        return result;
    }
}