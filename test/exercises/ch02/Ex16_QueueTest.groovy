package exercises.ch02

queue = new Ex16_Queue()
queue.add("anita")
queue.add("belinda")
queue.add('claire')
println(queue.remove())
println(queue.remove())
println(queue.remove())
println(queue.remove())
queue.add('debbie')
queue.add('ella')
queue.add('fiona')
println(queue.remove())
println(queue.remove())
println(queue.remove())
println(queue.remove())
println(queue.remove())

println("\nITERATING...")
Ex16_Queue.MyIterator it = queue.iterator()
println(it.hasNext())
queue.add("anita")
it = queue.iterator()
println(it.hasNext())
println(it.next())
queue.remove()
queue.add("belinda")
queue.add('claire')
queue.add('debbie')
queue.add('ella')
queue.add('fiona')
it = queue.iterator()
println("PRINT QUEUE...")
for (String n : queue) {
    print(n + " ")
}
println()
println(it.hasNext())
println(it.next())
println(it.hasNext())
println(it.next())
println(it.hasNext())
if (it.hasNext()) println(it.next())
try {
    println(it.next())
}
catch (NoSuchElementException ex) {
    println("Ooh dear - NoSuchElementException")
}

println()