public class Main {

    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek(true, 81.5),
                new Clovek(false, 60.1),
                new Clovek(false, 62.0),
                new Clovek(true, 92.4)};
        sortArr(arr);
        for (Clovek c:arr) {
            System.out.println(c);
        }

    }
    static void sortArr(Clovek[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1].isMale == arr[j].isMale){
                    if(arr[j-1].vaha > arr[j].vaha){
                        Clovek x = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = x;
                    }
                else {
                    if (arr[j-1].isMale == true && arr[j].isMale == false) {
                        Clovek y = arr[j -1];
                        arr[j-1] = arr[j];
                        arr[j] = y;
                        }
                    }
                }
            }
        }
    }
}