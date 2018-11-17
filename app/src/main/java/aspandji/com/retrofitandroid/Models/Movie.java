package aspandji.com.retrofitandroid.Models;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("vote_average")
    private Double voteAverage;

    public Movie(String overview, String releaseDate, Integer id, String title, Double voteAverage) {
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.id = id;
        this.title = title;
        this.voteAverage = voteAverage;
    }

    public String getOverview() {

        return overview;
    }

    public void setOverview(String overview) {

        this.overview = overview;
    }

    public String getReleaseDate() {

        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {

        this.releaseDate = releaseDate;
    }

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

    public Double getVoteAverage() {

        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {

        this.voteAverage = voteAverage;
    }
}
