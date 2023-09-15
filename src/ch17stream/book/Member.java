package ch17stream.book;

public class Member {
    private String name;
    private String job;
    public Member(String name,String job){
        this.job=job;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }
}
