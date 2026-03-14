package ua.university;

import java.util.Objects;

public final class Email {
    private final String emailTxt;

    public Email(String emailTxt) {
        if (emailTxt == null || !emailTxt.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.emailTxt = emailTxt;
    }

    public String value() {return emailTxt;}

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Email email = (Email) o;
        return Objects.equals(emailTxt, email.emailTxt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailTxt);
    }
    @Override
    public String toString() {return emailTxt;}
}
