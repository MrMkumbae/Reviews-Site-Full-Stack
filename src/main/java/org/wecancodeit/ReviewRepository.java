package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {
	
	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "Inter Comeback", "images/derby.jpg", "Sports", "Milan complete a comeback to secure 3 points", "02/10/2020", "Goals in the second half saw Inter come back from 2-0 down to win 4-2");
	private Review reviewTwo = new Review(2L, "Corona Virus Spread", "images/coronavirus.jpg", "Diseases", "Death toll by Coronavirus increase", "02/09/2020", "Corona virus keeps on killing more and more people as the death toll rises");
	private Review reviewThree = new Review(3L, "Flying Car", "images/flyingcar.jpg", "Tech", "Flying car introduced in the show case", "11/1/2018", "How close are we to start using flying cars and what are the dangers of them");
	private Review reviewFour = new Review(4L, "Kobe Memorial", "images/kobegigi.jpg", "Sport", "Kobe Memorial date set for 02/24", "02/08/2020", "This comes from combining both Kobe's and Gigi's number");
	
	public ReviewRepository() {
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
		reviewList.put(reviewThree.getId(), reviewThree);
		reviewList.put(reviewFour.getId(), reviewFour);
	}
	
	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
			reviewList.put(review.getId(), review);
		}
	}
	
	public Review findOneReview(long id) {
		return reviewList.get(id);
	}
	
	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
