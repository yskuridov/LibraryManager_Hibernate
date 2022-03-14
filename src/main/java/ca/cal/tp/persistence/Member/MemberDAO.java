package ca.cal.tp.persistence.Member;

public interface MemberDAO {
    <T> void save(T t);
    <T> void merge(T t);
}
