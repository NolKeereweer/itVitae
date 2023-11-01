package Monday.QueueExercise;

import java.util.ArrayList;

public class Queue implements QueueInterface{
  ArrayList<Integer> queue = new ArrayList<>(0);

  public void add(int value) {
    queue.add(value);
  }

  public int remove(int index) {
    return queue.remove(index);
  }

  public int peek() {
    return queue.get(0);
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public int size() {
    return queue.size();
  }

  public void print() {
    System.out.println(queue);
  }

  public void clear(int n) {
    queue.clear();
  }

  public void printReverse() {
    String temp = queue.toString();
    StringBuilder reversedQueue = new StringBuilder(temp);
    reversedQueue.reverse();
    System.out.println(reversedQueue);
  }

  public void jumpTheQueue(int n, int value) {
    queue.add(n, value);
  }

  public String toString() {
    return queue.toString();
  }

  public boolean equals(Queue queue) {
    return queue.equals(queue);
  }

  public int indexOf(int value) {
    return queue.indexOf(value);
  }

  public int lastIndexOf(int value) {
    return queue.lastIndexOf(value);
  }
}