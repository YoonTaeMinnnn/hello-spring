package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable               //jpa의 내장타입
@Getter
public class Address {
    private String city;

    private String street;

    private String zipcode;

    protected Address(){       //protected 로 생성자 생성 => jpa 기본 규약(값 변경이 불가능하게 만들어야함)

    }

    public Address(String city,String street,String zipcode){
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }
}
