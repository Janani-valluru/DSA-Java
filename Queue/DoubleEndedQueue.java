

import java.util.Scanner;

public class DoubleEndedQueue {
    int maxSize = 5; // Maximum size of the queue
    int[] queue = new int[maxSize];
    int front = -1; // Front pointer
    int rear = -1;  // Rear pointer

    public void enqueueFront(int element) {
        if (front == 0 && rear == maxSize - 1 || front == rear + 1) {
            System.out.println("Queue is full");
        } else if (front == -1 && rear == -1) { // Empty queue
            front = 0;
            rear = 0;
            queue[front] = element;
        } else if (front == 0) { // Wrap around
            front = maxSize - 1;
            queue[front] = element;
        } else {
            front--;
            queue[front] = element;
        }
    }

    public void enqueueRear(int element) {
        if (front == 0 && rear == maxSize - 1 || front == rear + 1) {
            System.out.println("Queue is full");
        } else if (front == -1 && rear == -1) { // Empty queue
            front = 0;
            rear = 0;
            queue[rear] = element;
        } else if (rear == maxSize - 1) { // Wrap around
            rear = 0;
            queue[rear] = element;
        } else {
            rear++;
            queue[rear] = element;
        }
    }

    public void deleteFront() {
        if (front == -1 && rear == -1) { // Empty queue
            System.out.println("Queue is empty");
        } else if (front == rear) { // Single element in the queue
            System.out.println(queue[front]);
            front = -1;
            rear = -1;
        } else if (front == maxSize - 1) { // Wrap around
            System.out.println(queue[front]);
            front = 0;
        } else {
            System.out.println(queue[front]);
            front++;
        }
    }

    void deleteRear() {
        if (front == -1 && rear == -1) { // Empty queue
            System.out.println("Queue is empty");
        } else if (front == rear) { // Single element in the queue
            System.out.println(queue[rear]);
            front = -1;
            rear = -1;
        } else if (rear == 0) { // Wrap around
            System.out.println(queue[rear]);
            rear = maxSize - 1;
        } else {
            System.out.println(queue[rear]);
            rear--;
        }
    }

    public void display() {
        int index = front;
        while (true) {
            System.out.print(queue[index] + " ");
            if (index == rear)
                break;
            index = (index + 1) % maxSize; // Move to the next index
        }
        System.out.println();
    }

    public void search(int target) {
        int index = front;
        boolean found = false;
        while (true) {
            if (queue[index] == target) {
                System.out.println("Target found");
                found = true;
                break;
            }
            if (index == rear)
                break;
            index = (index + 1) % maxSize;
        }
        if (!found) {
            System.out.println("Target not found");
        }
    }

    public void sort() {
        for (int i = front; i != rear; i = (i + 1) % maxSize) {
            for (int j = front; j != rear; j = (j + 1) % maxSize) {
                int next = (j + 1) % maxSize;
                if (queue[j] > queue[next]) {
                    int temp = queue[j];
                    queue[j] = queue[next];
                    queue[next] = temp;
                }
            }
        }
        System.out.println("Sorted queue:");
        display();
    }

    public void reverse() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int start = front;
        int end = rear;

        while (start != end && (end + 1) % maxSize != start) {
            int temp = queue[start];
            queue[start] = queue[end];
            queue[end] = temp;

            start = (start + 1) % maxSize;
            end = (end - 1 + maxSize) % maxSize;
        }

        System.out.println("Reversed queue:");
        display();
    }

    public static void main(String[] args) {
        DoubleEndedQueue deque = new DoubleEndedQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enqueue front 2. Enqueue rear 3. Dequeue front 4. Dequeue rear 5. Display 6. Search 7. Sort 8. Reverse");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to add:");
                    int frontItem = scanner.nextInt();
                    deque.enqueueFront(frontItem);
                    break;
                case 2:
                    System.out.println("Enter the item to add:");
                    int rearItem = scanner.nextInt();
                    deque.enqueueRear(rearItem);
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Enter the target:");
                    int target = scanner.nextInt();
                    deque.search(target);
                    break;
                case 7:
                    deque.sort();
                    break;
                case 8:
                    deque.reverse();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
