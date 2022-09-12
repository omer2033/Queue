public class Queue {
    private int front , rear, size;
    private Object[] queueArr;

    Queue(int size){
        this.size = size;
        front = rear = 0;
        queueArr = new Object[size];
    }

    public boolean isEmpty(){
        return (front==rear);
    }
    public boolean isFull(){
        return (rear == size);
    }

    public void enqueue(Object data){
        if(isFull()){
            System.out.println("Full queue");
            return;
        }
        queueArr[rear] = data;
        rear += 1;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        for(int i = 0; i< queueArr.length-1; i++){
                queueArr[i] = queueArr[i+1];
            }
        if(rear < size){
            queueArr[rear] = null;
        }
        rear--;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        for(Object element: queueArr){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Queue myQ = new Queue(5);
        myQ.enqueue(5);
        myQ.enqueue(4);
        myQ.display();
        myQ.enqueue("Omer");
        myQ.display();
        myQ.dequeue();
        myQ.display();

    }
}

