package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data //상위 어노테이션
@AllArgsConstructor
@ToString  //toString 오버라이드
@EqualsAndHashCode (of= {"kind"}) //주소가 아닌 내용(kind만) 비교
@Getter
@Setter
public class Product<T,M> {//제네릭스 관례 : 대문자 한개
	T kind;
	M model;
}
