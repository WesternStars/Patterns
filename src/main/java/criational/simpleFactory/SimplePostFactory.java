package criational.simpleFactory;

import criational.simpleFactory.entity.BlogPost;
import criational.simpleFactory.entity.NewsPost;
import criational.simpleFactory.entity.Post;
import criational.simpleFactory.entity.ProductPost;

public class SimplePostFactory {

    public static Post create(String type) {
        return switch (type) {
            case "news" -> new NewsPost();
            case "blog" -> new BlogPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Incorrect post type.");
        };
    }

}
