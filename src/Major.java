import com.aluraone.screenmatch.calculation.RecommendationFilter;
import com.aluraone.screenmatch.calculation.TimeCalculator;
import com.aluraone.screenmatch.modelos.Episode;
import com.aluraone.screenmatch.modelos.Movie;
import com.aluraone.screenmatch.modelos.Season;

public class Major {

    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("Encanto");
        myMovie.setReleaseDate(2021);
        myMovie.setDuration(180);
        myMovie.setIncludedInThePlan(true);

        myMovie.showTechnicalSheet();
        myMovie.evaluate(7.8);
        myMovie.evaluate(10);


        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.calculateAverage());

        Season casaDragon = new Season();
        casaDragon.setName("La casa del tragon");
        casaDragon.setReleaseDate(2020);
        casaDragon.setSeasons(1);
        casaDragon.setMinutesPerEpisode(177);
        casaDragon.setEpisodeBySeason(10);
        casaDragon.showTechnicalSheet();
        System.out.println(casaDragon.getDuration());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Matrix");
        anotherMovie.setReleaseDate(1997);
        anotherMovie.setDuration(170);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.incluided(myMovie);
        timeCalculator.incluided(casaDragon);
        System.out.println(timeCalculator.getTotalTime() + " minutes");

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Another chapter");
        episode.setSeason(casaDragon);
        episode.setViews(100);

        recommendationFilter.filter(episode);





    }
}
