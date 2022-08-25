package johnny.gamestore.springboot.paging;

import lombok.Builder;
import lombok.Getter;
import java.io.Serializable;

@Getter
@Builder
public class Pagination implements Serializable {
  private String previous;

  private String next;

  private Long totalCount;
}
