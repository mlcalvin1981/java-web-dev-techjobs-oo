package org.launchcode.techjobs_oo;
import java.util.Objects;

public abstract class JobField {
    protected int id;
    protected static int nextId = 1;
    protected String value;

    public JobField() {
        this.id = nextId;
        this.value = "Data not available";
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value.equals("") ? "Data not available" : value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && value.equals(jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
