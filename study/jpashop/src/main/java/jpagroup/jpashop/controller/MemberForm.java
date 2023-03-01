package jpagroup.jpashop.controller;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {

    @NotNull
    private String name;
    private String city;
    private String street;
    private String zipcode;


}
