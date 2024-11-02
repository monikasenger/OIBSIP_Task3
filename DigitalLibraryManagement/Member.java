package DigitalLibraryManagement;

public class Member {
	String memberId;
    String name;
    String email;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberID:-> " + memberId + ", Name:-> " + name + ", Email:-> " + email;
    }
}