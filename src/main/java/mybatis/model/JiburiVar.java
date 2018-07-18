package mybatis.model;


public class JiburiVar {

    int id;
    String movie_name;
    int year_made;
    int active_id;

    public JiburiVar(int id, String movie_name,int year_made){

        this.id = id;
        this.movie_name = movie_name;
        this.year_made = year_made;
    }

    public JiburiVar(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_name() { return movie_name; }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getYear_made() {
        return year_made;
    }

    public void setYear_made(int year_made) {
        this.year_made = year_made;
    }

    public int getActive_id() {return active_id;}

    public void setActive_id() { this.active_id = active_id;}


}
