// Circular Queue implementation in Java

public class CircularQueue {
  int SIZE = 5; // Size of Circular Queue
  int front, rear;
  int items[] = new int[SIZE];

  CircularQueue() {
    front = -1;
    rear = -1;
  }

  // Check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // Adding an element
  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear = (rear + 1) % SIZE;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  // Removing an element
  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front == rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front = (front + 1) % SIZE;
      }
      return (element);
    }
  }

  void display() {
    /* Function to display status of Circular Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for (i = front; i != rear; i = (i + 1) % SIZE)
        System.out.print(items[i] + " ");
      System.out.println(items[i]);
      System.out.println("Rear -> " + rear);
    }
  }

  public static void main(String[] args) {

    CircularQueue q = new CircularQueue();

    // Fails because front = -1
    q.deQueue();

    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // Fails to enqueue because front == 0 && rear == SIZE - 1
    q.enQueue(6);

    q.display();

    int elem = q.deQueue();

    if (elem != -1) {
      System.out.println("Deleted Element is " + elem);
    }
    q.display();

    q.enQueue(7);

    q.display();

    // Fails to enqueue because front == rear + 1
    q.enQueue(8);
  }

}
//
package com.myPackage;

class Queue {
	int capacity;
	int front;
	int rear;
	int arr[];

	public Queue(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		front = -1;
		rear = -1;
	}

	public void enqueue(int data) {
		if ((rear + 1) % capacity == front) {
			System.out.println("Stack is full");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % capacity;
			arr[rear] = data;
		}
	}

	public void dequeue() {
		if (rear == -1) {
			System.out.println("Stack is empty");
		}

		else {
			// if there is only single element in stack
			if (front == 0 && rear == 0) {
				front = -1;
				rear = -1;
			}

			front = (front + 1) % capacity;
		}
	}

	public void displayQueue() {
		int i = front;
		while (true) {
			System.out.print(arr[i] + "\t");
			if (i == rear) {
				break;
			}
			i = (i + 1) % capacity;
		}
	}

}

public class CircularQueue {
	public static void main(String args[]) {
		Queue q = new Queue(5);
		q.enqueue(4);
		q.enqueue(8);
		q.enqueue(1);
		q.enqueue(9);
		q.enqueue(3);
		q.dequeue();
		q.displayQueue();
	}

}
