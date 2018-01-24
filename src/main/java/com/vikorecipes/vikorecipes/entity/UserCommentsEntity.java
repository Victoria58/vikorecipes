package com.vikorecipes.vikorecipes.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "user_comments", schema = "public", catalog = "ViKoReciPeS")
public class UserCommentsEntity {
    private int id;
    private String textComment;
    private Time dateComment;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text_comment", nullable = false, length = -1)
    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    @Basic
    @Column(name = "date_comment", nullable = false)
    public Time getDateComment() {
        return dateComment;
    }

    public void setDateComment(Time dateComment) {
        this.dateComment = dateComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCommentsEntity that = (UserCommentsEntity) o;
        return id == that.id &&
                Objects.equals(textComment, that.textComment) &&
                Objects.equals(dateComment, that.dateComment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, textComment, dateComment);
    }
}
