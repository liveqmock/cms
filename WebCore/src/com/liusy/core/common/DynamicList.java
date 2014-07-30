package com.liusy.core.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * <p> Title: 动态List类 </p>
 * 
 * <p> Description: Struts Form 提交 List 辅助类,可以自动生成List中的对象，主要用于提交多行数据。 </p>
 * 
 * <p> Copyright: Copyright (c) 2009-2011 </p>
 * 
 * <p> Company: </p>
 * @author liusy
 * @version 1.2
 */
public class DynamicList<E> implements List<E> {

   private ArrayList<E> al;

   private Class clazz;

   public DynamicList() {
      al = new ArrayList<E>();
      this.clazz = new Object().getClass();
   }

   public DynamicList(int initialCapacity) {
      al = new ArrayList<E>(initialCapacity);
      this.clazz = new Object().getClass();
   }

   public DynamicList(Class clazz) {
      al = new ArrayList<E>();
      this.clazz = clazz;
   }

   public DynamicList(int initialCapacity, Class clazz) {
      al = new ArrayList<E>(initialCapacity);
      this.clazz = clazz;
   }

   public E get(int index) {
      if (al == null)
         al = new ArrayList<E>();
      Object object;

      if (index + 1 > al.size()) {
         int oldSize = al.size();
         for (int i = oldSize; i < index + 1; i++) {
            try {
               object = clazz.newInstance();
               al.add((E) object);
            } catch (Exception ex) {
               return null;
            }
         }
      }
      return al.get(index);
   }

   public boolean isEmpty() {
      return al.isEmpty();
   }

   public void clear() {
      al.clear();
   }

   public Iterator<E> iterator() {
      return al.iterator();
   }

   public int size() {
      return al.size();
   }

   public Object[] toArray() {
      return al.toArray();
   }

   public ListIterator<E> listIterator() {
      return al.listIterator();
   }

   public ListIterator<E> listIterator(int index) {
      return al.listIterator(index);
   }

   public void add(int index, E o) {
      al.add(index, o);
   }

   public boolean add(E o) {
      return al.add(o);
   }

   public boolean addAll(Collection<? extends E> c) {
      return al.addAll(c);
   }

   public boolean addAll(int index, Collection<? extends E> c) {
      return al.addAll(index, c);
   }

   public E set(int index, E element) {
      return (E) al.set(index, element);
   }

   public <T> T[] toArray(T[] a) {
      return al.toArray(a);
   }

   public List<E> subList(int fromIndex, int toIndex) {
      return al.subList(fromIndex, toIndex);
   }

   public boolean contains(Object o) {
      return al.contains(o);
   }

   public boolean containsAll(Collection<?> c) {
      return al.containsAll(c);
   }

   public int indexOf(Object o) {
      return al.indexOf(o);
   }

   public int lastIndexOf(Object o) {
      return al.indexOf(o);
   }

   public E remove(int index) {
      return al.remove(index);
   }

   public boolean remove(Object o) {
      return al.remove(o);
   }

   public boolean removeAll(Collection<?> c) {
      return al.remove(c);
   }

   public boolean retainAll(Collection<?> c) {
      return al.retainAll(c);
   }
}
