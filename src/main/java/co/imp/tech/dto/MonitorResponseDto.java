package co.imp.tech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitorResponseDto {
    private List<Document> content;
    private int pageSize;
    private int currentPage;
    private int totalPage;
    private int totalRecord;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Document {
        private Long id;
        private String content;
        private String title;
    }
}
