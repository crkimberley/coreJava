package exercises.ch02

p = new Ex08_PointWithHelpFromIDE(3, 4)
println(p)
println(p.translate(1, 3).scale(0.5))

q = new Ex08_PointWithHelpFromIDE(3, 4);
println(q)
q.translateMutate(1, 3)
q.scaleMutate(0.5)
println(q)