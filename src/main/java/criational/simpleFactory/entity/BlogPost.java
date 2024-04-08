package criational.simpleFactory.entity;

import lombok.Data;

@Data
public class BlogPost extends Post{

    private String author;
    private String[] tag;

}
