package com.theironyard.snakes.models;

import javax.persistence.*;

@Entity
@Table(name = "snakes")
public class Snake {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column
    private Integer id;

    @Column
    private int length;

    @Column
    private boolean isPoisonous;

    @Column
    private boolean livesInTree;

    public Snake() {
    }

    public Snake(int length, boolean isPoisonous, boolean livesInTree) {
        this.length = length;
        this.isPoisonous = isPoisonous;
        this.livesInTree = livesInTree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public boolean isLivesInTree() {
        return livesInTree;
    }

    public void setLivesInTree(boolean livesInTree) {
        this.livesInTree = livesInTree;
    }

    @Override
    public String toString() {
        return"Snake{" +
                "isPoisonous=" + isPoisonous +
                ", livesInTree=" + livesInTree +
                ", length=" + length +
                ", id=" + id +
                '}';
    }
}
