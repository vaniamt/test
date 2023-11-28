public class test {

    public static void main(String[] args) {

        System.out.println(test(123));
        System.out.println(test(123456));
        System.out.println(test(456));
        System.out.println(test(456));
    }
    public static int test(int num) {//порахувати сумму чисел числа
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сума чисел: " + sum);
        return num;
    }

    public static int test1(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void test34(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static int test1(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static int test3(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static boolean test2 (int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int test45(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static double teest(int[] num) {
        if (num == null || num.length == 0) {
            throw new IllegalArgumentException("Масив порожній або не існує");
        }

        int sum = 0;
        for (int elem : num) {
            sum += elem;
        }

        return (double) sum / num.length;
    }
    public static int test75(int a, int b) {
        while (b != 0) {
            int tum = b;
            b = a % b;
            a = tum;
        }
        return a;
    }
    public static int test78(int n) {
        if (n <= 1) {
            return n;
        } else {
            return test78(n - 1) + test78(n - 2);
        }
    }

    public static List<Integer> test77(int[] num) {
        List<Integer> pr = new ArrayList<>();
        Arrays.sort(num);
        int och = 1;

        for (int elem : num) {
            while (elem > och) {
                pr.add(och++);
            }
            och++;
        }

        return pr;
    }
    public static boolean test79(String rad) {
        rad = rad.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int poch = 0;
        int end = rad.length() - 1;

        while (poch < end) {
            if (rad.charAt(poch) != rad.charAt(end)) {
                return false;
            }
            poch++;
            end--;
        }

        return true;
    }
    public static boolean test65(String rad1, String rad2) {
        rad1 = rad1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        rad2 = rad2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] num1 = rad1.toCharArray();
        char[] num2 = rad2.toCharArray();

        Arrays.sort(num1);
        Arrays.sort(num2);

        return Arrays.equals(num1, num2);
    }
    public static List<Integer> test56(int[] num) {
        List<Integer> posl = new ArrayList<>();
        List<Integer> posl1 = new ArrayList<>();

        for (int elem : num) {
            if (posl.isEmpty() || elem > posl.get(posl.size() - 1)) {
                posl.add(elem);
            } else {
                posl = new ArrayList<>();
                posl.add(elem);
            }

            if (posl.size() > posl1.size()) {
                posl1 = new ArrayList<>(posl);
            }
        }

        return posl1;
    }
    public static int test54(int[] num ) {
        if (num == null || num.length < 2) {
        }

        int max = num[1] - num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            int pe = num[i];
            int pr = pe - min;

            if (pr > max) {
                max = pr;
            }

            if (pe < min) {
                min = pe;
            }
        }

        return max;
    }
    public static int test12(int[] num) {
        for (int i = 1; i < num.length - 1; i++) {
            if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
                return num[i];
            }
        }
        return -1;
    }
    static List<Integer> test456(int[] num1, int[] num2) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> rez = new ArrayList<>();

        for (int elem : num1) {
            hs1.add(elem);
        }

        for (int elem : num2) {
            if (hs1.contains(elem)) {
                rez.add(elem);
            }
        }

        return new ArrayList<>(rez);
    }



}


