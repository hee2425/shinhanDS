package com.shinhan.day08;

public class Container2<K,V> {
	K key;
	V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
}
