package org.example.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(name = "release_year")
    private int releaseYear;

    @Column
    private int duration;

    @Column(length = 1000)
    private String synopsis;

    @Column
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "director_id" , nullable = false)
    @JsonBackReference
    private Director director;
    @ManyToOne
    @JoinColumn(name = "category_id" , nullable = false)
    @JsonBackReference
    private Category category;


    public Film () {}

    public Film(String title, int releaseYear, int duration, String synopsis, Double rating , Director director , Category category) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.synopsis = synopsis;
        this.rating = rating;
        this.director = director;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                ", synopsis='" + synopsis + '\'' +
                ", rating=" + rating +
                '}';
    }
}
