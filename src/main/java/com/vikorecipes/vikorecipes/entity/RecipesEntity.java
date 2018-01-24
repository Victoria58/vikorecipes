package com.vikorecipes.vikorecipes.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "recipes", schema = "public", catalog = "ViKoReciPeS")
public class RecipesEntity {
    private int id;
    private String title;
    private String recipes;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "recipes", nullable = false, length = -1)
    public String getRecipes() {
        return recipes;
    }

    public void setRecipes(String recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesEntity that = (RecipesEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, recipes);
    }
}
