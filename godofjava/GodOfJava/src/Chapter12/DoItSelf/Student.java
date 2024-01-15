package Chapter12.DoItSelf;

public class Student {
    String name;
    String address;
    String phone;
    String email;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        // 여기까지 통과하면 같은 클래스임 -> 형 변환 가능
        Student other = (Student) obj;

        // 이제부터는 인스턴스 변수 같은지 체크
        if (name == null) {
            if (other.name != null) return false;
        } else {
            if (!name.equals(other.name)) return false;
        }

        if (address == null) {
            if (other.address != null) return false;
        } else {
            if (!address.equals(other.address)) return false;
        }

        if (phone == null) {
            if (other.phone != null) return false;
        } else {
            if (!phone.equals(other.phone)) return false;
        }

        if (email == null) {
            if (other.email != null) return false;
        } else {
            if (!email.equals(other.email)) return false;
        }
        
        // 위의 난관을 다 지나쳐 왔다면 진짜 같은거다
        return true;
    }
}
