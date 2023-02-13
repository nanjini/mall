package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;

    public OutOfStock(Inventory aggregate){
        super(aggregate);
    }
    public OutOfStock(){
        super();
    }
}
