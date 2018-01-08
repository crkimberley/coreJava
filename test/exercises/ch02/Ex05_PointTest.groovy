package exercises.ch02

Ex05_Point p = new Ex05_Point(3, 4)
println(p)
println(p.translate(1, 3).scale(0.5))

Ex05_Point q = new Ex05_Point(3, 4);
println(q)
q.translateMutate(1, 3)
q.scaleMutate(0.5)
println(q)