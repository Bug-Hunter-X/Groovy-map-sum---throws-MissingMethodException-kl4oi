def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def myMap = ["a":1, "b":2, "c":3] 
println myMap.values().sum() //Correct way to sum map values

//Alternative using inject
println myMap.values().inject(0) { acc, value -> acc + value }
