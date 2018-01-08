package exercises.ch02

int[] intArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

List<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

for (int i = 0; i < 100; i++) {
    print(Ex10_RandomNumbers.randomElement(intArray) + "\t")
}

println()

for (int i = 0; i < 100; i++) {
    print(Ex10_RandomNumbers.randomElement(intArrayList) + "\t")
}