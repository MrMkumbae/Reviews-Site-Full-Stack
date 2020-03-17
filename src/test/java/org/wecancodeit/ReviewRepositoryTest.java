package org.wecancodeit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

public class ReviewRepositoryTest {

	@Resource
	private ReviewRepository undertest;
	
	@Test
	public void shouldFindOneReview() {
		Review oneReview = new Review(1,"","","","","","");
		undertest = new ReviewRepository(oneReview);
		Review foundReview = undertest.findOneReview(oneReview.getId());
		
		assertEquals(foundReview, oneReview);
	}
	
	@Test
	public void shouldFindReviewTwo() {
		Review oneReview = new Review(1,"","","","","","");
		Review twoReview = new Review(2,"","","","","","");
		undertest = new ReviewRepository(oneReview, twoReview);
		Review foundReview = undertest.findOneReview(twoReview.getId());
		
		assertEquals(foundReview, twoReview);
	}
	
	@Test
	public void shouldFindAllReviews() {
		Review oneReview = new Review(1,"","","","","","");
		Review twoReview = new Review(2,"","","","","","");
		
		undertest = new ReviewRepository(oneReview, twoReview);
		Collection<Review> foundAll = undertest.findAllReviews();
		int size = 2;
		
		assertEquals(foundAll.size(), 2);
	}
	
	
	
}
