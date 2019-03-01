public static void main(String[] args) {
        //冒泡排序
        int[] arr = {1, 3, 11, 2, 44, 9};
        System.out.println("排序之前数组：");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {    //外层控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {  //内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序之后的数组：");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }