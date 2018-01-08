package exercises.ch06.ex09

import static exercises.ch06.ex09.Arrays.*;

ArrayList<String> strings = java.util.Arrays.asList("alison", "beth", "claire", "debbie")
println(firstLast(strings))
strings.add("ella")
println(firstLast(strings))
ArrayList<String> strings2 = java.util.Arrays.asList("piglet")
println(firstLast(strings2))
println()
ArrayList<String> strings3 = java.util.Arrays.asList("claire", "alison", "debbie", "fiona", "beth")
println(min(strings3))
println(max(strings3))
println(minMax(strings3))