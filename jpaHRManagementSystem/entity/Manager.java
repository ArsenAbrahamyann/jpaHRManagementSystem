package jpaHRManagementSystem.entity;

import jpaHRManagementSystem.ManagementLevel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;

@Entity
public class Manager extends Employee {
    private String managedDepartment;
    @Enumerated(EnumType.STRING)
    private ManagementLevel managementLevel;

    public Manager() {
    }

    public String getManagedDepartment() {
        return managedDepartment;
    }

    public void setManagedDepartment(String managedDepartment) {
        this.managedDepartment = managedDepartment;
    }

    public ManagementLevel getManagementLevel() {
        return managementLevel;
    }

    public void setManagementLevel(ManagementLevel managementLevel) {
        this.managementLevel = managementLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(managedDepartment, manager.managedDepartment) && managementLevel == manager.managementLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managedDepartment, managementLevel);
    }

    @Override
    public String toString() {
        return "Manager{" +
               "managedDepartment='" + managedDepartment + '\'' +
               ", managementLevel=" + managementLevel +
               '}';
    }
}
