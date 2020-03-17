In the Review Class I created 7 instance variables and getter methods for each instance variable.

In the ReviewRepository Class, I created a map called rewiewList.
Then I created 4 review objects and added them to the map through the default constructor.
I created 2 methods findOneReview which takes a long and uses it as the key to find the object in the map and returns it.
The other method if findAllReviews which returns a collection of all reviews.

In the ReviewsController class, I mapped /show-reviews which retured the reviews-template while the findAllReviews method was called.
I also mapped /show-single-review which returned a review-template when findOneReview method was called. The review displayed was based on the id.

In reviews-template.html, I used html to display all reviews based on their id's.
In review-template.html, a single review was displayed on the template based on the id used.
