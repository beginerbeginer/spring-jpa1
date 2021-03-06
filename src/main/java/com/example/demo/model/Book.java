package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // データの入れ物である「エンティティ（クラス）」であることを指定。
public class Book {
	@Id // エンティティの主キーを設定
	@GeneratedValue // 主キーの値を自動採番します。（データ管理のために、それぞれのデータに固有の番号を与えること）@idアノテーションと一緒に使用する。
	private Long id;

	private String title;
	private String detail;
}