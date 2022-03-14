package ca.cal.tp.persistence.Employee;

public interface EmployeeDAO {
    <T> void save(T t);
    <T> void merge(T t);
}
