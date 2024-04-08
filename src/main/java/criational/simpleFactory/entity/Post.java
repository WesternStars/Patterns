package criational.simpleFactory.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Post {

    private int id;
    private String title;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime postedOn;

}
