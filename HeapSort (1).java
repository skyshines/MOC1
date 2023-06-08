import java.util.Scanner;
public class HeapSort {
    public static void maxHeapify(int[] arr, int i, int n) {
        int largest  = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if(largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            maxHeapify(arr,largest,n);
        }
    }
    public static void buildMaxHeap(int[] arr, int n) {
        for(int i = n/2-1; i >= 0; i--) {
            maxHeapify(arr,i,n);
        }
    }
    public static void minHeapify(int[] arr, int i, int n) {
        int smallest  = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l < n && arr[l] < arr[smallest]) {
            smallest = l;
        }
        if(r < n && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if(smallest != i) {
            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
            minHeapify(arr,smallest,n);
        }
    }
    public static void buildMinHeap(int[] arr, int n) {
        for(int i = n/2-1; i >= 0; i--) {
            minHeapify(arr,i,n);
        }
    }
    public static void maxhs(int[] arr, int n) {
        for(int i = n-1; i > 0; i--) {
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            maxHeapify(arr,0,i);
        }
    }
    public static void minhs(int[] arr, int n) {
        for(int i = n-1; i > 0; i--) {
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            minHeapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        System.out.println("\n*****************HEAP SORT PROGRAM*****************\n");
        Scanner scanner = new Scanner(System.in);
        int ch = 0;
        int[] arr = null;
        int n = 0;
        while(ch != 5) {
            System.out.println("\nMENU:\n1. INPUT ARRAY\n2. BUILD MAX HEAP\n3. MAX HEAP SORT\n4. DISPLAY ELEMENTS\n6. BUILD MIN HEAP\n7. MIN HEAP SORT\n");
            System.out.println("ENTER CHOICE: ");
            ch = scanner.nextInt();
            switch(ch) {
                case 1: {
                    System.out.println("ENTER THE NO. OF ELEMENTS: ");
                    n = scanner.nextInt();
                    System.out.println("ENTER ARRAY: ");
                    arr = new int[n];
                    for(int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    break;
                }
                case 2: {
                    buildMaxHeap(arr,n);
                    break;
                }
                case 3: {
                    maxhs(arr,n);
                    break;
                }
                case 4: {
                    for(int i = 0; i < n; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    buildMinHeap(arr, n);
                    break;
                }
                case 7: {
                    minhs(arr,n);
                    break;
                }
            }
        }
        scanner.close();

    }
}