package com.example;


import jakarta.persistence.*;


@Entity
@Table(name = "tournaments")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(name = "game_name", nullable = false)
    private String gameName;

    @Column(nullable = false)
    private String date;

    @Column(name = "prize_pool", nullable = false)
    private double prizePool;

    @Column(nullable = false)
    private String status;  // Example: "Upcoming", "Completed"

    @Column(columnDefinition = "TEXT")
    private String description;

    // ✅ Default Constructor
    public Tournament() {}

    // ✅ Parameterized Constructor
    public Tournament(Integer id, String title, String gameName, String date, double prizePool, String status, String description) {
        this.id = id;
        this.title = title;
        this.gameName = gameName;
        this.date = date;
        this.prizePool = prizePool;
        this.status = status;
        this.description = description;
    }

    // ✅ Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(double prizePool) {
        this.prizePool = prizePool;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ✅ toString() method for debugging
    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", gameName='" + gameName + '\'' +
                ", date=" + date +
                ", prizePool=" + prizePool +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

