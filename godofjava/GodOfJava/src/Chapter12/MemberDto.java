package Chapter12;

import java.util.Objects;

public class MemberDto {
    public String name;
    public String phone;
    public String email;

    public MemberDto() {}

    public MemberDto(String name) {
        this.name = name;
    }

    public MemberDto(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public MemberDto(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name = " + name + " Phone = " + phone + " Email = " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberDto memberDto)) return false;
        return Objects.equals(name, memberDto.name) && Objects.equals(phone, memberDto.phone) && Objects.equals(email, memberDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
