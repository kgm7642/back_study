package ch15.sec05.exercise;

public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final String email;
    private final String githubUrl;

    public Student(int id, String name, String email, String githubUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.githubUrl = githubUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    @Override
    public int compareTo(Student o) {
        // 나이 비교
        if (this.id < o.id) {
            return -1; // this가 o보다 앞에 오도록
        } else if (this.id == o.id) {
            return 0;  // 순서 변경 없음
        } else {
            return 1;  // this가 o보다 뒤에 오도록
        }
    }
}
