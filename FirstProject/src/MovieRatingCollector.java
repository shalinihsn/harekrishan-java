import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MovieRatingCollector {

    
    
    public static class RatingCollectorImpl implements RatingCollector {
        @Override
        public void putNewRating(String movie, double rating) {
            RatingFeed rf = new RatingFeed(movie,rating);
            System.out.println("Hashmap  "+rf.getMap());
        }

        @Override
        public double getAverageRating(String movie) {
        HashMap<String,RatingFeed> hm= (HashMap<String, RatingFeed>) RatingFeed.getMap(); 
        if(hm.containsKey(movie))
        {
        	List<Double> ratingList= hm.get(movie).getRating();
        	double sum=0;
        	
        	for(Double d: ratingList)
        	{
        		sum=sum+d;
        	}
        	
        	System.out.println("sum is "+sum);
        	double avg=sum/ratingList.size();
        	System.out.println("average "+avg);
        	return avg;
        }
        else return 0.0;
        }

        @Override
        public int getRatingCount(String movie) {

        	HashMap<String,RatingFeed> hm= (HashMap<String, RatingFeed>) RatingFeed.getMap(); 
            if(hm.containsKey(movie))
            {
            	List<Double> ratingList= hm.get(movie).getRating();
            	return ratingList.size();
            }
            return 0;
        }
    }

    
    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}

class RatingFeed
{
    private String movieName;
    private List<Double> rating= new ArrayList<Double>()
    		;
    private static Map<String,RatingFeed> map= new HashMap<String,RatingFeed>();
    
    

public RatingFeed(String moviename, double rating)
{
			this.movieName=moviename;
			if (map.size() > 0 && map.containsKey(this.movieName)) 
			{

					RatingFeed rf = map.get(this.movieName);
					rf.rating.add(rating);
					this.map.put(moviename, rf);
			} 
				else 
				{
					this.rating.add(rating);
					this.map.put(moviename, this);
				}
}
			


		
		 




public String toString()
{
  return "movieName : "+movieName+"  Rating List : "+rating;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public List<Double> getRating() {
	return rating;
}

public void setRating(List<Double> rating) {
	this.rating = rating;
}

public static Map<String, RatingFeed> getMap() {
	return map;
}

public static void setMap(Map<String, RatingFeed> map) {
	RatingFeed.map = map;
}
}
