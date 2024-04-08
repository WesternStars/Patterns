package criational.simpleFactory;

import criational.simpleFactory.entity.Post;

public class SimpleFactoryStarter {
    public static void main(String[] args) {
        Post newspost = SimplePostFactory.create("news");
        System.out.println(newspost);
        Post prodpost = SimplePostFactory.create("product");
        System.out.println(prodpost);
        Post blogpost = SimplePostFactory.create("blog");
        System.out.println(blogpost);
        Post errorpost = SimplePostFactory.create("error");
        System.out.println(errorpost);
    }
}
