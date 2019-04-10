package entity;

import java.util.List;

public class Class_ {
    private Integer id;

    private String classname;

    private String describe;

    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Class_{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", describe='" + describe + '\'' +
                ", users=" + users +
                '}';
    }
}