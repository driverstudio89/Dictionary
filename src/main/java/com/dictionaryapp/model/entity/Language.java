package com.dictionaryapp.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private LanguageEnum name;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "language")
    private Set<Word> words;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LanguageEnum getName() {
        return name;
    }

    public void setName(LanguageEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Word> getWords() {
        return words;
    }

    public void setWords(Set<Word> words) {
        this.words = words;
    }


}
