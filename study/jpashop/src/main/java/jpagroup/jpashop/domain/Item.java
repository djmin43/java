package jpagroup.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

}
