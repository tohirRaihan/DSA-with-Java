package data_structures.linear_data_structures.queue;

public class CircularQueueWithArray {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;

  public CircularQueueWithArray(int size) {
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println("The CQ is successfully created with size of " + size);
  }

  // isEmpty
  public boolean isEmpty() {
    return topOfQueue == -1;
  }

  // isFull
  public boolean isFull() {
    return (topOfQueue + 1 == beginningOfQueue)
        || (beginningOfQueue == 0 && topOfQueue + 1 == size);
  }

  // enQueue
  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The CQ is full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " in the queue");
    } else {
      if (topOfQueue + 1 == size) {
        topOfQueue = 0;
      } else {
        topOfQueue++;
      }
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " in the queue");
    }
  }

  // deQueue
  public int deQueue() {
    if (isEmpty()) {
      System.out.println("The CQ is empty!");
      return -1;
    } else {
      int result = arr[beginningOfQueue];
      arr[beginningOfQueue] = 0;
      if (beginningOfQueue == topOfQueue) {
        beginningOfQueue = topOfQueue = -1;
      } else if (beginningOfQueue + 1 == size) {
        beginningOfQueue = 0;
      } else {
        beginningOfQueue++;
      }
      return result;
    }
  }

  // peek
  public int peek() {
    if (isEmpty()) {
      System.out.println("The CQ is emtpy");
      return Integer.MIN_VALUE;
    } else {
      return arr[beginningOfQueue];
    }
  }

  // deleteQueue
  public void deleteQueue() {
    arr = null;
    System.out.println("The CQ is successfully deleted!");
  }
}
