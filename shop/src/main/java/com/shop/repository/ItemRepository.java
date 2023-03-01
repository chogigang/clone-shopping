package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> {

    //ItemNm으로 데이터를 조회하시 위해서 By뒤에 필드명인 ItemNM을 메소드의 이름에 붙여줍니다.
List<Item> findByItemNm(String itemNm);

//상품을 상품명과 상품 상세 설명을 OR 조건을 이용하여 조회하는 쿼리 메소드
List<Item> findByItemNmOrItemDetail(String itemNm,String itemDetail);



//파라미터로 넘어온 price 변수보다 값이 작은 상품 데이터를 조회하는 쿼리 메소드 입니다.
List<Item>  findByPriceLessThan(Integer price);




//내림차순  OrderBy +속성명+Desc 키둬드를 이용해 데이터의 순서를 처리할수 있다 상품의 가격이 높은 순으로 조회하는 예제
    List<Item>  findByPriceLessThanOrderByPriceDesc(Integer price);



}


/* <S extends T> save(S entity) //엔티티 저장 및 수정
    void delete(T entity)//엔티티 삭제
    count()//엔티티 총 개수 변환
    Integer<T> findAll()//모든 엔티티 조회
* */