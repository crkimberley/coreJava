package exercises.ch04.ex01

p1 = new Point(1.1, 2.2)
p2 = new Point(3.3, 4.4)
println(p1)
println(p2)

lp1 = new LabelledPoint("lp1", 5.5, 6.6)
lp2 = new LabelledPoint("lp2", 7.7, 8.8)
println(lp1)
println(lp2)

p1a = new Point(1.1, 2.2)
println("p1 equals p1a?\t" + p1.equals(p1a))
println("p1 == p1a?\t" + (p1 == p1a))
println("p1 equals p2?\t" + p1.equals(p2))

lp1a = new LabelledPoint("lp1", 5.5, 6.6)
println("lp1 equals lp1a?\t" + lp1.equals(lp1a))
println("lp1 == lp1a?\t" + (lp1 == lp1a))
println("lp1 equals lp2?\t" + lp1.equals(lp2))

println(p1.x)


