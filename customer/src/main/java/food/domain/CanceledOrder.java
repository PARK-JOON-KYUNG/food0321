package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CanceledOrder extends AbstractEvent {

    private Long id;

    public CanceledOrder(Order aggregate) {
        super(aggregate);
    }

    public CanceledOrder() {
        super();
    }
}
