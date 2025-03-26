package com.bd2.proj.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "steam_games")
public class SteamGameModel {
    
    @Field("_id")
    private ObjectId id;

    @Field("AppID")
    private int appID;

    @Field("Name")
    private String name;

    @Field("Release date")
    private String releaseDate;

    @Field("Estimated owners")
    private String estimatedOwners;

    @Field("Peak CCU")
    private int peakCCU;

    @Field("Required age")
    private int requiredAge;

    @Field("Price")
    private double price;

    @Field("DLC count")
    private int dlcCount;

    @Field("About the game")
    private String aboutTheGame;

    @Field("Supported languages")
    private List<String> supportedLanguages;

    @Field("Full audio languages")
    private List<String> fullAudioLanguages;

    @Field("Reviews")
    private String reviews;

    @Field("Header image")
    private String headerImage;

    @Field("Website")
    private String website;

    @Field("Support url")
    private String supportUrl;

    @Field("Support email")
    private String supportEmail;

    @Field("Windows")
    private boolean windows;

    @Field("Mac")
    private boolean mac;

    @Field("Linux")
    private boolean linux;

    @Field("Metacritic score")
    private int metacriticScore;

    @Field("Metacritic url")
    private String metacriticUrl;

    @Field("User score")
    private int userScore;

    @Field("Positive")
    private int positiveReviews;

    @Field("Negative")
    private int negativeReviews;

    @Field("Score rank")
    private String scoreRank;

    @Field("Achievements")
    private int achievements;

    @Field("Recommendations")
    private int recommendations;

    @Field("Notes")
    private String notes;

    @Field("Average playtime forever")
    private int averagePlaytimeForever;

    @Field("Average playtime two weeks")
    private int averagePlaytimeTwoWeeks;

    @Field("Median playtime forever")
    private int medianPlaytimeForever;

    @Field("Median playtime two weeks")
    private int medianPlaytimeTwoWeeks;

    @Field("Developers")
    private String developers;

    @Field("Publishers")
    private String publishers;

    @Field("Categories")
    private String categories;

    @Field("Genres")
    private String genres;

    @Field("Tags")
    private String tags;

    @Field("Screenshots")
    private List<String> screenshots;

    @Field("Movies")
    private String movies;

    // Getters and Setters

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getEstimatedOwners() {
        return estimatedOwners;
    }

    public void setEstimatedOwners(String estimatedOwners) {
        this.estimatedOwners = estimatedOwners;
    }

    public int getPeakCCU() {
        return peakCCU;
    }

    public void setPeakCCU(int peakCCU) {
        this.peakCCU = peakCCU;
    }

    public int getRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(int requiredAge) {
        this.requiredAge = requiredAge;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDlcCount() {
        return dlcCount;
    }

    public void setDlcCount(int dlcCount) {
        this.dlcCount = dlcCount;
    }

    public String getAboutTheGame() {
        return aboutTheGame;
    }

    public void setAboutTheGame(String aboutTheGame) {
        this.aboutTheGame = aboutTheGame;
    }

    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(List<String> supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    public List<String> getFullAudioLanguages() {
        return fullAudioLanguages;
    }

    public void setFullAudioLanguages(List<String> fullAudioLanguages) {
        this.fullAudioLanguages = fullAudioLanguages;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isMac() {
        return mac;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    public int getMetacriticScore() {
        return metacriticScore;
    }

    public void setMetacriticScore(int metacriticScore) {
        this.metacriticScore = metacriticScore;
    }

    public String getMetacriticUrl() {
        return metacriticUrl;
    }

    public void setMetacriticUrl(String metacriticUrl) {
        this.metacriticUrl = metacriticUrl;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getPositiveReviews() {
        return positiveReviews;
    }

    public void setPositiveReviews(int positiveReviews) {
        this.positiveReviews = positiveReviews;
    }

    public int getNegativeReviews() {
        return negativeReviews;
    }

    public void setNegativeReviews(int negativeReviews) {
        this.negativeReviews = negativeReviews;
    }

    public String getScoreRank() {
        return scoreRank;
    }

    public void setScoreRank(String scoreRank) {
        this.scoreRank = scoreRank;
    }

    public int getAchievements() {
        return achievements;
    }

    public void setAchievements(int achievements) {
        this.achievements = achievements;
    }

    public int getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(int recommendations) {
        this.recommendations = recommendations;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getAveragePlaytimeForever() {
        return averagePlaytimeForever;
    }

    public void setAveragePlaytimeForever(int averagePlaytimeForever) {
        this.averagePlaytimeForever = averagePlaytimeForever;
    }

    public int getAveragePlaytimeTwoWeeks() {
        return averagePlaytimeTwoWeeks;
    }

    public void setAveragePlaytimeTwoWeeks(int averagePlaytimeTwoWeeks) {
        this.averagePlaytimeTwoWeeks = averagePlaytimeTwoWeeks;
    }

    public int getMedianPlaytimeForever() {
        return medianPlaytimeForever;
    }

    public void setMedianPlaytimeForever(int medianPlaytimeForever) {
        this.medianPlaytimeForever = medianPlaytimeForever;
    }

    public int getMedianPlaytimeTwoWeeks() {
        return medianPlaytimeTwoWeeks;
    }

    public void setMedianPlaytimeTwoWeeks(int medianPlaytimeTwoWeeks) {
        this.medianPlaytimeTwoWeeks = medianPlaytimeTwoWeeks;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<String> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

}
