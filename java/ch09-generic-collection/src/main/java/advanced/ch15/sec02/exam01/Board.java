package advanced.ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
    private String subject;
    private String content;
    private String writer;

    @Override
    public String toString() {
        return "과목 : " + this.subject + " 제목 : " + this.content + " 작가 : " + this.writer;
    }
}
